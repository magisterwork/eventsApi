FROM maven:3.5-jdk-8

EXPOSE 8083

VOLUME ["/deploy/application"]

WORKDIR /deploy/application

ADD . .

CMD mvn spring-boot:run
