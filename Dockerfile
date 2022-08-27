FROM tomcat:8-jre8
WORKDIR /usr/local/tomcat
RUN rm -rf ./webapps/*
COPY ./target/*.jar ./webapps/ROOT.jar
EXPOSE 8080
CMD $CATALINA_HOME/bin/startup.sh && tail -f $CATALINA_HOME/logs/catalina.out
