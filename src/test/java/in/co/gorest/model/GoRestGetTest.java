package in.co.gorest.model;

import io.restassured.response.Response;
import org.junit.Test;
import testbase.TestBase;

import static io.restassured.RestAssured.given;

public class GoRestGetTest extends TestBase {
    @Test
    public void getAllUsersInfo() {
        Response response = given()
                .when()
                .get();
        response.then().statusCode(200);
        response.prettyPrint();
        System.out.println(response.statusCode());
    }

    @Test
    public void getSingleUsersInfo() {
        Response response = given()
                .pathParam("id",2335)
                .when()
                .get("{id}");
        response.then().statusCode(200);
        response.prettyPrint();
        System.out.println(response.statusCode());
    }




}
