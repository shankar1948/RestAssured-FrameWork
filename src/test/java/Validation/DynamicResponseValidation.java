package Validation;

import static io.restassured.RestAssured.*;

import org.hamcrest.Matchers;
import org.testng.annotations.Test;

import com.RestAssured.GenericUtilities.GenericUtils;

import io.restassured.response.Response;


public class DynamicResponseValidation extends GenericUtils {

	@Test
	public void dynamicValidation() {
		
				
		when()
		.get("/projects")
		.then()
		.log().body()
		.assertThat().body(("[4].projectName"), Matchers.equalTo("Delta1628"))
		.body("projectName",Matchers.hasItems("Alpha705", "Delta1628","Gamma4778"));
				
				
		
		
		
		
	
		
	}
	
}
