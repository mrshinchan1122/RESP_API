package com.restapi.test;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import org.junit.jupiter.api.Test;

public class GetResponseBodyTest {

    @Test
    public void getResponseBody() {
        // Send GET request and store response
        Response response = RestAssured
                                .given()
                                .when()
                                .get("https://jsonplaceholder.typicode.com/users/1");

        // Print the response body as a string
        System.out.println("Response Body:");
        System.out.println(response.getBody().prettyPrint());
    }
}
