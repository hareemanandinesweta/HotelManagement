package com.cg.hotelmanagement.bean;

public class Customer {

	private String custId;
	private String fname;
	private String lname;
	private String phoneNo;
	private String gender;
	
	@Override
	public String toString() {
		return "Customer [custId=" + custId + ", fname=" + fname + ", lname=" + lname + ", phoneNo=" + phoneNo
				+ ", gender=" + gender + "]";
	}
	public String getCustId() {
		return custId;
	}
	public void setCustId(String custId) {
		this.custId = custId;
	}
	public String getFname() {
		return fname;
	}
	public void setFname(String fname) {
		this.fname = fname;
	}
	public String getLname() {
		return lname;
	}
	public void setLname(String lname) {
		this.lname = lname;
	}
	public String getPhoneNo() {
		return phoneNo;
	}
	public void setPhoneNo(String phoneNo) {
		this.phoneNo = phoneNo;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	
	public Customer(String custId, String fname, String lname, String phoneNo, String gender)
	{
		this.custId = custId;
		this.fname = fname;
		this.lname = lname;
		this.phoneNo = phoneNo;
		this.gender = gender;
	}
}
