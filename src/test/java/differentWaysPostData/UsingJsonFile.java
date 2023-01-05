package differentWaysPostData;

import static io.restassured.RestAssured.*;

import java.io.File;

import org.testng.annotations.Test;

import com.RestAssured.GenericUtilities.GenericUtils;

import io.restassured.http.ContentType;

public class UsingJsonFile extends GenericUtils{
	@Test
	public void jsonFile() {
		File f=new File("./src/test/resources/JsonBody.json");
		given()
		.body(f)
		.contentType(ContentType.JSON)
		.when()
		.post("/addProject")
		
		
		.then()
		
		.assertThat()
		.statusCode(201)
		
		.contentType(ContentType.JSON)
		.statusLine("HTTP/1.1 201 ")
		.log().all();
	}
		
		
	
}
