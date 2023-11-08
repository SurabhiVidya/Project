From openjdk: 11
EXPOSE 8080
ADD target/jsonapi.jar jsonapi.jar
ENTRYPOINT ["java","-jar","jsonapi.jar"]