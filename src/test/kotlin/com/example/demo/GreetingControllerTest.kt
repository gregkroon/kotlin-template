package com.example.demo

import org.junit.jupiter.api.Test
import org.springframework.boot.test.context.SpringBootTest
import org.springframework.boot.test.web.client.TestRestTemplate
import org.springframework.beans.factory.annotation.Autowired
import org.junit.jupiter.api.Assertions.assertEquals

@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
class GreetingControllerTest(@Autowired val restTemplate: TestRestTemplate) {

    @Test
    fun greetEndpointReturnsHelloWorld() {
        val result = restTemplate.getForEntity("/greet", String::class.java)
        assertEquals("Hello, World!", result.body)
    }
}
