package testbase;

import io.restassured.RestAssured;
import org.junit.BeforeClass;


public class TestBase {
    // set up the environment
    @BeforeClass
    public static void inIt() {
        RestAssured.baseURI = "https://gorest.co.in/public/v2";
        RestAssured.basePath="/users";

    }


}