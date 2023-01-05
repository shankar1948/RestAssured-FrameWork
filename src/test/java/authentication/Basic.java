package authentication;

import static io.restassured.RestAssured.*;

import org.testng.annotations.Test;

import com.RestAssured.GenericUtilities.GenericUtils;

public class Basic extends GenericUtils {
@Test
public void basicAuth() {
	
	given()
	.auth().basic("rmg", "rmgy")
	.when()
	.get("projects/TY_PROJ_1002")
	.then()
	.log().body();
	
}

}
