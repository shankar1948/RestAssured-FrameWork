package PojoClassForSerializationAndDeserialization;

public class EmpSpouseDetails {
	String SpsName;
	String EmpId;
	String Email;
	String Phone;
	String Address;
	public EmpSpouseDetails(String spsName, String empId, String email, String phone, String address) {
		super();
		SpsName = spsName;
		EmpId = empId;
		Email = email;
		Phone = phone;
		Address = address;
	}
	public String getSpsName() {
		return SpsName;
	}
	public void setSpsName(String spsName) {
		SpsName = spsName;
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
