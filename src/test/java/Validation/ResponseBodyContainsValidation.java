package Validation;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.RestAssured.GenericUtilities.GenericUtils;

import io.restassured.response.Response;

import static io.restassured.RestAssured.*;

public class ResponseBodyContainsValidation extends GenericUtils{
@Test
public void validation() {
	Response response=
	when()
	.get("/projects")
	
	.then()
	.statusCode(200)
	.extract().response();
	String st = response.asString();
	Assert.assertEquals(st.contains("Arun"), true);
	
	
}
}
