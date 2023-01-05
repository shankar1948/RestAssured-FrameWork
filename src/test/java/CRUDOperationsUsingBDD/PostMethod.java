package CRUDOperationsUsingBDD;


import static io.restassured.RestAssured.*;

import org.apache.commons.lang3.RandomStringUtils;
import org.json.simple.JSONObject;
import org.testng.annotations.Test;

import io.restassured.http.ContentType;
import static io.restassured.response.Response.*;





public class PostMethod {
	@Test
	public void postMethod() {
		//create object for Json Body
		//HashMap js=new HashMap();
		String alpha = RandomStringUtils.randomAlphabetic(2);
		JSONObject js=new JSONObject();
		js.put("createdBy", "Arun");
		js.put("projectName", "Acer"+alpha);
		js.put("status", "created");
		js.put("teamSize", 10);
		baseURI="http://localhost";
		port=8084;
		
		given()
		.body(js)
		.contentType(ContentType.JSON)
		.when()
		.post("/addProject")
		.then()
		.log().all()
		.statusCode(201)
		.assertThat().equals(js);
		 
		
		
		
		
		
		
		
		
		
		
	}
	
}
