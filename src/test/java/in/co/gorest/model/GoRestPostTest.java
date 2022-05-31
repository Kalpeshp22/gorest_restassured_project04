package in.co.gorest.model;

import io.restassured.response.Response;
import org.junit.Test;
import testbase.TestBase;

import static io.restassured.RestAssured.given;

public class GoRestPostTest extends TestBase {
    @Test
    public void creteAUser(){
        GoRestPojo goRestPojo = new GoRestPojo();
        goRestPojo.setName("Tenali Ramakrishna1");
        goRestPojo.setGender("female");
        goRestPojo.setEmail("tenali.ramakrishna2022@gmail.com");
        goRestPojo.setStatus("active");

        Response response = given()
                .header("Content-Type","application/json")
                .header("Authorization","Bearer c426452f777927f6e49219f45652a5fd08178e3f873af217a5b982a6fdd15dac")
                .body(goRestPojo)
                .when()
                .post();
        response.prettyPrint();
        response.then().statusCode(201);
        System.out.println(response.statusCode());

    }


}
