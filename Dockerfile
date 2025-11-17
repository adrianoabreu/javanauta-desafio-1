FROM gradle:7-jdk-21-and-23-alpine AS build
WORKDIR /app
COPY . .
RUN ./gradlew build --no-daemon

FROM alpine/java:21-jdk

WORKDIR /app

COPY --from=build /app/build/libs/*.jar /app/comunicacao_api.jar

EXPOSE 8080

CMD ["java","-jar","/app/comunicacao_api.jar"]