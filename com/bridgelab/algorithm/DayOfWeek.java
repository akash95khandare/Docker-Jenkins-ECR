package com.bridgelab.algorithm;

import com.bridgelab.utility.Utility;

public class DayOfWeek {

	public static void dayOfWeek() {
		Utility u = new Utility();
		int d = u.getInt("Enter day : ");
		int m = u.getInt("Enter month : ");
		int y = u.getInt("Enter year : ");
		int y0 = y - (14 - m ) / 12;
		int x = y0 + y0 /4 - y0 /100 + y0 /400;
		int m0 = m + 12 * ((14 - m ) / 12) - 2;
		int d0 = ( d + x + 31*m0 / 12) % 7;
		
		switch(d0) {
		
		case 0:
				System.out.println("Sunday");
				break;
		case 1:
				System.out.println("Monday");
				break;
		case 2:
				System.out.println("Tuesday");
				break;
		case 3:
				System.out.println("Wednesday");
				break;
		case 4:
				System.out.println("Thursday");
				break;
		case 5:
				System.out.println("Friday");
				break;
		case 6:System.out.println("Saturday");
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		DayOfWeek.dayOfWeek();
	}

}
