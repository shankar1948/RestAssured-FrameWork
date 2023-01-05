package CRUDOpertionsUsingBaseClass;

import org.testng.annotations.Test;

import com.RestAssured.GenericUtilities.GenericUtils;
import com.RestAssured.GenericUtilities.IpathConstants;

import static io.restassured.RestAssured.*;

public class GetOperation extends GenericUtils {
@Test
public void getMethod() {
	given()
	.spec(requestSpec)
	.when()
	.get(IpathConstants.getProjectList)
	.then()
	.assertThat().statusCode(200);
}
}
