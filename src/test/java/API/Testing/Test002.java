package API.Testing;

import io.restassured.RestAssured;

public class Test002 {
    public static void main(String[] args) {
        System.out.println("REST Assured test case");
        System.out.println("GET request demo");

        // Gherkin syntax
        // Given() - url, header, payload or Body
        // When() - http methods - GET, POST, PATCH, PUT, DELETE
        // Then() - Verify the response, Expected result = Actual Result


        RestAssured
                .given()
                    .baseUri("https://restful-booker.herokuapp.com")
                    .basePath("/booking/1").log().all()
                .when()
                    .get()
                .then().log().all()
                    .statusCode(200); // Output will throw error when 200 is changed

    }
}
