package API.Testing.ex_15092024.CRUD.PUT;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import io.restassured.response.ValidatableResponse;
import io.restassured.specification.RequestSpecification;
import org.testng.annotations.Test;

public class NonBDDPUT {
    RequestSpecification requestSpecification;
    ValidatableResponse validatableResponse;
    Response response;
    // 3350
    // Token
    // Payload
    // {
    //    "firstname" : "Vinay",
    //    "lastname" : "Brown",
    //    "totalprice" : 111,
    //    "depositpaid" : true,
    //    "bookingdates" : {
    //        "checkin" : "2018-01-01",
    //        "checkout" : "2019-01-01"
    //    },
    //    "additional needs" : "Breakfast"
    //}

    // POST - Auth - token
    // POST - Booking ID
    // PUT - we need token and Booking ID

     //public void get_token(){

     //}


    //public void get_booking_id(){
      //  return bookingid;
    //}

    @Test
    public void test_put_positive_tc(){
        // POST - Auth - token

        String token = "2d43a1088623216";
        String bookingid = "2972";


        String payload_PUT = "{\n" +
                "\n" +
                "    \"firstname\" : \"Vinay\",\n" +
                "    \"lastname\" : \"Brown\",\n" +
                "    \"totalprice\" : 111,\n" +
                "    \"depositpaid\" : true,\n" +
                "    \"bookingdates\" : {\n" +
                "        \"checkin\" : \"2018-01-01\",\n" +
                "        \"checkout\" : \"2019-01-01\"\n" +
                "    }\n" +
                "}";

        requestSpecification = RestAssured.given();
        requestSpecification.baseUri("https://restful-booker.herokuapp.com/");
        requestSpecification.basePath("/booking/" + bookingid);
        requestSpecification.contentType(ContentType.JSON);
        requestSpecification.cookie("token");
        requestSpecification.body(payload_PUT).log().all();

        Response response = requestSpecification.when().put();

        // Get Validatable response to perform validation

        validatableResponse = response.then().log().all();
        validatableResponse.statusCode(200);




    }
}
