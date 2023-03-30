package CRUDOperationWithoutBDD;

import org.json.simple.JSONObject;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.internal.path.json.mapping.JsonObjectDeserializer;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class AddProject {

	@Test
	public void postMethod() {
		//Create Json body using Json simple
		
		JSONObject js=new JSONObject();
		// Add the values into body
		js.put("createdBy", "Arun");
		js.put("projectName", "Pulse05");
		js.put("status", "created");
		js.put("teamSize", 10);
		
		//prerequest for script
		RequestSpecification reqSpec = RestAssured.given(); //from RestAssured class to RequestSpecification Interface
		reqSpec.body(js); // Specifying request body
		reqSpec.contentType(ContentType.JSON);
		
		//Action
		Response response = reqSpec.post("http://www.rmgtestingserver:8084/addProject");
		 //validation
		System.out.println(response.getContentType());
		response.then().log().all();
		response.then().assertThat().statusCode(201);
	
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
