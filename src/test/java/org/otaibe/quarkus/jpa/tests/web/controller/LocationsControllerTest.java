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
                .when().get(LocationsController.DESTINATIONS)
                .then()
                .statusCode(200)
                .body(containsStringIgnoringCase("Sofia"));
    }

    @Test
    public void testDestinationStartWithEndpoint() {
        given()
                .queryParam("q", "sof")
                .when().get(LocationsController.DESTINATIONS_START_WITH)
                .then()
                .statusCode(200)
                .body(containsStringIgnoringCase("Sofia"));
    }

}