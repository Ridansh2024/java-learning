function Forecast({ forecast }) {
  if (!forecast.length) {
    return null;
  }

  return (
    <section className="card">
      <h2>5-Day Forecast</h2>
      <div className="forecast-grid">
        {forecast.map((item) => {
          const iconCode = item?.weather?.[0]?.icon;
          const iconUrl = iconCode
            ? `https://openweathermap.org/img/wn/${iconCode}.png`
            : null;
          return (
            <div className="forecast-item" key={item.dt}>
              <p>{item.dt_txt?.split(' ')[0]}</p>
              {iconUrl && <img src={iconUrl} alt={item?.weather?.[0]?.description || 'forecast'} />}
              <p>{item?.main?.temp} °C</p>
              <p>{item?.weather?.[0]?.main}</p>
            </div>
          );
        })}
      </div>
    </section>
  );
}

export default Forecast;
