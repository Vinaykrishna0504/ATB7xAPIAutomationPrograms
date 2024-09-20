package API.Testing.ex_15092024.CRUD.POST;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;

public class BDDStylePOST {

    // POST Request
    // URL - https://restful-booker.herokuapp.com/auth
    // Body - Payload - JSON
    // {
    //    "username" : "admin",
    //    "password" : "password123"
    //}'
    // HEADER - Content Type -> application/json

    public static void main(String[] args) {

        //Payload can be written in 3 ways - String(1%), Hashmap(4%), Classes(95%)

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
