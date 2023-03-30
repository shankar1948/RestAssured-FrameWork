package practice;

import org.json.simple.JSONObject;
import org.testng.Assert;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.RestAssured.*;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class Program1 {
	@Test
	public void m1() 
	{
//		JSONObject jobj=new JSONObject();
//		jobj.put("createdBy","aandi");
//		jobj.put("projectName","shawshank redemption");
//		jobj.put("status", "created");
//		jobj.put("teamSize", 10);
		
		RequestSpecification req = RestAssured.given();
//		req.body(jobj);
//		req.contentType(ContentType.JSON);
		
		Response res = req.get("rmgtestingserver:8084/projects");
		
		int actstatuscode = res.getStatusCode();
		
		Assert.assertEquals(actstatuscode, 200);
	}
}
