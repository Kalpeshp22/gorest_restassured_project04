package in.co.gorest.model;

import io.restassured.response.Response;
import org.junit.Test;
import testbase.TestBase;

import static io.restassured.RestAssured.given;

public class GoRestPutTest extends TestBase {
    @Test
    public void updateAUserWithPut() {
        GoRestPojo goRestPojo = new GoRestPojo();
        goRestPojo.setName("Tenali Ramakrishna10");
        goRestPojo.setGender("female");
        goRestPojo.setEmail("tenali.ramakrishna2023@gmail.com");
        goRestPojo.setStatus("active");

        Response response = given()
                .basePath("/public/v2/users")
                .header("Content-Type", "application/json")
                .header("Authorization", "Bearer c426452f777927f6e49219f45652a5fd08178e3f873af217a5b982a6fdd15dac")
                .body(goRestPojo)
                .pathParam("id", 18729)
                .when()
                .put("{id}");
        response.prettyPrint();
        response.then().statusCode(200);
        System.out.println(response.statusCode());
    }



}
