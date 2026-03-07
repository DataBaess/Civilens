# Backend Workspace

The backend is organized as separate services under `backend/services`.

## Services

- `backend/services/civilens-api`: Spring Boot API (Java/Maven)
- `backend/services/scheme-engine`: Node.js scheme detection/matching engine

## Run Each Service

### Spring Boot API

```bash
cd backend/services/civilens-api
./mvnw spring-boot:run
```

### Scheme Engine

```bash
cd backend/services/scheme-engine
npm install
node server.js
```
