package authentication;

import org.testng.annotations.Test;

import io.restassured.response.Response;

import static io.restassured.RestAssured.*;

public class Auth02CoopChicken {
@Test
public void auth2() {
	Response res=
	given()
	.formParam("client_id", "RestAssuredAPITYSS")
	.formParam("client_secret", "a1addec8fadf369e4472b60df9ab8e7d")
	.formParam("grant_type", "client_credentials")
	.formParam("redirect_uri", "http://postman.com")
	.when()
	.post("http://coop.apps.symfonycasts.com/token");
	String token=res.jsonPath().get("access_token");
	given()
	.auth().oauth2(token)
	.pathParam("UserID", 4162)
	.when()
	.post("http://coop.apps.symfonycasts.com/api/{UserID}/eggs-count")
	.then()
	.log().body();
	
}
}
