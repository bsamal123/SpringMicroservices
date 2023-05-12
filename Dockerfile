FROM ubi8/openjdk-17
COPY target/SpringMicroservices-1.0-SNAPSHOT-with-dependencies.jar /usr/src/app/App.jar
CMD ["java","-jar", "/usr/src/app/App.jar"]
