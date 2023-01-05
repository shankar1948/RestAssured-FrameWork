package CRUDOperationsUsingBDD;

import org.hamcrest.Matchers;
import org.json.simple.JSONObject;
import org.testng.annotations.Test;

import com.RestAssured.GenericUtilities.GenericUtils;

import io.restassured.http.ContentType;
import io.restassured.response.Response;

import static io.restassured.RestAssured.given;
import static io.restassured.response.Response.*;

import java.util.regex.Matcher;

public class AssertionWithContainsMethod extends GenericUtils{
	@Test
	public void postMethod() {
		//create object for Json Body
		//HashMap js=new HashMap();
		String alpha = alphabet();
		String exp = "Acer03"+alpha;
		JSONObject js=new JSONObject();
		js.put("createdBy", "Arun");
		js.put("projectName", "Acer03"+alpha);
		js.put("status", "created");
		js.put("teamSize", 10);
		
		
		given()
				.body(js)
				.contentType(ContentType.JSON)
				.when()
				.post("/addProject")
		
		.then()
		.body("msg", Matchers.equalTo("Successfully Added"))
		.log().body();
		
		 
				
	
	
	}	
}
