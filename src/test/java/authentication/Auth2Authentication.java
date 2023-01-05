package authentication;

import org.testng.annotations.Test;

import io.restassured.response.Response;

import static io.restassured.RestAssured.*;

public class Auth2Authentication {
@Test
public void auth2() {
	Response res=
	given()
	.formParam("Client ID", "4b4fff7a58dd11c4c3af" )
	.formParam("Client secrets", "88edbe0406c248cd805e6e7dc5a8a9562674af6f")
	.formParam("grantType", "Authorization token")
	.when()
	.post("https://github.com/login/oauth/access_token");
	res.prettyPrint();
	System.out.println(res);
	String token=res.jsonPath().get("access_token");
	
	given()
	.auth().oauth2(token)
	.when()
	.get("https://api.github.com/user/repos")
	.then()
	.log().body();
	
}
}
