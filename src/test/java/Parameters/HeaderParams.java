package Parameters;

import static io.restassured.RestAssured.*;

import org.testng.annotations.Test;

import com.RestAssured.GenericUtilities.GenericUtils;

public class HeaderParams extends GenericUtils {
@Test
public void header() {
	given()
	.param("Name", "Arun")
	.header("HeaderName", "Testing")
	.when()
	.get("/projects/TY_PROJ_1003")
	.then()
	.log().all();
}
}
