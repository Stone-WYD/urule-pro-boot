from williamyeh/java8

MAINTAINER bstek

add  target/urule-pro-boot-0.0.1-SNAPSHOT.jar /urule-pro-boot-0.0.1-SNAPSHOT.jar

ENV LANG C.UTF-8

RUN bash -c 'mkdir /home/urule-home'

RUN bash -c 'chmod 777 /home/urule-home'

ENTRYPOINT ["java", "-jar", "/urule-pro-boot-0.0.1-SNAPSHOT.jar"]

EXPOSE 8081