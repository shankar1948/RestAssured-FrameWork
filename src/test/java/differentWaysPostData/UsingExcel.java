package differentWaysPostData;

import static io.restassured.RestAssured.*;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.RestAssured.GenericUtilities.ExcelUtility;
import com.RestAssured.GenericUtilities.GenericUtils;

import PojoClassForSerializationAndDeserialization.AddProjectExcel;
import PojoClassForSerializationAndDeserialization.AddProjectPojo;
import io.restassured.http.ContentType;

public class UsingExcel extends GenericUtils 
{
	@Test(dataProvider = "dataxyz")
	public void excelDataTest(String createdBy, String projectName, String status, String teamSize) 
	{
		AddProjectExcel pj = new AddProjectExcel(createdBy, projectName, status, teamSize);

		given().body(pj).contentType(ContentType.JSON).when().post("/addProject")
		.then().log().body().statusCode(201);
	}

	@DataProvider(name = "dataxyz")
	public Object[][] provider() throws Throwable 
	{
		ExcelUtility ex = new ExcelUtility();
		Object[][] ob = ex.readDataFromDataProvider("Sheet3");
		return ob;
	}
}
