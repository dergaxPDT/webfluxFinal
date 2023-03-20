package com.pdt.webfluxfinal;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;

import org.junit.Before;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.web.server.LocalServerPort;

@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.DEFINED_PORT)
class WebfluxFinalApplicationTests {

    @LocalServerPort
    private int port;

//    @Before
//    public void setup() {
//        RestAssured.baseURI = "http://localhost";
//        RestAssured.port = port;
//    }

    @Test
    void contextLoads() {
    }
    static {
        System.setProperty("spring.mongodb.embedded.version","5.0.0");
    }
    @Test
    void saveAndGetList(){
        System.out.println("@@"+RestAssured.baseURI);
        System.out.println("@@"+RestAssured.port);
        Game game = new Game("cs:go");
        RestAssured
                .given()
                .port(port)
                .body(game)                .contentType(ContentType.JSON)

                .when()
                .post("/api/game")
                .then()
                .statusCode(200);

    }
}
