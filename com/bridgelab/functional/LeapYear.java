package com.bridgelab.functional;

import com.bridgelab.utility.Utility;

public class LeapYear {

	public static void main(String args[]) {
	
		Utility u = new Utility();
		int year = u.getInt("Enter year : ");
		if(u.isLeapYear(year)) System.out.println("Year is leap year.");
		else System.out.println("Year is not leap year.");
	}
}
