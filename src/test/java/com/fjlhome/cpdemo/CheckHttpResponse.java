package com.fjlhome.cpdemo;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.boot.test.web.server.LocalServerPort;

import java.net.http.HttpResponse;

import static org.assertj.core.api.Assertions.assertThat;


@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
public class CheckHttpResponse {
        @LocalServerPort
        private int port;

    @Autowired
    private TestRestTemplate restTemplate;

    public CheckHttpResponse() {
    }

    @Test
    public void shouldPassIfSpringMatches(){
        String response = this.restTemplate.getForObject("http://localhost:" + port + "/" ,String.class);
        assertThat(response.contains("Home"));
    }

    // write a http test for the calculator page
    @Test
    public void shouldPassIfCalculatorPageMatches(){
        String response = this.restTemplate.getForObject("http://localhost:" + port + "/calculator" ,String.class);
        assertThat(response.contains("calculator"));
    }







}
