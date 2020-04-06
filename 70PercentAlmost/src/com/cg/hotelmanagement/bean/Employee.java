package com.cg.hotelmanagement.bean;


public class Employee {
	
	private String name;
	private String empID;
	private String empPassword;
	private String phoneNumber;
	private String salary;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEmpID() {
		return empID;
	}
	public void setEmpID(String empID) {
		this.empID = empID;
	}
	public String getEmpPassword() {
		return empPassword;
	}
	public void setEmpPassword(String empPassword) {
		this.empPassword = empPassword;
	}
	public String getPhonenumber() {
		return phoneNumber;
	}
	public void setPhonenumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}
	public String getSalary() {
		return salary;
	}
	public void setSalary(String salary) {
		this.salary = salary;
	}
	@Override
	public String toString() {
		return "Employee [name=" + name + ", empID=" + empID + ", empPassword=" + empPassword + ", phonenumber="
				+ phoneNumber + ", salary=" + salary + "]";
	}
	
	public Employee(String name, String empID, String empPassword, String phoneNumber, String salary) 
	{
		this.name = name;
		this.empID = empID;
		this.empPassword = empPassword;
		this.phoneNumber = phoneNumber;
		this.salary = salary;
	}
	
}