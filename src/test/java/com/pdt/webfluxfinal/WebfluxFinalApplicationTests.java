package com.pdt.webfluxfinal;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;

import org.junit.Before;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.web.server.LocalServerPort;
import org.springframework.test.context.ActiveProfiles;

@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.DEFINED_PORT)
@ActiveProfiles("default")
class WebfluxFinalApplicationTests {

    @LocalServerPort
    private int port;

    @Test
    void contextLoads() {
    }
//    static {
//        System.setProperty("spring.mongodb.embedded.version","5.0.0");
//    }
    @Test
    void saveAndGetList(){
        Game game = new Game("cs:go");
        RestAssured
                .given()
                .port(port)
                .body(game)
                .contentType(ContentType.JSON)
                .when()
                .post("/api/game")
                .then()
                .statusCode(200);

    }
}
