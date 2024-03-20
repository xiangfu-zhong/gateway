FROM openjdk:8-jdk
WORKDIR /root/web-server
COPY . /root/web-server
CMD ["java","-jar","/root/web-server/gateway.jar"]