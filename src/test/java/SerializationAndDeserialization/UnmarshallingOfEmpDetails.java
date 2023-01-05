package SerializationAndDeserialization;

import java.io.File;
import java.io.IOException;

import org.codehaus.jackson.JsonParseException;
import org.codehaus.jackson.map.JsonMappingException;
import org.codehaus.jackson.map.ObjectMapper;
import org.testng.annotations.Test;

import PojoClassForSerializationAndDeserialization.EmployeeDetailsPojo;

public class UnmarshallingOfEmpDetails {
@Test
public void deserializationOfEmpDetails() throws Throwable, JsonMappingException, IOException {
	// create the object for object mapper
	ObjectMapper ob=new ObjectMapper();
	
	//read the value from object mapper
	EmployeeDetailsPojo e=ob.readValue(new File("./empdetails.json"), EmployeeDetailsPojo.class);
	//fetch the value from the mapper
	System.out.println(e.getAddress());
	System.out.println(e.getEmpName());
}
}
