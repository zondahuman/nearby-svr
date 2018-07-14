#!/bin/bash
cd nearby-svr
git pull
mvn clean install -U  -Dmaven.test.skip=true -P prod

#kill tomcat pid
pidlist=`ps -ef|grep nearby-svr |grep -v "grep"|awk '{print $2}'`
echo "tomcat Id list :$pidlist"
kill -9 $pidlist
echo "KILL $pidlist:"
echo "service stop success"
echo "start tomcat"
rm -rf /home/work/local/tomcat-house/webapps/house
nohup /home/work/local/tomcat-house/bin/startup.sh &
tail -f /home/work/local/tomcat-house/logs/catalina.out