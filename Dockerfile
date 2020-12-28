FROM openjdk:8-jdk


RUN mkdir /tmp/test1/
WORKDIR /tmp/test1/

COPY target/achistar-portal-0.0.1-SNAPSHOT.war .

ENV JAVA_HOME /usr/lib/jvm/java-8-openjdk-amd64 
ENV PATH $PATH:/usr/lib/jvm/java-8-openjdk-amd64/bin


EXPOSE 8081

ENTRYPOINT ["nohup java","-jar","achistar-portal-0.0.1-SNAPSHOT.war"]
