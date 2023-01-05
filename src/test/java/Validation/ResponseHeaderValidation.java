package Validation;

import org.hamcrest.Matchers;
import org.json.simple.JSONObject;
import org.testng.annotations.Test;

import com.RestAssured.GenericUtilities.GenericUtils;

import io.restassured.http.ContentType;

import static io.restassured.RestAssured.*;

import java.util.concurrent.TimeUnit;



public class ResponseHeaderValidation extends GenericUtils {
@Test
public void headerAssertion() {
	String alpha = alphabet();
	JSONObject js=new JSONObject();
	js.put("createdBy", "Arun");
	js.put("projectName", "SpiralFlow"+alpha);
	js.put("status", "created");
	js.put("teamSize", 10);
	
	given()
	.body(js)
	.contentType(ContentType.JSON)
	.when()
	.post("/addProject")
	.then()
	.statusCode(201)
	.statusLine("HTTP/1.1 201 ");

}
}
