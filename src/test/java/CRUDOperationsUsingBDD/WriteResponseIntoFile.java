package CRUDOperationsUsingBDD;

import org.testng.annotations.Test;

import com.RestAssured.GenericUtilities.GenericUtils;
import com.google.common.io.Files;

import io.restassured.response.Response;

import static io.restassured.RestAssured.*;

import java.io.File;
import java.io.IOException;
import java.io.InputStream;

public class WriteResponseIntoFile extends GenericUtils{

	@Test
	public void usingAsString() throws Throwable {
		Response res=
		given()
		.pathParam("projectId", "TY_PROJ_1002")
		.when()
		.get("/projects/{projectId}");
		String resp=res.asString();
		byte[] bytes = resp.getBytes();
		File file=new File("./src/test/resources/usingAsString.json");
		Files.write(bytes, file);	
	}
	
	@Test
	public void usingInputStream() throws Throwable {
		Response res=
				given()
				.pathParam("projectId", "TY_PROJ_1002")
				.when()
				.get("/projects/{projectId}");
				 InputStream resp = res.asInputStream();
				byte[] ipres = new byte[resp.available()];
				resp.read(ipres);
				File file=new File("./src/test/resources/usingInputStream.json");
				Files.write(ipres, file);
	}
	
	@Test
	public void directBytes() throws Throwable {
		Response res=
				given()
				.pathParam("projectId", "TY_PROJ_1002")
				.when()
				.get("/projects/{projectId}");
				  byte[] resp = res.asByteArray();
				
				File file=new File("./src/test/resources/DirectBytes.json");
				Files.write(resp, file);
	}
}
