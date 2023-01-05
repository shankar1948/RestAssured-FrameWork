package CRUDOperationWithoutBDD;

import org.json.simple.JSONObject;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class AddProject02 {

	@Test
	public void post() {
		//create object for json body
		JSONObject js =new JSONObject();
		// control is at restAssured class
		js.put("createdBy", "Auto");
		js.put("projectName", "Mountain01");
		js.put("status", "Created");
		js.put("teamSize", 06);
		
		//creating request specification
		RequestSpecification reqSpec = RestAssured.given();
		reqSpec.body(js);
		reqSpec.contentType(ContentType.JSON);
		
		Response response = reqSpec.post("http://localhost:8084/addProject");
		response.then().log().all();
	}
}
