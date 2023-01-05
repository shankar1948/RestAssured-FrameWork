package CRUDOperationsUsingBDD;

import static io.restassured.RestAssured.*;
import static io.restassured.RestAssured.port;
import static io.restassured.RestAssured.when;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.RestAssured.GenericUtilities.GenericUtils;

import io.restassured.response.Response;

public class GetMethodAssertions extends GenericUtils {
	@Test
	public void AllProject() {
Response response=
		

		when()
		.get("/projects")

		.then()
		.log().all()
		.statusCode(200)
		.extract().response();
		String st=response.asString();
		Assert.assertEquals(st.contains("Plasma") , true);

}
}
