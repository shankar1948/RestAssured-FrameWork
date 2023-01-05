package CRUDOpertionsUsingBaseClass;

import static io.restassured.RestAssured.*;

import org.json.simple.JSONObject;
import org.testng.annotations.Test;

import com.RestAssured.GenericUtilities.GenericUtils;
import com.RestAssured.GenericUtilities.IpathConstants;

import io.restassured.http.ContentType;

public class PostDataUsingBaseClass extends GenericUtils {
@Test
public void postmethod()
{
	String alpha = alphabet();
	JSONObject js=new JSONObject();
	js.put("createdBy", "Arun");
	js.put("projectName", "Acer"+alpha);
	js.put("status", "created");
	js.put("teamSize", 10);
	
	given()
	.spec(requestSpec)
	.body(js)
	
	.when()
	.post(IpathConstants.createProject)
	.then()
	.log().body()
	.statusCode(201);
}
}
