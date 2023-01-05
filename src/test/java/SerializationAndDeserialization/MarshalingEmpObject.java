package SerializationAndDeserialization;

import java.io.File;
import java.io.IOException;


import org.codehaus.jackson.map.JsonMappingException;
import org.codehaus.jackson.map.ObjectMapper;
import org.testng.annotations.Test;

import PojoClassForSerializationAndDeserialization.EmpDetailsWithObjectPojo;
import PojoClassForSerializationAndDeserialization.EmpSpouseDetails;

public class MarshalingEmpObject {
@Test
public void empObject() throws Throwable, JsonMappingException, IOException {
	
	String[] email= {"Arun@gmail", "BG@gmail"};
	EmpSpouseDetails spouse = new EmpSpouseDetails("G", "TYS02", "G@gmail", "9568547855", "Gajendragada");
	EmpDetailsWithObjectPojo emp = new EmpDetailsWithObjectPojo("Arun", "TYSS02", email, "985642533", "Haveri",spouse);
	ObjectMapper ob = new ObjectMapper();
	ob.writeValue(new File("./empObject.json"), emp);
}
}
