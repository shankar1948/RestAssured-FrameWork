package differentWaysPostData;

import static io.restassured.RestAssured.given;

import java.io.File;

import org.testng.annotations.Test;

import com.RestAssured.GenericUtilities.GenericUtils;

import PojoClassForSerializationAndDeserialization.AddProjectPojo;
import io.restassured.http.ContentType;

public class UsingPojoClass extends GenericUtils {
	@Test
	public void pojoClass() {
		AddProjectPojo pj=new AddProjectPojo("Arun", "Ford", "ongoing",10);
		given()
		.body(pj)
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
