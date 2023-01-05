package CRUDOperationWithoutBDD;

import org.json.simple.JSONObject;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class PutMethod {

	@Test
	public void putmethod() {
		//Create Json body using Json simple
		
				JSONObject js=new JSONObject();
				// Add the values into body
				js.put("createdBy", "Arun6");
				js.put("projectName", "Pulse05");
				js.put("status", "created");
				js.put("teamSize", 10);
				
				RequestSpecification reSpe = RestAssured.given();
				reSpe.body(js);
				reSpe.contentType(ContentType.JSON);
				
				Response res = reSpe.put("http://localhost:8084/projects/TY_PROJ_1010");
				res.then().log().all();
			System.out.println(res.getStatusCode());
			res.then().assertThat().statusCode(200);
	}
}
