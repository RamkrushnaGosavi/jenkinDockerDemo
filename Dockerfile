FROM openjdk:21-jdk
EXPOSE 8080
ADD target/CarApplication-0.0.1-SNAPSHOT.jar CarApplication-0.0.1-SNAPSHOT.jar
ENTRYPOINT ["java" , "-jar", "CarApplication-0.0.1-SNAPSHOT.jar"]

