from williamyeh/java8

MAINTAINER bstek

add  target/urule-pro-boot-0.0.1.jar /urule/urule-pro-boot.jar
add  home/ /urule/

ENV LANG C.UTF-8

RUN chmod 777 /urule/urule-init.sh
RUN chmod 777 /urule/urule.properties
CMD sh -c /urule/urule-init.sh

EXPOSE 8081