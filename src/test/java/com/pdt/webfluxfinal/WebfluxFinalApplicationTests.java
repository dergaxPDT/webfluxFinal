package com.pdt.webfluxfinal;

import io.restassured.RestAssured;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import io.restassured.RestAssured.*;
        import io.restassured.matcher.RestAssuredMatchers.*;
        import org.hamcrest.Matchers.*;
@SpringBootTest
class WebfluxFinalApplicationTests {

    @Test
    void contextLoads() {
    }
    static {
        System.setProperty("spring.mongodb.embedded.version","5.0.0");
    }
    @Test
    void saveAndGetList(){

        Game game = new Game("cs:go");
        RestAssured
                .given()
                .body(game)
                .when()
                .post("/api/game")
                .then()
                .statusCode(200);

    }
}
