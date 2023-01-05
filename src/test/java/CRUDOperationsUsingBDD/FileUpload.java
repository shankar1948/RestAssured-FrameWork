package CRUDOperationsUsingBDD;

import static io.restassured.RestAssured.*;

import java.io.File;

import org.testng.annotations.Test;

public class FileUpload {
@Test
public void petImage() {
	
	File file = new File("C:\\Users\\B G ARUNKUMAR\\Pictures\\Screenshots\\Screenshot (10).png");
	given()
	.multiPart("file",file,"multipart/formdata")
	.when()
	.post("https://the-internet.herokuapp.com/upload")
	
	.then()
	.log().body()
	.statusCode(200);
	
}
}
