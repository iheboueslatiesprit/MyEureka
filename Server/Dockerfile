FROM maven:3.8.6-openjdk-11

#ARG JAR_FILE=target/*.jar

#RUN mkdir /opt/eureka-server

#COPY ${JAR_FILE} /opt/eureka-server/app.jar

#ENTRYPOINT ["java", "-jar", "/opt/eureka-server/app.jar"]

WORKDIR /Server
COPY . .
RUN mvn clean install
CMD mvn spring-boot:run