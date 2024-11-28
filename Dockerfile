FROM openjdk:17

MAINTAINER 'venkatkilari5@gmail.com'

WORKDIR /usr/app/

COPY target/product-app /usr/app/product-app

ENTRYPOINT["java","-jar","product-app.jar"]

EXPOSE 8080
