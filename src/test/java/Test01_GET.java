import static io.restassured.RestAssured.*;

import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import org.testng.annotations.Test;

public class Test01_GET {

    @Test
    void test_01()
    {
        //JsonPath jsonpath = new JsonPath();
        Response response = get("https://reqres.in/api/users?page=2");
        System.out.println(response);
        System.out.println(response.getBody().asString());
        System.out.println(response.getStatusCode());
    }
    @Test
    void test_02()
    {
        given().get("https://reqres.in/api/users?page=2").then().statusCode(200);
    }
}
