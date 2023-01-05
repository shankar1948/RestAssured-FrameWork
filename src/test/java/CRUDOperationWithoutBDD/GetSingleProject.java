package CRUDOperationWithoutBDD;

import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.response.Response;

public class GetSingleProject {
	@Test
	public void singleProject() {
	Response req = RestAssured.get("http://localhost:8084/projects/TY_PROJ_1002");
	req.then().log().all();
	req.then().assertThat().statusCode(200);
	
	}
}