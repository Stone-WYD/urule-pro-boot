mvn clean package -Dmaven.test.skip=true
docker build -t bsteker/urule-console-pro4 .
docker build -t bsteker/urule-console-pro4:v1.0.6 .