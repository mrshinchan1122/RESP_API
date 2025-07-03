package com.restapi.test;

import io.restassured.response.Response;
import org.junit.jupiter.api.Test;

import static io.restassured.RestAssured.*;

public class GetMethodExampleTest {

    @Test
    public void getUsers() {
        // Send a GET request and store the response
        Response response = given()
                                .baseUri("https://reqres.in")
                                .basePath("/api/users?page=2")
                            .when()
                                .get();

        // Print HTTP method, status code and response body
        System.out.println("HTTP Method Used: GET");
        System.out.println("Status Code: " + response.getStatusCode());
        System.out.println("Response Body:\n" + response.getBody().asPrettyString());
    }
}
