package com.e2x.kata.basketservice.monitoring;

import org.springframework.boot.actuate.health.AbstractHealthIndicator;
import org.springframework.boot.actuate.health.Health;
import org.springframework.stereotype.Component;

@Component
public class HealthCheck extends AbstractHealthIndicator {

    @Override
    protected void doHealthCheck(Health.Builder builder) throws Exception {
        builder.up()
            .withDetail("app", "Alive and Kicking")
            .withDetail("error", "Nothing! I'm good.");
    }

}
