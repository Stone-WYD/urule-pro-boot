# 说明

## 提交命令
```
docker commit -a "bstek" -m "urule-console-pro4" -p 93950e47f7d1 bsteker/urule-console-pro4:latest
```
## 提交命令
```
docker push bsteker/urule-console-pro4
```

## 采用hsql驱动的镜像参数设置
```
docker run --name urule-console-pro -e URULE_PROFILE="hsql" -p 8080:8081 bsteker/urule-console-pro4
```

## 采用mysql驱动的镜像参数设置
```
docker run --name urule-console-pro -e URULE_PROFILE="mysql" -e DRIVER_VERSION=5 -p 8080:8081 bsteker/urule-console-pro4
```
## 运行镜像
```
docker run --name urule-console-pro -p 8080:8081 bsteker/urule-console-pro4
```
## 获取镜像
```
docker pull bsteker/urule-console-pro4
```