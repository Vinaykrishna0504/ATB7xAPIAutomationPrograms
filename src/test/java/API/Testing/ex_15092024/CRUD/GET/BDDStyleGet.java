package API.Testing.ex_15092024.CRUD.GET;

import io.restassured.RestAssured;

public class BDDStyleGet {
    public static void main(String[] args) {
        // GET Request - https://api.zippopotam.us/IN/560016
        // URL
        // HEADER
        // GET Method
        // Base url = https://api.zippopotam.us/
        // Base path = /IN/560016
        // Payload = No
        // Auth = Basic, digest, JWT, Bearer token, OAuth 2.0 ? = No

        // Verification
        // Status code
        // Response Body
        // Time, Headers, Cookies

        // Gherkin -> Given , When, Then -> Style

        // BDD - framework Different - Gherkin syntax - (Given , when, then)
        // Non BDD and Still Gherkin syntax(using classes)

        RestAssured
                .given()
                .baseUri("https://api.zippopotam.us")
                .basePath("/IN/560016")
                .when()
                .get()
                .then().log().all()
                .statusCode(200);
    }
}
