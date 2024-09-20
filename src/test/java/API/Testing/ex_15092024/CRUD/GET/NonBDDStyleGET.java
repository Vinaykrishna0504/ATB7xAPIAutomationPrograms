package API.Testing.ex_15092024.CRUD.GET;

import io.restassured.RestAssured;
import io.restassured.specification.RequestSpecification;

public class NonBDDStyleGET {
   static RequestSpecification r = RestAssured.given();
    public static void main(String[] args) {
        // REST Assured provides us lot of classes.
        r.baseUri("https://api.zippopotam.us");
        testnon_bdd_1();
        testnon_bdd_2();

    }

    private static void testnon_bdd_2() {
        r.basePath("/IN/560016");
        r.when().get();
        r.then().log().all().statusCode(404);
    }

    private static void testnon_bdd_1() {
        r.basePath("/IN/560001");
        r.when().get();
        r.then().log().all().statusCode(200);
    }
}
