FROM ubuntu:14.04


RUN sed -i 's/http:\/\/archive.ubuntu.com\/ubuntu\//http:\/\/mirrors.163.com\/ubuntu\//g' /etc/apt/sources.list

MAINTAINER zhushuai@cmss.chinamobile.com
RUN apt-get update && apt-get install -y curl
RUN mkdir -p /usr/local/bin

ADD . /log.sh /usr/local/bin/

WORKDIR /usr/local/bin

ENTRYPOINT ["/usr/local/bin/log.sh"]
