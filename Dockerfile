FROM eclipse-temurin/17-ubi9-minimal
COPY target/SpringMicroservices-1.0-SNAPSHOT-with-dependencies.jar /usr/src/app/App.jar
CMD ["java","-jar", "/usr/src/app/App.jar"]
