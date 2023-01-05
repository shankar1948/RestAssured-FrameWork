package CRUDOperationsUsingBDD;

import static io.restassured.RestAssured.*;

import java.util.List;

import org.testng.annotations.Test;

import io.restassured.response.Response;

public class GetFromReqres {
@Test
public void getMethod() {
	String exp="eve.holt@reqres.in";
	Response res = 
	when()
	.get("https://reqres.in/api/users");
	List<Object> act = res.jsonPath().get("data");
	for(Object b:act) {
		String data = b.toString();
		if(data.contains(exp)) {
			System.out.println(data);
			break;
		}
	}
	
}
}
