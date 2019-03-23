package com.bridgelab.functional;

import java.io.BufferedReader;
import java.io.InputStreamReader;

import com.bridgelab.utility.Utility;

public class PowerOf2 {
	
	public static void main(String args[]) {
		
		Utility u = new Utility();
		int number = u.getInt("You should enter number less than 31");
		Utility.tableOfPowerOf2(number);
	}
}
