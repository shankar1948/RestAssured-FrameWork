package Parameters;

import org.testng.annotations.Test;

import io.restassured.http.ContentType;

import static io.restassured.RestAssured.*;

public class QueryParameter {
@Test
public void queryParameter() {
	baseURI="https://reqres.in/";
	given()
	.pathParam("path", "api/users/2")
	.queryParam("page",2)
	.contentType(ContentType.JSON)
	.when()
	.get("{path}")
	
	.then()
	
	.log().body();
}
}
