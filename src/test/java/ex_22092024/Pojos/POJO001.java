package ex_22092024.Pojos;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;

public class POJO001 {
    // String Payload

    public static void main(String[] args) {

        String payload = "{\"username\" : \"admin\",\n" +
                "       \"password\" : \"password123\"}";

        RestAssured.given().baseUri("https://restful-booker.herokuapp.com")
                .basePath("/auth")
                .contentType(ContentType.JSON).log()
                .all().body(payload).when()
                .post().then().log()
                .all().statusCode(200);

    }
}
