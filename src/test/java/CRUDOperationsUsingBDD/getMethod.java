package CRUDOperationsUsingBDD;

import static io.restassured.RestAssured.*;

import org.testng.annotations.Test;

public class getMethod {

	@Test
	public void get()
	{
		baseURI="http://localhost";
		port=8084;
		
		when()
		.get("/projects")
		
		.then()
		.log().all()
		.assertThat().statusCode(200);
		
	}
}
