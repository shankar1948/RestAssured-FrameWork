package CRUDOperationsUsingBDD;

import static io.restassured.RestAssured.*;

import org.apache.commons.lang3.RandomStringUtils;
import org.json.simple.JSONObject;
import org.testng.annotations.Test;

import io.restassured.http.ContentType;

public class UpdateProject {

	@Test
	public void put() {
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
		.put("/projects/TY_PROJ_1409")
		.then()
		.statusCode(200);
	}
}
