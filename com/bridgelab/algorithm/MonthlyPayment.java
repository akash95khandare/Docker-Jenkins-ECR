package com.bridgelab.algorithm;

import com.bridgelab.utility.Utility;

public class MonthlyPayment {

	public static void monthlypayment() {
		Utility u = new Utility();
		int p = u.getInt("Enter principal : ");
		int y = u.getInt("Enter no of year : ");
		float r = u.getFloat("Enter rate of interest : ");
		
		int noOfMonth = y*12;
		float rate = 	r/(12*100);
		float payment = (p*rate)/(1-(float)Math.pow((1+rate),(-noOfMonth)));
		System.out.println("Your monthly payment is : "+payment);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MonthlyPayment.monthlypayment();
	}

}
