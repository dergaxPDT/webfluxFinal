package com.pdt.webfluxfinal;

import io.restassured.RestAssured;
import org.junit.Before;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.web.server.LocalServerPort;
import org.springframework.http.HttpStatus;
import org.springframework.test.context.junit4.SpringRunner;

import javax.annotation.PostConstruct;
import java.util.HashMap;
import java.util.Map;

import static io.restassured.RestAssured.given;
import static org.assertj.core.api.Assertions.assertThat;

@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.DEFINED_PORT)
@RunWith(SpringRunner.class)
class WebfluxFinalApplicationTests {

    @Test
    void contextLoads() {
    }

    @Before
    public void setUp() throws Exception {
        RestAssured.port = port;
    }
    private String uri;
    @LocalServerPort
    private int port;

    @PostConstruct
    public void init() {
        uri = "http://localhost:" + port;
    }

    @Test
    public void givenMovie_whenMakingPostRequestToMovieEndpoint_thenCorrect() {

        Map<String, String> request = new HashMap<>();
        request.put("name", "cs go");
        Game game = new Game("cs go");
        given()
                .contentType("application/json")
                .body(game)
                .when()
                .post(uri + "/api/game")
                .then()
                .statusCode(200);
    }
}
