package PojoClassForSerializationAndDeserialization;

public class EmpDetailsUsingIntArrayPojo {
	String EmpName;
	String EmpId;
	String[] Email;
	long[] Phone;
	String Address;
	public EmpDetailsUsingIntArrayPojo(String empName, String empId, String[] email, long[] phone, String address) {
		super();
		EmpName = empName;
		EmpId = empId;
		Email = email;
		Phone = phone;
		Address = address;
	}
	public EmpDetailsUsingIntArrayPojo(){
		
	}
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
	public String[] getEmail() {
		return Email;
	}
	public void setEmail(String[] email) {
		Email = email;
	}
	public long[] getPhone() {
		return Phone;
	}
	public void setPhone(long[] phone) {
		Phone = phone;
	}
	public String getAddress() {
		return Address;
	}
	public void setAddress(String address) {
		Address = address;
	}
	
}
