import { useMemo, useState } from 'react';
import './App.css';
import SearchBar from './components/SearchBar';
import CurrentWeather from './components/CurrentWeather';
import Forecast from './components/Forecast';

function App() {
  const [city, setCity] = useState('');
  const [weather, setWeather] = useState(null);
  const [forecast, setForecast] = useState([]);
  const [loading, setLoading] = useState(false);
  const [error, setError] = useState('');

  const backendBaseUrl = useMemo(
    () => process.env.REACT_APP_API_BASE_URL || 'http://localhost:8080/api/weather',
    []
  );

  const getDailyForecast = (list = []) => {
    const seen = new Set();
    const days = [];

    for (const item of list) {
      const date = item?.dt_txt?.split(' ')[0];
      if (!date || seen.has(date)) {
        continue;
      }
      seen.add(date);
      days.push(item);
      if (days.length === 5) {
        break;
      }
    }

    return days;
  };

  const fetchWeather = async (cityName) => {
    setLoading(true);
    setError('');

    try {
      const [currentResponse, forecastResponse] = await Promise.all([
        fetch(`${backendBaseUrl}?city=${encodeURIComponent(cityName)}`),
        fetch(`${backendBaseUrl}/forecast?city=${encodeURIComponent(cityName)}`),
      ]);

      const currentData = await currentResponse.json();
      const forecastData = await forecastResponse.json();

      if (!currentResponse.ok) {
        throw new Error(currentData.message || 'Failed to fetch current weather');
      }
      if (!forecastResponse.ok) {
        throw new Error(forecastData.message || 'Failed to fetch forecast');
      }

      setWeather(currentData.data);
      setForecast(getDailyForecast(forecastData.data?.list));
    } catch (err) {
      setWeather(null);
      setForecast([]);
      setError(err.message || 'Unable to fetch weather data.');
    } finally {
      setLoading(false);
    }
  };

  const handleSearch = (cityName) => {
    setCity(cityName);
    fetchWeather(cityName);
  };

  return (
    <div className="app-container">
      <h1>Weather Dashboard</h1>
      <SearchBar onSearch={handleSearch} />
      {loading && <p className="status">Loading weather data...</p>}
      {error && <p className="status error">{error}</p>}
      {!loading && !error && weather && (
        <>
          <CurrentWeather city={city} weather={weather} />
          <Forecast forecast={forecast} />
        </>
      )}
    </div>
  );
}

export default App;
