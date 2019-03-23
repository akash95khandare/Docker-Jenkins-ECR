package com.bridgeLab.dataStructure.calendar;

import com.bridgelab.utility.Utility;

public class Month {

	String month[][] = new String[7][7];
//	int mo=1;
	int y=2019;
	int janFirstDay=3;
//	int emptyBlock;
	int start=1;
	int mn[] = {31,28,31,30,31,30,31,31,30,31,30,31};
	Utility u =new Utility();

	public String[][] monthCreation(int mon,int year) {
		int day = decision(year);
//		System.out.println(day);
		int temp=0;
		for(int i=0; i<mon-1; i++) {
			temp = temp+mn[i]%7;
		}
		if(u.isLeapYear(year) && mon>2) temp+=1;
		temp=temp%7+day;
//		System.out.println(temp);
		month[0][0]="S";
		month[0][1]="M";
		month[0][2]="T";
		month[0][3]="W";
		month[0][4]="Th";
		month[0][5]="F";
		month[0][6]="S";
		int tempStart = start;
		for(int i=1; i<7; i++) {
			for(int j=0; j<7; j++) {
				if(temp>1) {
				month[i][j]=" ";
				temp--;
				continue;
				}
				if(tempStart<=mn[mon-1]) {
					month[i][j]=String.valueOf(tempStart);
					tempStart++;
				}else {
					if(mon==2) {
						month[i][j]=String.valueOf(29); 
						mon++;
						break;
					}
				}
			}
		}
		return month;
	}
	
	public int decision(int year) {
		int tempYear = y;
		int day = janFirstDay;
		while(tempYear<year) {
			if(u.isLeapYear(tempYear)) {
				day+=2;
			}else {
				day++;
			}
			tempYear++;
		}
		while(tempYear>year) {
			if(day==0) day=7;
			if(u.isLeapYear(tempYear)) {
				day-=2;
			}else {
				day--;
			}
			tempYear--;
		}
		return day;
	}
	
	
}
