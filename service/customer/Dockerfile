FROM zul/zulu-openjdk-alpine:17.0.10-jre

ARG GIT_REV=0000
ARG IMAGE_VERSION=0.0.0
ARG KUBERNETES_SECRETS_ENABLED=true
ENV KUBERNETES_SECRETS_ENABLED=$KUBERNETES_SECRETS_ENABLED

LABEL com.e2x.kata.name=customerservice
LABEL com.e2x.kata.version=${IMAGE_VERSION}
LABEL com.e2x.kata.gitrev=${GIT_REV}
LABEL com.e2x.kata.maintainer=dom.selvon@applydigital.com
LABEL com.e2x.kata.author=dom.selvon@applydigital.com

ARG KATA_UID=1000
ARG KATA_USER=kata
ARG KATA_GID=1000
ARG KATA_GROUP=kata

ADD ./build/libs/kata-customerservice-${IMAGE_VERSION}.jar /customerservice/kata-customerservice.jar

RUN addgroup -g ${KATA_GID} ${KATA_GROUP} && \
    adduser -s /bin/sh -u ${KATA_UID} -D -G ${KATA_GROUP} ${KATA_USER} && \
    chown -R ${KATA_USER}:${KATA_GROUP} /customerservice

WORKDIR /customerservice
USER ${KATA_USER}

EXPOSE 8082

CMD java -Dspring.cloud.kubernetes.secrets.paths=/service/secrets -Dspring.cloud.kubernetes.secrets.enabled=${KUBERNETES_SECRETS_ENABLED} -jar kata-customerservice.jar --server.servlet.context-path=/customer
