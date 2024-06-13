package com.e2x.kata.basketservice.delegate;

import com.commercetools.api.client.ProjectApiRoot;
import org.springframework.stereotype.Component;

@Component
public class ProjectApiRootInteraction {
  private final ProjectApiRoot apiRoot;

  public ProjectApiRootInteraction(ProjectApiRoot apiRoot) {
    this.apiRoot = apiRoot;
  }

  // Add api root interaction classes here
}
