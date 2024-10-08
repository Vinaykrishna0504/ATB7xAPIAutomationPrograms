package API.Testing.ex_15092024.CRUD.POST;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import io.restassured.response.ValidatableResponse;
import io.restassured.specification.RequestSpecification;

public class NonBDDStylePOST {

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


        // Given - Request Specification
        RequestSpecification r = RestAssured.given();
        r.baseUri("https://restful-booker.herokuapp.com");
        r.basePath("/auth");
        r.contentType(ContentType.JSON).log().all();
        r.body(payload);

        // When - Response
        Response response = r.when().post();


        // Then - ValidatableResponse
        //Validation
        ValidatableResponse validatableResponse = response.then();
        validatableResponse.statusCode(200);

    }


}
