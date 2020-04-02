package com.cg.bean.hotelmanagement;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.cg.bean.hotelmanagement.Listrooms.ROOM_COST;
import com.cg.bean.hotelmanagement.Listrooms.ROOM_TYPE;

public class Serviceslist {
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

	static List<Room> roomList = new ArrayList<Room>();
	static List<Customer> customerList = new ArrayList<>();

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("eneter ReceptionistServices");
		roomList.add(new Room(101, ROOM_TYPE.AC.toString(), true, "swetha", null, null, ROOM_COST.AC.val, null));
		roomList.add(new Room(102, ROOM_TYPE.NON_AC.toString(), false, "capg", null, null, ROOM_COST.NONAC.val, null));
		roomList.add(new Room(103, ROOM_TYPE.NON_AC.toString(), true, "peetha", null, null, ROOM_COST.NONAC.val, null));
		roomList.add(new Room(104, ROOM_TYPE.AC.toString(), false, "capg", null, null, ROOM_COST.AC.val, null));
		roomList.add(new Room(105, ROOM_TYPE.NON_AC.toString(), true, "aith", null, null, ROOM_COST.NONAC.val, null));
		roomList.add(new Room(106, ROOM_TYPE.AC.toString(), true, "sonu", null, null, ROOM_COST.AC.val, null));
		roomList.add(new Room(201, ROOM_TYPE.AC.toString(), false, "capg", null, null, ROOM_COST.AC.val, null));
		roomList.add(new Room(202, ROOM_TYPE.AC.toString(), true, "karthik", null, null, ROOM_COST.AC.val, null));

		int ReceptionistServices;
		//Customer c = new Customer("swathi", "3", "987565367", "hyd", "gnfgh@msil.com", "97856676");
		System.out.println("welcome to Tajhotel");
		while (true) {
			System.out.print("Enter the choice:");
			ReceptionistServices = sc.nextInt();

			switch (ReceptionistServices) {
			case 1:

				
                  formFill(sc);
				break;
			case 2:
		
                 viewcustomers();
				break;
			case 3:
				
				checkAvailability();
				break;
			case 4:
				System.out.println("enter your id");
			    String customerId=sc.next();
				
				bookRoom(sc, customerList.stream().filter(i->i.getCid().equalsIgnoreCase(customerId)).findFirst().get());
                break;
                
			case 5:
				System.out.println("enter customer id");
				String customerId1=sc.next();
				
				CancelRoom(sc,customerList.stream().filter(i->i.getCid().equalsIgnoreCase(customerId1)).findFirst().get());

			default:
				System.out.println("invalid option");
				break;
			}
		}
	}

	private static void bookRoom(Scanner sc, Customer c) {
		int noOfRoomsAvail = (int) roomList.stream().filter(r -> !r.isIsbooked()).count();
		System.out.println("No.of rooms available is:" + noOfRoomsAvail);

		System.out.print("Enter the number of rooms:");
		int count = sc.nextInt();

		if (count > noOfRoomsAvail) {
			System.out.println("Only this number of rooms available:" + noOfRoomsAvail);
		}

		if (noOfRoomsAvail > 0) {
			for (int i = 0; i < roomList.size(); i++) {
				if (roomList.get(i).isbooked == false && count > 0) {

					roomList.get(i).isbooked = true;
					roomList.get(i).customer = c;

					count--;
					System.out.println("Room allocated successfully and room id is:" + roomList.get(i).roomid);
				}

			}
		}
		if (noOfRoomsAvail == 0) {
			System.out.println("rooms not available");
		}
	}

	private static void checkAvailability() {
		int noOfRoomsAvai = (int) roomList.stream().filter(r -> !r.isIsbooked()).count();
		System.out.println("No.of rooms available is:" + noOfRoomsAvai);

		if (noOfRoomsAvai > 0) {
			for (int i = 0; i < roomList.size(); i++) {
				if (roomList.get(i).isbooked == false) {
					System.out.println("room is available with room no: " + roomList.get(i).roomid);
				}
			}
		} else {
			System.out.println("No Rooms available to book.");
		}
	}
	
	public static void formFill(Scanner s) 
	{
		System.out.println("enter customer details");
		System.out.println("enter customerName:");
		String customerName = s.next();
		System.out.println("enter cutomerId:");
		String customerId=s.next();
		System.out.println("enter customerNumber:");
		String customerNumber=s.next();
		System.out.println("enter customerPlace:");
		String customerPlace=s.next();
		System.out.println("enter customerMailId:");
		String customerMailId=s.next();
		System.out.println("enter customerPanNo:");
		String customerPanNo=s.next();
		Customer c1=new Customer(customerName,customerId,customerNumber,customerPlace,customerMailId,customerPanNo);
		customerList.add(c1);
		
	}
	public static void viewcustomers()
	{
		customerList.stream().forEach(System.out::println);
	}
	public static void CancelRoom(Scanner sc,Customer c)
	{
		//roomList.stream().filter
		
		
		
		
		
	}
	
}