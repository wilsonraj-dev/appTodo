#!/bin/sh
mvn clean package && docker build -t br.com.wilson/AppTodo .
docker rm -f AppTodo || true && docker run -d -p 9080:9080 -p 9443:9443 --name AppTodo br.com.wilson/AppTodo