FROM openjdk:8
EXPOSE 8099
ADD target/CapestonProjectSample2-0.0.1-SNAPSHOT.war CapestonProjectSample2-0.0.1-SNAPSHOT.war
ENTRYPOINT [ "java", "-jar", "/CapestonProjectSample2-0.0.1-SNAPSHOT.war" ]