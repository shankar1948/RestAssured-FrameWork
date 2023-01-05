package CRUDOpertionsUsingBaseClass;

import org.testng.annotations.Test;

import com.RestAssured.GenericUtilities.GenericUtils;
import com.RestAssured.GenericUtilities.IpathConstants;

import static io.restassured.RestAssured.*;

public class GetSingleProject extends GenericUtils{
@Test
public void single() {
	given()
	.spec(requestSpec)
	.pathParam("projectId","TY_PROJ_818")
	.when()
	.get(IpathConstants.getSingleProject+"{projectId}")
	.then()
	.log().body();
}
}
