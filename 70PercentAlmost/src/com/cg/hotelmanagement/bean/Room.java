package com.cg.hotelmanagement.bean;

public class Room {
	private int roomid;
	private String roomtype;
	private boolean isbooked;
	private String roomowner;
	private String checkin;
	private String checkout;
	private int roomcost;
	private Customer customer;

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

	public String getCheckin() {
		return checkin;
	}

	public void setCheckin(String checkin) {
		this.checkin = checkin;
	}

	public String getCheckout() {
		return checkout;
	}

	public void setCheckout(String checkout) {
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
	 * @param roomid    the roomid
	 * @param roomtype  the roomtype
	 * @param isbooked  the isbooked
	 * @param roomowner the roomowner
	 * @param checkin   the checkin
	 * @param checkout  the checkout
	 * @param roomcost  the roomcost
	 * @param customer  the customer
	 */
	public Room(int roomid, String roomtype, boolean isbooked, String roomowner, String checkin, String checkout,
			int roomcost, Customer customer) {
		super();
		this.roomid = roomid;
		this.roomtype = roomtype;
		this.isbooked = isbooked;
		this.roomowner = roomowner;
		this.checkin = checkin;
		this.checkout = checkout;
		this.roomcost = roomcost;
		this.customer = customer;
	}

	@Override
	public String toString() {
		return "Room [roomid=" + roomid + ", roomtype=" + roomtype + ", isbooked=" + isbooked + ", roomowner="
				+ roomowner + ", checkin=" + checkin + ", checkout=" + checkout + ", roomcost=" + roomcost
				+ ", customer=" + customer + "]";
	}

}