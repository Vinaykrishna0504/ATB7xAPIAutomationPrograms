package ex_22092024.JsonPath;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import io.restassured.response.ValidatableResponse;
import io.restassured.specification.RequestSpecification;
import org.testng.annotations.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class JSONPath01 {
    //POST -> Create -> Verify the response

    RequestSpecification requestSpecification;
    ValidatableResponse validatableResponse;
    Response response;
    String token;
    Integer bookingId;


    @Test
    public void post_test() {
        String payload_POST = "{\n" +
                "    \"firstname\" : \"Pramod\",\n" +
                "    \"lastname\" : \"Dutta\",\n" +
                "    \"totalprice\" : 111,\n" +
                "    \"depositpaid\" : false,\n" +
                "    \"bookingdates\" : {\n" +
                "        \"checkin\" : \"2024-01-01\",\n" +
                "        \"checkout\" : \"2024-01-01\"\n" +
                "    },\n" +
                "    \"additionalneeds\" : \"Lunch\"\n" +
                "}";

        requestSpecification = RestAssured.given();
        requestSpecification.baseUri("https://restful-booker.herokuapp.com/");
        requestSpecification.basePath("/booking");
        requestSpecification.contentType(ContentType.JSON);
        requestSpecification.body(payload_POST);

        Response response = requestSpecification.when().post();

        System.out.println(response.asString());

        JsonPath jsonPath = new JsonPath(response.asString());
        String bookingId =  jsonPath.getString("bookingid");
        String firstname =  jsonPath.getString("booking.firstname");
        String lastname =  jsonPath.getString("booking.lastname");
        String totalprice =  jsonPath.getString("booking.totalprice");
        String checkin =  jsonPath.getString("booking.bookingdates.checkin");
        String checkout =  jsonPath.getString("booking.bookingdates.checkout");




        System.out.println(bookingId);
        System.out.println(firstname);
        System.out.println(lastname);
        System.out.println(totalprice);
        System.out.println(checkin);
        System.out.println(checkout);


        assertThat(bookingId).isNotNull().isNotBlank().isGreaterThan("0");
        assertThat(firstname).isNotNull().isNotBlank().isEqualTo("Pramod");
        assertThat(checkout).isNotNull().isNotBlank();


    }
}