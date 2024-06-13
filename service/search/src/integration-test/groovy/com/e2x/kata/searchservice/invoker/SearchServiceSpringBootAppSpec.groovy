package com.e2x.kata.searchservice.invoker

import org.springframework.beans.factory.annotation.Autowired
import org.springframework.boot.test.context.SpringBootTest
import org.springframework.boot.test.web.client.TestRestTemplate
import spock.lang.Specification

import static org.springframework.boot.test.context.SpringBootTest.WebEnvironment.RANDOM_PORT


@SpringBootTest(webEnvironment = RANDOM_PORT,
    classes=SearchServiceSpringBootApp)
class SearchServiceSpringBootAppSpec extends Specification {
  @Autowired
  TestRestTemplate restTemplate

  def ' for '() {
    given:

    when:
    def entity = this.restTemplate.withBasicAuth("admin", "password").getForEntity('', Object)

    then:
    entity.statusCode.value() == 200
  }
}
