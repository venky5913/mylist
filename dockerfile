FROM tomcat
MAINTAINER Srikanth

RUN apt-get update

CMD ["tail", "-f", "/dev/null"]
