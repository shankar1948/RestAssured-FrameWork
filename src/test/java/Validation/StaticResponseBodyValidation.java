package Validation;

import static io.restassured.RestAssured.*;

import org.hamcrest.Matchers;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.RestAssured.GenericUtilities.GenericUtils;

import io.restassured.response.Response;


public class StaticResponseBodyValidation extends GenericUtils{
	@Test
	public void assertion() {
		//Response response=

				when()
				.get("/projects/TY_PROJ_1008")
				.then()
				.log().body()
				.statusCode(200)
				.assertThat().body("projectName", Matchers.equalTo("Alpha4073"));
				


	}
}
