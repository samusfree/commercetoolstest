package com.e2x.kata.catalogservice.delegate;

import com.commercetools.api.client.ProjectApiRoot;
import org.springframework.stereotype.Component;

import java.util.concurrent.ExecutionException;

@Component
public class ProjectApiRootInteraction {
  private final ProjectApiRoot apiRoot;

  public ProjectApiRootInteraction(ProjectApiRoot apiRoot) {
    this.apiRoot = apiRoot;
  }

  // Add api root interaction classes here
}
