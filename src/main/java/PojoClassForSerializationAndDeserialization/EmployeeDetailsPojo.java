package PojoClassForSerializationAndDeserialization;

public class EmployeeDetailsPojo {
//declare the variables Globally
	String EmpName;
	String EmpId;
	String Email;
	String Phone;
	String Address;
	
	//Initialization using parameterized constructor
	public EmployeeDetailsPojo(String empName, String empId, String email, String phone, String address) {
		super();
		EmpName = empName;
		EmpId = empId;
		Email = email;
		Phone = phone;
		Address = address;
	}
	public EmployeeDetailsPojo() {
		
	}
	//setters and getter methods
	public String getEmpName() {
		return EmpName;
	}

	public void setEmpName(String empName) {
		EmpName = empName;
	}

	public String getEmpId() {
		return EmpId;
	}

	public void setEmpId(String empId) {
		EmpId = empId;
	}

	public String getEmail() {
		return Email;
	}

	public void setEmail(String email) {
		Email = email;
	}

	public String getPhone() {
		return Phone;
	}

	public void setPhone(String phone) {
		Phone = phone;
	}

	public String getAddress() {
		return Address;
	}

	public void setAddress(String address) {
		Address = address;
	}
	
	
	
	
	
}
