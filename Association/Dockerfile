FROM maven:3.8.6-openjdk-11

ARG JAR_FILE=target/*.jar

RUN mkdir /opt/customer-app

COPY ${JAR_FILE} /opt/association-app/app.jar

ENTRYPOINT ["java", "-jar", "/opt/association-app/app.jar"]