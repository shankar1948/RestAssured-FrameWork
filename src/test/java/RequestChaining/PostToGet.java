package RequestChaining;

import org.apache.commons.lang3.RandomStringUtils;
import org.json.simple.JSONObject;
import org.testng.annotations.Test;

import com.RestAssured.GenericUtilities.GenericUtils;

import io.restassured.http.ContentType;
import io.restassured.response.Response;

import static io.restassured.RestAssured.*;

public class PostToGet extends GenericUtils {
@Test
public void chaining() {
	
	String alpha = RandomStringUtils.randomAlphabetic(2);
	JSONObject js=new JSONObject();
	js.put("createdBy", "Arun");
	js.put("projectName", "Acer"+alpha);
	js.put("status", "created");
	js.put("teamSize", 10);
	Response res=
	given()
	.body(js)
	.contentType(ContentType.JSON)
	.when()
	.post("/addProject");
	
	String pid=res.jsonPath().get("projectId");
	
	given()
	.pathParam("pd", pid)
	
	.when()
	.get("/projects/{pd}")
	.then()
	.log().body();
	
	
	
}
}
