FROM openjdk:17
ADD KIII_Project_Final-0.0.1-SNAPSHOT.jar KIII_Project_Final-0.0.1-SNAPSHOT.jar
EXPOSE 8080
ENTRYPOINT ["java", "-jar", "KIII_Project_Final-0.0.1-SNAPSHOT.jar"]
