# 基础镜像
FROM openjdk:8-jdk-alpine

# 作者信息
MAINTAINER "xy_rhyme@163.com"

# 添加一个存储空间
VOLUME /tmp


# 复制文件到容器根目录"/",并且命名为app.jar

ADD target/spring-boot-docker-0.0.1-SNAPSHOT.jar /app.jar
# 声明需要暴露的端口

EXPOSE 18200

# 配置容器启动后执行的命令，java -jar /app.jar

ENTRYPOINT ["java","-jar","/app.jar"]