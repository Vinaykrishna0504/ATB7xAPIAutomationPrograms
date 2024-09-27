package ex_22092024;

import io.restassured.path.json.JsonPath;

public class JSONPath02 {
    // POST - Create -> Verify the Response
    public static void main(String[] args) {
        String response = "{\n" +
                "  \"firstname\": \"John\",\n" +
                "  \"lastname\": \"Doe\",\n" +
                "  \"age\": \"26\",\n" +
                "  \"Address\": {\n" +
                "    \"streetAddress\": \"naist street\",\n" +
                "    \"city\": \"Nara\",\n" +
                "    \"Postal code\": \"630-0192\"\n" +
                "  },\n" +
                "  \"phone Numbers\": [\n" +
                "    {\n" +
                "      \"type\": \"iphone\",\n" +
                "      \"number\": \"0123-4567-888\"\n" +
                "    },\n" +
                "    {\n" +
                "      \"type\": \"home\",\n" +
                "      \"number\": \"0123-4567-8910\"\n" +
                "    }\n" +
                "  ]\n" +
                "}\n";


        JsonPath jsonPath = JsonPath.from(response);
        System.out.println(jsonPath.getString("firstname"));
        System.out.println(jsonPath.getString("lastname"));

        System.out.println(jsonPath.getString("phoneNumbers[0].type"));





    }
}
