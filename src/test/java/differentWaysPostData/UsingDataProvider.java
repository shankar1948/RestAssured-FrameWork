package differentWaysPostData;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.RestAssured.GenericUtilities.GenericUtils;

import PojoClassForSerializationAndDeserialization.AddProjectPojo;
import io.restassured.http.ContentType;

import static io.restassured.RestAssured.*;

public class UsingDataProvider extends GenericUtils {

	@Test(dataProvider="provider")
	public void addProject(String createdBy, String projectName, String status, int teamSize ) {
		AddProjectPojo pj=new AddProjectPojo(createdBy,  projectName,  status, teamSize);
		
		given()
		.body(pj)
		.contentType(ContentType.JSON)
		.when()
		.post("/addProject")
		.then()
		.log().body()
		.statusCode(201)
		.extract().response().asString()
		.contains("Arun");
	}
	
	@DataProvider
	public Object[][] provider() {
		Object[][] ob=new Object[2][4];
		ob[0][0]="Arun";
		ob[0][1]="TYSS-Rmg7891";
		ob[0][2]="Created";
		ob[0][3]=5;
		
		ob[1][0]="Arun";
		ob[1][1]="RMG-TYss9511";
		ob[1][2]="Created";
		ob[1][3]=12;
		return ob;
	}
}
