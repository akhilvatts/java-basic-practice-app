FROM openjdk
ADD target/*.jar /
EXPOSE 9090
ENTRYPOINT ["java","-jar","/helloworld-1.0-SNAPSHOT.jar"]