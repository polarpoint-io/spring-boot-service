FROM mcr.microsoft.com/java/jdk:11u2-zulu-alpine
ENV SPRING_PROFILE my-default
EXPOSE 8080
RUN mkdir -p /app/
ADD build/libs/*.jar /app/spring-boot.jar

