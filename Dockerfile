FROM openjdk
COPY target/springrestinvb-0.0.1-SNAPSHOT.jar usr/app/springrestinvb-0.0.1-SNAPSHOT.jar
WORKDIR usr/app
EXPOSE 8080
ENTRYPOINT ["java","-jar","springrestinvb-0.0.1-SNAPSHOT.jar"]