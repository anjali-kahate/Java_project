package Emp.model;

public class EmployModel {
	private int EmpId;
	private String EmpName;
	private float EmpSalary;
	private int EmpPhone;
	private String EmpAddress;
	
	public int getEmpId() {
		return EmpId;
	}
	public void setEmpId(int empId) {
		EmpId = empId;
	}
	public String getEmpName() {
		return EmpName;
	}
	public void setEmpName(String empName) {
		EmpName = empName;
	}
	public float getEmpSalary() {
		return EmpSalary;
	}
	public void setEmpSalary(float empSalary) {
		EmpSalary = empSalary;
	}
	public int getEmpPhone() {
		return EmpPhone;
	}
	public void setEmpPhone(int empPhone) {
		EmpPhone = empPhone;
	}
	public String getEmpAddress() {
		return EmpAddress;
	}
	public void setEmpAddress(String empAddress) {
		EmpAddress = empAddress;
	}
	@Override
	public String toString() {
		return "EmployModel [EmpId=" + EmpId + ", EmpName=" + EmpName + ", EmpSalary=" + EmpSalary + ", EmpPhone="
				+ EmpPhone + ", EmpAddress=" + EmpAddress + "]";
	}
	
}
