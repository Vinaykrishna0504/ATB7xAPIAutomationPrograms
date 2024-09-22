package API.Testing.ex_21092024.TestNGExamples;

import org.testng.annotations.BeforeTest;

public class TestNG003 {

    String token;
    Integer bookingID;

    @BeforeTest
    public String getToken() {
        token = "123";
        return token;
    }

    @BeforeTest
    public void getTokenAndBookingID(){
        token = getToken();
        bookingID = 123;
    }


}
