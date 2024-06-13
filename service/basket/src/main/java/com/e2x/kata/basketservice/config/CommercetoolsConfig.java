package com.e2x.kata.basketservice.config;

import com.commercetools.api.client.ProjectApiRoot;
import com.commercetools.api.defaultconfig.ApiRootBuilder;
import com.commercetools.api.defaultconfig.ServiceRegion;

import io.vrap.rmf.base.client.oauth2.ClientCredentials;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.io.IOException;


@Configuration
public class CommercetoolsConfig {

  Logger logger = LoggerFactory.getLogger(CommercetoolsConfig.class);

  @Bean
  public ProjectApiRoot sphereClient(
      @Value("${ctp.projectKey}") final String projectKey,
      @Value("${ctp.clientId}") final String clientId,
      @Value("${ctp.clientSecret}") final String clientSecret
  ) throws IOException {
    logger.debug(projectKey);
    logger.debug(clientId);

    return ApiRootBuilder.of()
            .defaultClient(
                    ClientCredentials.of()
                            .withClientId(clientId)
                            .withClientSecret(clientSecret)
                            .build(),
                    ServiceRegion.GCP_EUROPE_WEST1
            ).build(projectKey);
  }
}
