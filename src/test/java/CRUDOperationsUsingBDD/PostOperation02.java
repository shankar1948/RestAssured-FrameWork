package CRUDOperationsUsingBDD;

import org.json.simple.JSONObject;
import org.testng.annotations.Test;

import io.restassured.http.ContentType;

import static io.restassured.RestAssured.*;

public class PostOperation02 {

	@Test
	public void post() {
		JSONObject js=new JSONObject();
		js.put("createdBy", "Arun");
		js.put("projectName", "");
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
		.assertThat().statusCode(404);
		
	}
}
