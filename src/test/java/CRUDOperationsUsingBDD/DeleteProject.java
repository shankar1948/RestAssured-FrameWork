package CRUDOperationsUsingBDD;

import static io.restassured.RestAssured.*;


import org.testng.annotations.Test;

public class DeleteProject {

	@Test
	public void get()
	{
		baseURI="http://localhost";
		port=8084;
		
		when()
		.delete("/projects/TY_PROJ_1410")
		.then()
		
		.log().all()
		.statusCode(204);
		
	}	
}
