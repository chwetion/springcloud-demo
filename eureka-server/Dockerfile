FROM openjdk:8u121-alpine
COPY target/*.jar /app.jar
ENV JAVA_OPTS=""
ENTRYPOINT ["sh", "-c", "java -jar $JAVA_OPTS /app.jar"]