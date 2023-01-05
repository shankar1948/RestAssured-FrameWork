package authentication;

import org.testng.annotations.Test;

import com.RestAssured.GenericUtilities.GenericUtils;

import static io.restassured.RestAssured.*;

public class DigestiveBasic extends GenericUtils{
@Test
public void digestive() {
	given()
	.auth().digest("rmgyantra", "rmgy")
	.when()
	.get("/projects/TY_PROJ_2003")
	.then()
	.log().body();
}
}
