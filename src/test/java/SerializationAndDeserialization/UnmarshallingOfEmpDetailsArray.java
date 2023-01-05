package SerializationAndDeserialization;

import java.io.File;
import java.io.IOException;


import org.codehaus.jackson.map.JsonMappingException;
import org.codehaus.jackson.map.ObjectMapper;
import org.testng.annotations.Test;

import PojoClassForSerializationAndDeserialization.EmpDetailsUsingIntArrayPojo;

public class UnmarshallingOfEmpDetailsArray {
@Test
public void deserializationOfEmpArray() throws Throwable, JsonMappingException, IOException {
	ObjectMapper ob=new ObjectMapper();
	EmpDetailsUsingIntArrayPojo emp=ob.readValue(new File("./EmpArray.json"), EmpDetailsUsingIntArrayPojo.class);
	String[] mail = emp.getEmail();
	long[] phone = emp.getPhone();
	for(int i=0; i<mail.length;i++) {
		System.out.print(mail[i]+", ");
	}
	
}
}
