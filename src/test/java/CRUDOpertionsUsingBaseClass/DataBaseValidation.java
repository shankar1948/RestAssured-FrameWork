package CRUDOpertionsUsingBaseClass;

import org.json.simple.JSONObject;
import org.testng.annotations.Test;

import com.RestAssured.GenericUtilities.GenericUtils;
import com.RestAssured.GenericUtilities.IpathConstants;

import io.restassured.response.Response;
import junit.framework.Assert;

import static io.restassured.RestAssured.*;

public class DataBaseValidation extends GenericUtils{
	@Test
	public void database() throws Throwable
	{
		String alpha = alphabet();
		JSONObject js=new JSONObject();
		js.put("createdBy", "Arun");
		js.put("projectName", "Acer"+alpha);
		js.put("status", "created");
		js.put("teamSize", 10);
		Response res=
	given()
	.spec(requestSpec)
	.body(js)
	
	.when()
	.post(IpathConstants.createProject);
	String expdata = restAssured.getJsonData(res, "projectId");
	System.out.println(expdata);
	String query="select * from project";
	
	String act=database.executeQueryAndGetData(query, 1, expdata);
	
	Assert.assertEquals(expdata, act);
		
}
}
