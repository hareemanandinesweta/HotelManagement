package com.cg.hotelmanagement.validation;

import java.util.Scanner;

public class ValidateMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub 
		
		Scanner sc = new Scanner(System.in);
		String Panno= sc.next();
		
		Validate val=new Validate();
		val.panNoValidation(Panno);

	}


}
