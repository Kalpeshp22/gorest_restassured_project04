package in.co.gorest.model;

import io.restassured.response.Response;
import org.junit.Test;
import testbase.TestBase;

import static io.restassured.RestAssured.given;

public class GoRestDeleteTest extends TestBase {

    @Test
    public void deleteAUserId() {
        Response response = given()
                .header("Content-Type", "application.json")
                .header("Authorization", "c426452f777927f6e49219f45652a5fd08178e3f873af217a5b982a6fdd15dac")
                .pathParam("id", 18729)
                .when()
                .delete("/{id}");
        response.then().statusCode(200);
        response.prettyPrint();
        System.out.println(response.statusCode());
    }

}
