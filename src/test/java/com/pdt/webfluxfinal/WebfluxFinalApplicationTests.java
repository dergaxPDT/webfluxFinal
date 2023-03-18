package com.pdt.webfluxfinal;

import io.restassured.RestAssured;
import org.junit.Before;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.web.server.LocalServerPort;
import org.springframework.test.context.junit4.SpringRunner;

import javax.annotation.PostConstruct;
import java.util.HashMap;
import java.util.Map;

@SpringBootTest
@RunWith(SpringRunner.class)
class WebfluxFinalApplicationTests {

    @Test
    void contextLoads() {
    }

    //    @Before
//    public void setup(){
//        RestAssured.baseURI = "https://api.github.com";
//        RestAssured.port = 443;
//    }
    private String uri;
    @LocalServerPort
    private int port;

    @PostConstruct
    public void init() {
        uri = "http://localhost:" + port;
    }

    @Test
    void saveAndGetList() {
        Game game = new Game("cs:go");
        Map<String, String> request = new HashMap();
        request.put("name", game.getName());
        RestAssured
                .given()
                .body(request)
                .when()
                .post(uri + "api/game")
                .then()
                .statusCode(200);

    }
}
