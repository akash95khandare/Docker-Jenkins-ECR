package com.bridgeLab.dataStructure.calendar;

import com.bridgelab.utility.Utility;

public class Calendar {

	public void display(String[][] mon) {
		for(int i=0; i<7; i++) {
			for(int j=0; j<7; j++) {
				if(mon[i][j]==null) break;
				System.out.print(mon[i][j]+"    ");
			}
			System.out.println();
		}
	}
	
	public String[][] calendar(int year, int m) {
		Month month = new Month();
		String mon[][] = month.monthCreation(m, year);
		System.out.println("\t Calender ");
		String nameMo[] = {"Jan","Feb","Mar","April","May","June","July","Aug","Sep","Oct","Nov","Dec"};
		System.out.println("\t "+year+" "+nameMo[m-1]);
		System.out.println("---------------------------------------------");
		return mon;
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Calendar calendar = new Calendar();
		Utility u = new Utility();
		int year = u.getInt("Enter year : ");
		int month = u.getInt("Enter month : ");
		String mon[][]=calendar.calendar(year, month);
		calendar.display(mon);
	}

}
