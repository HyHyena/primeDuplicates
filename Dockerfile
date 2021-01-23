#
# Build stage
#
FROM maven:3.6.3-openjdk-11 AS build
COPY src /home/app/src
COPY pom.xml /home/app
RUN mvn -f /home/app/pom.xml clean package

#
# Package stage
#
FROM openjdk:11
EXPOSE 8080
COPY --from=build /home/app/target/*.jar /duplicates.jar
CMD ["java", "-jar", "duplicates.jar"]