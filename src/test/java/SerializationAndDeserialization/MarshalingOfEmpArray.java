package SerializationAndDeserialization;

import java.io.File;
import java.io.IOException;

import org.codehaus.jackson.JsonGenerationException;
import org.codehaus.jackson.map.JsonMappingException;
import org.codehaus.jackson.map.ObjectMapper;
import org.testng.annotations.Test;

import PojoClassForSerializationAndDeserialization.EmpDetailsUsingIntArrayPojo;

public class MarshalingOfEmpArray {
@Test
public void empArray() throws JsonGenerationException, JsonMappingException, IOException {
	long[] ph= {95684585l,845856235l};
	String[] email= {"bg@gamil.com","Aru@gmail.com"};
	EmpDetailsUsingIntArrayPojo emp = new EmpDetailsUsingIntArrayPojo("Arun","TYSS06",email, ph, "Karnataka");
	
	//Create object for mapper
	ObjectMapper ob=new ObjectMapper();
	ob.writeValue(new File("./EmpArray.json"), emp);
}
}
