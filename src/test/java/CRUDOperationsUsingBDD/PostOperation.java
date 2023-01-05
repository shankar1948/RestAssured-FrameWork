package CRUDOperationsUsingBDD;

import org.apache.commons.lang3.RandomStringUtils;
import org.json.simple.JSONObject;
import org.testng.annotations.Test;

import com.RestAssured.GenericUtilities.GenericUtils;

import io.restassured.http.ContentType;

import static io.restassured.RestAssured.*;

import java.util.HashMap;

public class PostOperation extends GenericUtils{
	@Test
	public void postMethod() {
		//create object for Json Body
		//HashMap js=new HashMap();
		String alpha = alphabet();
		JSONObject js=new JSONObject();
		js.put("createdBy", "Arun");
		js.put("projectName", "Acer"+alpha);
		js.put("status", "created");
		js.put("teamSize", 10);
		
		given()
		.body(js)
		.contentType(ContentType.JSON)
		.when()
		.post("/addProject")
		
		
		.then()
		
		.assertThat()
		.statusCode(201)
		
		.contentType(ContentType.JSON)
		.statusLine("HTTP/1.1 201 ")
		.log().all();
	}
}
