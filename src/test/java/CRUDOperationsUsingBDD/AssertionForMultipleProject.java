package CRUDOperationsUsingBDD;

import static io.restassured.RestAssured.baseURI;
import static io.restassured.RestAssured.port;
import static io.restassured.RestAssured.when;

import org.hamcrest.Matchers;
import org.testng.annotations.Test;

import com.RestAssured.GenericUtilities.GenericUtils;

import net.bytebuddy.implementation.bytecode.assign.Assigner.EqualTypesOnly;

public class AssertionForMultipleProject extends GenericUtils {
	@Test
	public void mutipleProject() {


		when()
		.get("/projects")

		.then()
		.log().body()
		.statusCode(200)
		.body("projectName", Matchers.hasItems("Sigma","Kannada", "Mountain", "Acer"));
		
		
		
	}
}
