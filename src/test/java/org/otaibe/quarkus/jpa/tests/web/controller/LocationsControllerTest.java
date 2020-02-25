package org.otaibe.quarkus.jpa.tests.web.controller;

import io.quarkus.test.junit.QuarkusTest;
import org.junit.jupiter.api.Test;

import static io.restassured.RestAssured.given;
import static org.hamcrest.CoreMatchers.containsStringIgnoringCase;

@QuarkusTest
public class LocationsControllerTest {

    @Test
    public void testDestinationEndpoint() {
        given()
                .queryParam("q", "Sof")
                .when().get("/destinations")
                .then()
                .statusCode(200)
                .body(containsStringIgnoringCase("Sofia"));
    }

}