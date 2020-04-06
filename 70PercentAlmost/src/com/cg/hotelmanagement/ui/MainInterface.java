package com.cg.hotelmanagement.ui;

import java.sql.*;
import java.util.*;

import com.cg.hotelmanagement.bean.Admin;
import com.cg.hotelmanagement.bean.City;
import com.cg.hotelmanagement.bean.Customer;
import com.cg.hotelmanagement.bean.Employee;
import com.cg.hotelmanagement.bean.Hotel;
import com.cg.hotelmanagement.bean.Room;
import com.cg.hotelmanagement.service.ServiceImpt;

public class MainInterface {

	enum ROOM_COST {

		AC(4000), NONAC(2000);

		public final int val;

		ROOM_COST(int val) {
			this.val = val;
		}
	}

	enum ROOM_TYPE {
		AC, NON_AC;
	}
	// Customer Cust = new Customer();

	public static void main(String args[])

	{
		boolean loggedin = false;
		int count = 0;
		boolean userEntered = false;
		String id;
		Timestamp ts = new Timestamp(10000);
		ServiceImpt serv = new ServiceImpt();
		Scanner scr = new Scanner(System.in);
		ArrayList<Hotel> hotelList = new ArrayList<>(); // List of Hotels
		ArrayList<Hotel> hotelList2 = new ArrayList<>();
		ArrayList<Room> roomList = new ArrayList<>(); // List of rooms
		ArrayList<City> cityList = new ArrayList<>();
		ArrayList<ArrayList<Room>> wholeRoomList = new ArrayList<>();
		ArrayList<Customer> CustomerList = new ArrayList<>();
		ArrayList<Admin> adminList = new ArrayList<>();

		cityList.add(new City("11", "Bangalore", hotelList));
		cityList.add(new City("11", "Delhi", hotelList2));

		/*
		 * Room R1 = new Room(101, "Budget", false, "SomeDate", "Somedate", 2400, new
		 * Customer("", "", "", "", "")); Room R2 = new Room(102, "Budget", true,
		 * "SomeDate", "SomeDate", 1400, new Customer("", "", "", "", "")); Room R3 =
		 * new Room(103, "Budget", false, "SomeDate", "SomeDate", 1400, new Customer("",
		 * "", "", "", ""));
		 */
		roomList.add(new Room(101, ROOM_TYPE.AC.toString(), false, "swetha", null, null, ROOM_COST.AC.val, null));
		roomList.add(new Room(102, ROOM_TYPE.NON_AC.toString(), false, "capg", null, null, ROOM_COST.NONAC.val, null));
		roomList.add(
				new Room(103, ROOM_TYPE.NON_AC.toString(), false, "peetha", null, null, ROOM_COST.NONAC.val, null));
		roomList.add(new Room(104, ROOM_TYPE.AC.toString(), false, "capg", null, null, ROOM_COST.AC.val, null));
		roomList.add(new Room(105, ROOM_TYPE.NON_AC.toString(), false, "aith", null, null, ROOM_COST.NONAC.val, null));
		roomList.add(new Room(106, ROOM_TYPE.AC.toString(), false, "sonu", null, null, ROOM_COST.AC.val, null));
		roomList.add(new Room(201, ROOM_TYPE.AC.toString(), false, "capg", null, null, ROOM_COST.AC.val, null));
		roomList.add(new Room(202, ROOM_TYPE.AC.toString(), false, "karthik", null, null, ROOM_COST.AC.val, null));

//		ArrayList<Room> roomList2 = new ArrayList<>(roomList1);
//		ArrayList<Room> roomList3 = new ArrayList<>(roomList1);
//		ArrayList<Room> roomList4 = new ArrayList<>(roomList1);

		/*
		 * Collections.copy(roomList2,roomList1); Collections.copy(roomList3,roomList1);
		 * Collections.copy(roomList4,roomList1);
		 */

		/*
		 * wholeRoomList.add(roomList1); wholeRoomList.add(roomList2);
		 * wholeRoomList.add(roomList3); wholeRoomList.add(roomList4);
		 */
		Hotel H1 = new Hotel("111", "Taj", "5-Star", "SomeAdress", "9929391993", "4.2", roomList);
		Hotel H2 = new Hotel("112", "Dhaba", "1-Star", "SomeAdress", "9929391493", "3.5", roomList);
		Hotel H3 = new Hotel("113", "Prakash", "3-Star", "SomeAdress", "4929391993", "4.4", roomList);
		Hotel H4 = new Hotel("114", "The leela", "5-Star", "SomeAdress", "5929391993", "4.5", roomList);
		Hotel H5 = new Hotel("115", "Marriote", "5-Star", "SomeAdress", "5924391993", "4.4", roomList);
		Hotel H6 = new Hotel("114", "Hyatt", "5-Star", "SomeAdress", "5929391993", "4.6", roomList);

		hotelList.add(H1);
		hotelList.add(H2);
		hotelList.add(H3);
		hotelList.add(H4);

		hotelList2.add(H5);
		hotelList2.add(H2);
		hotelList2.add(H6);
		hotelList2.add(H4);

		// System.out.println(wholeRoomList);

		System.out.println(cityList);
		System.out.println("Log in as: \n1.Customer \n2.Employee");
		int option = scr.nextInt();

		boolean user = serv.ChooseInitialOption(option);

		if (user) {
			while (true) {
				HashMap<Customer, String> CustMap = new HashMap<>(); // String is password here.

				Customer C1 = new Customer("2001", "Dinesh", "Sharma", "9897210076", "Male");
				Customer C2 = new Customer("2002", "Harshit", "Joshi", "8321884292", "Male");
				Customer C3 = new Customer("2003", "Anand", "Soni", "2837137912", "Female");

				serv.SignIn(C1, CustomerList);
				serv.SignIn(C2, CustomerList);
				serv.SignIn(C3, CustomerList);

				CustMap.put(C1, "muzikfreak");
				CustMap.put(C2, "khabib");
				CustMap.put(C3, "12345");

				// System.out.println(CustMap.entrySet());

				System.out.println("Enter you ID");
				id = scr.next();

				System.out.println("Enter your password");
				String pass = scr.next();
				for (Customer cs : CustomerList) {
					if (cs.getCustId().equalsIgnoreCase(id)) {
						loggedin = serv.logIn(cs, id, CustMap, pass);
						break;

					}
				}

				if (loggedin) {
					while (true) {
						System.out.println(
								"Select an option:\n 1.Show your profile\n 2.Search hotel on the basis of City: \n 3.Show List of hotels and choose a hotel to check.\n 4.CheckAvailabilty\n 5.Cancel Booked room?\n 6.Check Out?");
						int opt = scr.nextInt();

						for (Customer cst : CustomerList) {
							if (cst.getCustId().equals(id)) {
								switch (opt) {
								case 1:
									System.out.println("--------------YOUR PROFILE---------------");
									serv.custProfileDetails(cst);
									break;
								case 2:
									System.out.println("Enter city name: \n1.Banglore\n2.Delhi");
									String cityOpt = scr.next();
									serv.searchHotel(cityList, cityOpt);
									break;

								case 3:
									System.out.println("--------------HOTEL LIST-----------------");
									serv.viewHotelList(hotelList);
									System.out.println("Enter a hotel name you want to check");
									String hotOpt = scr.next();
									Hotel hotelSelected = serv.getHotel(hotOpt, hotelList);

									// System.out.println(hotelSelected);

									System.out.println("------------Do you want to book room from "
											+ hotelSelected.getHotelName() + "(Y/N)------------");
									System.out.println(
											"------------------------------------------------------------------------\n");
									String yesno = scr.next();
									if (yesno.equalsIgnoreCase("Y")) {
										int noOfRoomsAvail = (int) hotelSelected.getRoomList().stream()
												.filter(r -> !r.isIsbooked()).count();
										System.out.println("No.of rooms available is:" + noOfRoomsAvail);
										System.out.println(
												"------------------------------------------------------------------------\n");
										System.out.println("Enter the number of rooms you want to book:");
										System.out.println(
												"------------------------------------------------------------------------\n");
										int numBook = scr.nextInt();
										serv.bookRoom(roomList, cst, noOfRoomsAvail, numBook);
									}

									else {
										System.out.println("See you later!");
										System.exit(1);
									}

									break;
								/*
								 * ArrayList<Room> rlist = hotelSelected.getRoomList();
								 * 
								 * for (Room r : rlist) { if (!r.isIsbooked()) {
								 * 
								 * count++; } }
								 */
								case 4:
									System.out.println("Enter a hotel name you want to see availabilty:");
									System.out.println(
											"------------------------------------------------------------------------\n");
									String hotOpt1 = scr.next();
									Hotel hotelSelected1 = serv.getHotel(hotOpt1, hotelList);
									int noOfRoomsAvai = (int) hotelSelected1.getRoomList().stream()
											.filter(r -> !r.isIsbooked()).count();
									System.out.println("No.of rooms available is:" + noOfRoomsAvai);

									System.out.println(
											"------------------------------------------------------------------------\n");

									serv.checkAvailablity(roomList, noOfRoomsAvai);
									break;

								case 5:
									System.out.println(
											"------------------Cancellation Rooms for which hotel?------------------ ");
									System.out.println(
											"------------------------------------------------------------------------\n");
									String hotOpt2 = scr.next();
									Hotel hotelSelected3 = serv.getHotel(hotOpt2, hotelList);
									serv.cancelRoom(hotelSelected3.getRoomList(), cst);
									break;

								case 6:
									System.out.println("Check out for" + cst.getFname());
									serv.checkOut(cst.getCustId(), roomList);
									break;
//----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
								/*
								 * System.out.println(count + " rooms are avalaible! Hurry up!");
								 * System.out.println( "Do you want to book a room from " +
								 * hotelSelected.getHotelName() + ": Y/N"); String bookopt = scr.next();
								 * 
								 * if (bookopt.equalsIgnoreCase("Y")) { System.out.println("Rooms available: ");
								 * for (Room rl : rlist) { if (!rl.isIsbooked()) {
								 * System.out.println(rl.getRoomid()); } }
								 * System.out.println("Which room do you want to book?"); int roomNo =
								 * scr.nextInt(); for (Room r : rlist) { if (roomNo == r.getRoomid()) {
								 * 
								 * System.out.println("Congratulations! Room Booked: " + r.getRoomid());
								 * r.setIsbooked(true); count = 0; } } System.out.println(rlist); }
								 */

//--------------------------------------------------------------------------------------------------------------------------------------------------

								}

							}
						}

					}
					// ----------------------------------------------------------------------------------------------
				} else {
					System.out.println("Invalid password or username!!");
				}
			}
		} else if (!user) {
			while (true) {
				HashMap<Admin, String> AdminHash = new HashMap<>();
				Admin A1 = new Admin("11");
				Admin A2 = new Admin("22");

				AdminHash.put(A1, "hahahah");
				AdminHash.put(A2, "hohohoho");
				while (true) {
					System.out.println("Enter your UserName");
					id = scr.next();
					System.out.println("Enter your Password");
					String pass2 = scr.next();

					boolean adminLoggedIn = serv.logInAdmin(A1, id, AdminHash, pass2);

					if (adminLoggedIn) {

						System.out.println("Admin switch cases");
						// Switch cases
					}

//						  
				}
			}

		} else {
			System.out.println("Invalid Option");
		}
	}
}
