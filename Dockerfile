FROM openjdk

WORKDIR /app

COPY target/rafael-0.0.1-SNAPSHOT.jar /app/rafael-app.jar

ENTRYPOINT ["java","-jar","rafael-app.jar"]