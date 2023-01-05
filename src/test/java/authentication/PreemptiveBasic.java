package authentication;

import org.testng.annotations.Test;

import com.RestAssured.GenericUtilities.GenericUtils;

import static io.restassured.RestAssured.*;

public class PreemptiveBasic extends GenericUtils{
@Test
public void preemptive() {
	
	given()
	.auth().preemptive().basic("rmgyantra", "rmgy@9999")
	.when()
	.get("/projects/TY_PROJ_2003") 
	.then()
	.log().body();
	
}
}
