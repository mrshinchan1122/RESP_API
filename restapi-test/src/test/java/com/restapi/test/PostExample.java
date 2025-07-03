package com.restapi.test;
import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import org.junit.jupiter.api.Test;

import static io.restassured.RestAssured.*;
import static org.hamcrest.Matchers.*;

public class PostExample {

    @Test
    public void createUser() {
        given()
            .baseUri("https://reqres.in")
            .basePath("/api/users")
            .contentType(ContentType.JSON)
            .body("{ \"name\": \"Sai\", \"job\": \"Tester\" }")
        .when()
            .post()
        .then()
            .statusCode(201)
            .body("name", equalTo("Sai"))
            .body("job", equalTo("Tester"));
    }
}
