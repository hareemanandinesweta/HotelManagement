package com.cg.bean.hotelmanagement;

import java.sql.Timestamp;

public class Room 
{
	int roomid;
	String roomtype;
	boolean isbooked;
	Timestamp checkin;
	Timestamp checkout;
	int roomcost;
	Customer customer;
	public int getRoomid() {
		return roomid;
	}
	public void setRoomid(int roomid) {
		this.roomid = roomid;
	}
	public String getRoomtype() {
		return roomtype;
	}
	public void setRoomtype(String roomtype) {
		this.roomtype = roomtype;
	}
	public boolean isIsbooked() {
		return isbooked;
	}
	public void setIsbooked(boolean isbooked) {
		this.isbooked = isbooked;
	}
	public String getRoomowner() {
		return roomowner;
	}
	public void setRoomowner(String roomowner) {
		this.roomowner = roomowner;
	}
	public Timestamp getCheckin() {
		return checkin;
	}
	public void setCheckin(Timestamp checkin) {
		this.checkin = checkin;
	}
	public Timestamp getCheckout() {
		return checkout;
	}
	public void setCheckout(Timestamp checkout) {
		this.checkout = checkout;
	}
	public int getRoomcost() {
		return roomcost;
	}
	public void setRoomcost(int roomcost) {
		this.roomcost = roomcost;
	}
	public Customer getCustomer() {
		return customer;
	}
	public void setCustomer(Customer customer) {
		this.customer = customer;
	}
	
	
	/**
	 * Instantiates a new room.
	 *
	 * @param roomid the roomid
	 * @param roomtype the roomtype
	 * @param isbooked the isbooked
	 * @param roomowner the roomowner
	 * @param checkin the checkin
	 * @param checkout the checkout
	 * @param roomcost the roomcost
	 * @param customer the customer
	 */
	public Room(int roomid, String roomtype, boolean isbooked, Timestamp checkin, Timestamp checkout,
			int roomcost, Customer customer) {
		super();
		this.roomid = roomid;
		this.roomtype = roomtype;
		this.isbooked = isbooked;
		
		this.checkin = checkin;
		this.checkout = checkout;
		this.roomcost = roomcost;
		this.customer = customer;
	}
	@Override
	public String toString() {
		return "Room [roomid=" + roomid + ", roomtype=" + roomtype + ", isbooked=" + isbooked + ", checkin=" + checkin + ", checkout=" + checkout + ", roomcost=" + roomcost
				+ ", customer=" + customer + "]";
	}
	
	
	

}
