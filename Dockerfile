FROM openjdk:11
LABEL SAI KALYAN UPPALA
COPY target/*.jar actors.jar
ENTRYPOINT ["java","-jar","/actors.jar"]