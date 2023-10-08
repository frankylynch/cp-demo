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
        assertThat(response.contains("Spring"));
    }

//write a similar test that checks for the word "Hello" in the response
    @Test
    public void shouldPassIfHelloMatches(){
        String response = this.restTemplate.getForObject("http://localhost:" + port + "/" ,String.class);
        assertThat(response.contains("Hello"));
    }

//write a test to check a httpresponse body for the word "index"
    @Test
    public void shouldPassIfIndexMatches(){
        String response = this.restTemplate.getForObject("http://localhost:" + port + "/index" ,String.class);
        assertThat(response.contains("index"));
    }




}
