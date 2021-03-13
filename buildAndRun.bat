@echo off
call mvn clean package
call docker build -t br.com.wilson/AppTodo .
call docker rm -f AppTodo
call docker run -d -p 9080:9080 -p 9443:9443 --name AppTodo br.com.wilson/AppTodo