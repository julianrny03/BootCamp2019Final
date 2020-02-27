import static io.restassured.RestAssured.*;
import static org.hamcrest.Matchers.*;

import io.restassured.RestAssured;
import io.restassured.builder.ResponseSpecBuilder;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import io.restassured.specification.ResponseSpecification;
import net.minidev.json.JSONObject;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Calls {

    // using test api egrats
    //GET
    @Test
    public void test_NumberOfCircuitsFor2017Season_ShouldBe20() {

        given().
        when().
        get("http://ergast.com/api/f1/2017/circuits.json").
        then().
        assertThat().
        statusCode(200);
    }

    private ResponseSpecification checkStatusCodeAndContentType =
        new ResponseSpecBuilder().
                expectStatusCode(200).
                expectContentType(ContentType.JSON).
                build
        ()
    ;

    //GET using response spec
    @Test
    public void test_NumberOfCircuits_ShouldBe20_UsingResponseSpec() {

        given().
                when().
                get("http://ergast.com/api/f1/2017/circuits.json").
                then().
                assertThat().
                spec(checkStatusCodeAndContentType).
                and().
                body("MRData.CircuitTable.Circuits.circuitId",hasSize(20)
        );
    }

    //POST using sample API
    @Test
    public void test_Simple_Api_Register_Student(){
        RestAssured.baseURI ="http://restapi.demoqa.com/customer";
        RequestSpecification request = RestAssured.given();

        JSONObject requestParams = new JSONObject();
        requestParams.put("FirstName", "Virender"); // Cast
        requestParams.put("LastName", "Singh");
        requestParams.put("UserName", "sdimpleuser2dd2011");
        requestParams.put("Password", "password1");

        requestParams.put("Email",  "sample2ee26d9@gmail.com");
        request.body(requestParams.toJSONString());
        Response response = request.post("/register");

        int statusCode = response.getStatusCode();
        Assert.assertEquals(statusCode, 200);
    }

    //PUT
    @Test
    public void test_Simple_Api_Update_Employee(){
        int empid = 15410;

        RestAssured.baseURI ="http://dummy.restapiexample.com/api/v1";
        RequestSpecification request = RestAssured.given();

        JSONObject requestParams = new JSONObject();
        requestParams.put("name", "Zion"); // Cast
        requestParams.put("age", 23);
        requestParams.put("salary", 12000);

        request.body(requestParams.toJSONString());
        Response response = request.put("/update/"+ empid);

        int statusCode = response.getStatusCode();
        System.out.println(response.asString());
        Assert.assertEquals(statusCode, 200);
    }
}
