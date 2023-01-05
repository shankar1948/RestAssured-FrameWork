package CRUDOperationWithoutBDD;

import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class GetAllProjects {

	@Test
	public void getProjects() {
	Response reqSpec = RestAssured.get("http://localhost:8084/projects");
		//reqSpec.get("http://localhost:8084/projects");
		reqSpec.then().log().all();
		
	}
}
