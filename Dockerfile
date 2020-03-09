FROM arm64v8/openjdk
ENV SPRING_PROFILE my-default
EXPOSE 8080
RUN mkdir -p /app/
ADD build/libs/*.jar /app/spring-boot.jar

