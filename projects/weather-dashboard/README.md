# Weather Dashboard

A full-stack learning project with Spring Boot backend and React frontend.

## Structure

```
projects/weather-dashboard/
├── backend/
└── frontend/
```

## Run Backend

```bash
cd projects/weather-dashboard/backend
mvn spring-boot:run
```

## Run Frontend

```bash
cd projects/weather-dashboard/frontend
npm install
npm start
```

The frontend calls backend endpoints:
- `GET /api/weather?city={cityName}`
- `GET /api/weather/forecast?city={cityName}`
