package CRUDOperationsUsingBDD;

import static io.restassured.RestAssured.*;


import org.testng.annotations.Test;

public class getSingleProjects {

	@Test
	public void singleProject() {

		baseURI="http://localhost";
		port=8084;

		when()
		.get("/projects/TY_PROJ_1410")

		.then()
		.log().all()
		.statusCode(200);





	}
}
