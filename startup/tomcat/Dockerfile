FROM tomcat:8
LABEL maintainer="dgq.cs.se@gmail.com"

# add tomcat jpda debugging environmental variables
#ENV JPDA_OPTS="-agentlib:jdwp=transport=dt_socket,address=8000,server=y,suspend=n"
ENV JPDA_ADDRESS="8000"
ENV JPDA_TRANSPORT="dt_socket"

# start tomcat8 with remote debugging
EXPOSE 8080
EXPOSE 8000
CMD ["catalina.sh", "jpda", "run"]