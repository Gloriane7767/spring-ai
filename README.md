# Spring AI

A Spring Boot application that exposes a simple REST API for chatting with an OpenAI model through Spring AI.

## Features

- Spring Boot 4 application
- Spring AI integration with OpenAI
- REST endpoint for simple chat prompts
- Maven build with an included Maven Wrapper
- Java 25

## Prerequisites

- JDK 25 or newer
- An OpenAI API key

## Configuration

Set your OpenAI API key as an environment variable:

```bash
export OPENAI_API_KEY="your-api-key"
```

On Windows PowerShell:

```powershell
$env:OPENAI_API_KEY="your-api-key"
```

The application configuration is in `src/main/resources/application.yml`. It uses:

- Model: `gpt-4o`
- Maximum retry attempts: `1`
- Maximum tokens: `1024`
- Temperature: `0.2`

## Running the application

Using the Maven Wrapper:

```bash
./mvnw spring-boot:run
```

On Windows:

```powershell
mvnw.cmd spring-boot:run
```

The application starts on `http://localhost:8080` by default.

## API

### Chat

```http
GET /api/v1/ai/chat?question=What%20is%20Spring%20AI?
```

Example with `curl`:

```bash
curl --get \
  --data-urlencode "question=What is Spring AI?" \
  http://localhost:8080/api/v1/ai/chat
```

A `question` request parameter is required.

## Testing

Run the test suite with:

```bash
./mvnw test
```

On Windows:

```powershell
mvnw.cmd test
```

## Project structure

```text
src/main/java/com/gloriane/
├── Controller/          # REST controllers
├── service/             # AI chat service interface and implementation
└── springai/            # Spring Boot application entry point
src/main/resources/
└── application.yml      # Application and OpenAI configuration
```
