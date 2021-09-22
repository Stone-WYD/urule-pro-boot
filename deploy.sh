mvn clean package -Dmaven.test.skip=true

docker build -t urule-console-pro4:v1 .

#docker commit -a "bstek" -m "urule-console-pro4" -p 93950e47f7d1 williamjiang2021/urule-console-pro4:v1
#docker push williamjiang2021/urule-console-pro4:v1