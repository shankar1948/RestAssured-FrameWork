package authentication;

import org.testng.annotations.Test;

import static io.restassured.RestAssured.*;

public class BearerToken {
@Test
public void token()
{
	given()
	.auth().oauth2("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")
	.when()
	.get("https://api.github.com/users/bgarun/repos")
	.then()
	.log().body();
}
}
