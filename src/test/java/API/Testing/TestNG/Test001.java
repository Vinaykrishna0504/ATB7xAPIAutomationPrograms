package API.Testing.TestNG;

import io.restassured.RestAssured;
import org.testng.annotations.Test;

public class Test001 {

    @Test

    public void test_get(){

        RestAssured
                .given()
                .baseUri("https://api.zippopotam.us")
                .basePath("/IN/560001")
                .when()
                .get()
                .then().log().all()
                .statusCode(200);
    }
}
