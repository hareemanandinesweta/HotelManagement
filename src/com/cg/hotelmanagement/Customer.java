package com.cg.bean.hotelmanagement;

public class Customer 
{
	private String cname;
	private String cid;
	private String cphoneno;
	private String place;
	private String emailid;
	private String PANno;
	public String getCname() {
		return cname;
	}
	public void setCname(String cname) {
		this.cname = cname;
	}
	public String getCid() {
		return cid;
	}
	public void setCid(String cid) {
		this.cid = cid;
	}
	public String getCphoneno() {
		return cphoneno;
	}
	public void setCphoneno(String cphoneno) {
		this.cphoneno = cphoneno;
	}
	public String getPlace() {
		return place;
	}
	public void setPlace(String place) {
		this.place = place;
	}
	public String getEmailid() {
		return emailid;
	}
	public void setEmailid(String emailid) {
		this.emailid = emailid;
	}
	public String getPANno() {
		return PANno;
	}
	public void setPANno(String pANno) {
		PANno = pANno;
	}
	
	public Customer(String cname, String cid, String cphoneno, String place, String emailid, String pANno) {
		super();
		this.cname = cname;
		this.cid = cid;
		this.cphoneno = cphoneno;
		this.place = place;
		this.emailid = emailid;
		PANno = pANno;
	}
	@Override
	public String toString() {
		return "Customer [cname=" + cname + ", cid=" + cid + ", cphoneno=" + cphoneno + ", place=" + place
				+ ", emailid=" + emailid + ", PANno=" + PANno + "]";
	}
	

}
