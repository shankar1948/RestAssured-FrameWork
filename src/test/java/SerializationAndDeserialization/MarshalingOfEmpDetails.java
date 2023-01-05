package SerializationAndDeserialization;

import java.io.File;
import java.io.IOException;

import org.codehaus.jackson.JsonGenerationException;
import org.codehaus.jackson.map.JsonMappingException;
import org.codehaus.jackson.map.ObjectMapper;
import org.testng.annotations.Test;

import PojoClassForSerializationAndDeserialization.EmployeeDetailsPojo;

public class MarshalingOfEmpDetails {
@Test
public void serializationOfEmpDetails() throws Throwable, JsonMappingException, IOException {
	// Create the Object for Pojo Class
	EmployeeDetailsPojo emp = new EmployeeDetailsPojo("Arun","TYSS05","Arun@gmail","1253562","Gadag");
	//Create Object for Object Mapper
	ObjectMapper ob = new ObjectMapper();
	//Write the value for Json file
	ob.writeValue(new File("./empdetails.json"), emp);
}
}
