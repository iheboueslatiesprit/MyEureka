FROM maven:3.8.6-openjdk-11

#ARG JAR_FILE=target/*.jar

#RUN mkdir /opt/association-app

#COPY ${JAR_FILE} /opt/association-app/app.jar
WORKDIR /Association
COPY . .
RUN mvn clean install -DskipTests
CMD mvn spring-boot:run

#ENTRYPOINT ["java", "-jar", "/opt/association-app/app.jar"]