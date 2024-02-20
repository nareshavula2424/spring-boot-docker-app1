FROM openjdk:17
MAINTAINER "Naresh"
COPY target/spring-boot-docker-app1.jar /usr/app/
WORKDIR /usr/app/
EXPOSE 8080
ENTRYPOINT ["java", "-jar", "spring-boot-docker-app1.jar"]