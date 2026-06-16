# Weather Dashboard Backend

Spring Boot backend for the weather dashboard project.

## Setup

1. Go to the backend folder:
   ```bash
   cd projects/weather-dashboard/backend
   ```
2. Set your OpenWeatherMap API key in `src/main/resources/application.properties`:
   ```properties
   openweather.api.key=YOUR_OPENWEATHER_API_KEY
   ```
3. Run the app:
   ```bash
   ./mvnw spring-boot:run
   ```
   or
   ```bash
   mvn spring-boot:run
   ```

## APIs

- `GET /api/weather?city={cityName}`
- `GET /api/weather/forecast?city={cityName}`
