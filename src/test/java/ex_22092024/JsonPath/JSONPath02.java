package ex_22092024.JsonPath;

import io.restassured.path.json.JsonPath;

public class JSONPath02 {
    // POST - Create -> Verify the Response
    public static void main(String[] args) {
            String response = "{\n" +
                    "    \"firstName\": \"John\",\n" +
                    "    \"lastName\": \"doe\",\n" +
                    "    \"age\": 26,\n" +
                    "    \"address\": {\n" +
                    "        \"streetAddress\": \"naist street\",\n" +
                    "        \"city\": \"Nara\",\n" +
                    "        \"postalCode\": \"630-0192\"\n" +
                    "    },\n" +
                    "    \"phoneNumbers\": [\n" +
                    "        {\n" +
                    "            \"type\": \"iPhone\",\n" +
                    "            \"number\": \"0123-4567-8888\"\n" +
                    "        },\n" +
                    "        {\n" +
                    "            \"type\": \"home\",\n" +
                    "            \"number\": \"0123-4567-8910\"\n" +
                    "        }\n" +
                    "    ]\n" +
                    "}";

        JsonPath jsonPath = JsonPath.from(response);
        System.out.println(jsonPath.getString("firstName"));
        System.out.println(jsonPath.getString("lastName"));

        System.out.println(jsonPath.getString("phoneNumbers[0].number"));







    }
}
