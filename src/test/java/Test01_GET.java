import static io.restassured.RestAssured.*;

import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import org.testng.annotations.Test;
import static io.restassured.RestAssured.*;
import static io.restassured.matcher.RestAssuredMatchers.*;
import static org.hamcrest.Matchers.*;

public class Test01_GET {

    @Test
    void test_01()
    {
        Response response = get("https://reqres.in/api/users?page=2");
        System.out.println(response.getBody().asString());
        System.out.println( response.getStatusCode());
        System.out.println(response.getContentType());
        System.out.println(response.getHeaders());
        System.out.println(response.getSessionId());
        System.out.println(response.getStatusLine());
        System.out.println(response.getTime());
        System.out.println(response.getClass());
    }
    @Test
    void test_02()
    {
        given().get("https://reqres.in/api/users?page=2").then().statusCode(200);
    }

    @Test
    void test_03()
    {
        given()
                .get("https://reqres.in/api/users?page=2")
        .then()
            .statusCode(200)
                .body("data.id[0]", equalTo(7));

    }

    @Test
    void test_04()
    {
        System.out.println("Test 4");
    }
}
