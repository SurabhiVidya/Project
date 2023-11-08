From openjdk: 11
EXPOSE 8080
ADD target/json.jar json.jar
ENTRYPOINT ["java","-jar","json.jar"]