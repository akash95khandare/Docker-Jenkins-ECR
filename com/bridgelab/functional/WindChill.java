package com.bridgelab.functional;

import java.util.Scanner;

import com.bridgelab.utility.Utility;

public class WindChill { 
	
	public static void main(String args[]) {
		Utility u = new Utility();
		int temp = u.getInt("Enter a temperature : ");
		int wSpeed = u.getInt("Enter wind speed : ");
		System.out.println("Weather is  : "+u.weather(temp, wSpeed));
	}
	
}
