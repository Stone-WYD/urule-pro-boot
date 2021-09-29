mvn clean package -Dmaven.test.skip=true

docker build -t williamjiang2021/urule-console-pro4:v1.0.2 .

#docker commit -a "bstek" -m "urule-console-pro4" -p 93950e47f7d1 williamjiang2021/urule-console-pro4:v1.0.2
#docker push williamjiang2021/urule-console-pro4:v1.0.2
#docker run --name urule-console-pro -e URULE_PROFILE="hsql" -p 8080:8081 williamjiang2021/urule-console-pro4:v1.0.2
#docker run --name urule-console-pro -p 8080:8081 williamjiang2021/urule-console-pro4:v1.0.2
#docker pull williamjiang2021/urule-console-pro4:v1.0.2