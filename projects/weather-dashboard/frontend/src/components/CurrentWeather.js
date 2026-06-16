function CurrentWeather({ city, weather }) {
  const iconCode = weather?.weather?.[0]?.icon;
  const iconUrl = iconCode
    ? `https://openweathermap.org/img/wn/${iconCode}@2x.png`
    : null;

  return (
    <section className="card">
      <h2>Current Weather in {city}</h2>
      {iconUrl && <img src={iconUrl} alt={weather?.weather?.[0]?.description || 'weather'} />}
      <p>Temperature: {weather?.main?.temp} °C</p>
      <p>Humidity: {weather?.main?.humidity}%</p>
      <p>Wind Speed: {weather?.wind?.speed} m/s</p>
      <p>Condition: {weather?.weather?.[0]?.description}</p>
    </section>
  );
}

export default CurrentWeather;
