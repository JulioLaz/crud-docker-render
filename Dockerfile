FROM amazoncorretto:17-alpine-jdk

MAINTAINER emaaristimuno

COPY target/crud_db_julio-0.0.1-SNAPSHOT.jar crud_db_julio-0.0.1-SNAPSHOT.jar

ENTRYPOINT ["java","-jar","/crud_db_julio-0.0.1-SNAPSHOT.jar"]
