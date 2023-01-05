package Parameters;

import static io.restassured.RestAssured.*;

import org.testng.annotations.Test;

import com.RestAssured.GenericUtilities.GenericUtils;

public class PathParameter extends GenericUtils {
@Test
public void pathparam() {
	String pId="TY_PROJ_1002";
	given()
	.pathParam("projectId", pId)
	.when()
	.get("/projects/{projectId}")
	.then()
	.log().body();
}
}
