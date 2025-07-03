package com.restapi.test;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import org.junit.jupiter.api.Test;

import static io.restassured.RestAssured.*;
import static org.hamcrest.Matchers.*;

public class GetUserTest {

    @Test
    public void getUserTest() {
        // Send GET request and store response
        Response response = 
            given()
            .when()
                .get("https://jsonplaceholder.typicode.com/users/1");

        // Print response info
        System.out.println("HTTP Method Used: GET");
        System.out.println("Status Code: " + response.getStatusCode());
        System.out.println("Response Body:\n" + response.getBody().asPrettyString());

        // Assertions
        response.then()
                .statusCode(200)
                .body("name", equalTo("Leanne Graham"));
    }
}
