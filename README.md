# Kotlin Template

This is a starter template for a Kotlin-based Spring Boot application with CI/CD and non-prod deployment setup.

## Features
- Kotlin with Spring Boot
- Simple REST API
- Unit Testing with JUnit
- CI/CD pipeline with GitHub Actions
- Docker and Kubernetes deployment (Helm charts for non-prod)

## Usage
1. Clone the repository
2. Build the project:
   ```
   ./gradlew build
   ```
3. Run tests:
   ```
   ./gradlew test
   ```
4. Run the application locally:
   ```
   ./gradlew bootRun
   ```
5. To deploy to Kubernetes:
   ```
   kubectl apply -f helm/chart/templates/deployment.yaml
   ```

## License
MIT License
