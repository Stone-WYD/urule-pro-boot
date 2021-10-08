mvn clean package -Dmaven.test.skip=true

docker build -t bsteker/urule-console-pro4 .

#docker commit -a "bstek" -m "urule-console-pro4" -p 93950e47f7d1 bsteker/urule-console-pro4:v1.0.0
#docker push bsteker/urule-console-pro4:v1.0.0
#docker run --name urule-console-pro -e URULE_PROFILE="hsql" -p 8080:8081 bsteker/urule-console-pro4:v1.0.0
#docker run --name urule-console-pro -e URULE_PROFILE="mysql" -e DB_VERSION=5 -p 8080:8081 bsteker/urule-console-pro4
#docker run --name urule-console-pro -p 8080:8081 bsteker/urule-console-pro4:v1.0.0
#docker pull bsteker/urule-console-pro4:v1.0.0