package SerializationAndDeserialization;

import java.io.File;
import java.io.IOException;

import org.codehaus.jackson.JsonParseException;
import org.codehaus.jackson.map.JsonMappingException;
import org.codehaus.jackson.map.ObjectMapper;
import org.testng.annotations.Test;

import PojoClassForSerializationAndDeserialization.EmpDetailsWithObjectPojo;

public class UnmarshallingOfEmpObject {
@Test
public void deserializationOfObject() throws Throwable, JsonMappingException, IOException {
	ObjectMapper ob=new ObjectMapper();
	EmpDetailsWithObjectPojo emp=ob.readValue(new File("./empObject.json"), EmpDetailsWithObjectPojo.class);
	System.out.println(emp.getEmpSpouseDetails());
	System.out.println(emp.getClass()); //fully Qualified Class name
			
}
}
