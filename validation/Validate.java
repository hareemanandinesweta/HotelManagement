package com.cg.hotelmanagement.validation;

import java.util.Date;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Validate {
	
	public static void cnameValidation(String cname) throws HotelManagementException {
		String pattern="[A-za-z](3,10)";
		if(!cname.matches(pattern))
			throw new HotelManagementException("Enter customer name in alphabet only");
	}
	
	public static void cidValidation(String cid) throws HotelManagementException {
		String pattern="[0-9](4,10)";
		if(!cid.matches(pattern))
			throw new HotelManagementException("Enter customer id in digit only");
	}
	
   public static String cphonenoValidation(String cphoneno) throws HotelManagementException {
		Pattern p=Pattern.compile("(0/91)?[7-9][0-9]{9})");
		Matcher m = p.matcher(cphoneno);
		if (!(m.find() && m.group().equals(cphoneno)))
			throw new HotelManagementException("Enter a valid phone number");
		return cphoneno;
 }
	
   public static String emailIdValidation(String email) throws HotelManagementException {

		String emailRegex = "^[a-zA-Z0-9_+&*-]+(?:\\." + "[a-zA-Z0-9_+&*-]+)*@"
				+ "(?:[a-zA-Z0-9-]+\\.)+[a-z" + "A-Z]{2,7}$";
		Pattern pat = Pattern.compile(emailRegex);
		if (email == null)
			throw new HotelManagementException("Enter a valid email address");
		if (!(pat.matcher(email).matches()))
			throw new HotelManagementException("Enter a valid email address");
		return email;
	}
	
	
  public static void panNoValidation(String Panno) throws HotelManagementException {
    if(Panno.matches("[A-Z]{3}[0-9]{4}[A-Z]{1}"))
    {
    System.out.println("Valid");
    }
   else 
  System.out.println("Invalid");
  }

  
  public static void addressValidation(String address) throws HotelManagementException {
   String addressToken="[\\p{Punct}&&[#,.()-]]+\\d*+\\s?+[\\p{Alpha}+\\s?]*";

    String addressPattern="("+addressToken+"){1,6}";

        if(address.matches(addressPattern))

         System.out.println("You entered a VALID Home Address format.");

       else

         System.out.println("You entered an INVALID Home Address format.");

       }


public static boolean validateCheckInCheckOutDate(Date checkIn,Date checkOut) throws HotelManagementException {
	if (checkIn.after(checkOut))
		throw new HotelManagementException("CheckOut date should after checkIn date");
	return true;
}
}
	

		

	
	


