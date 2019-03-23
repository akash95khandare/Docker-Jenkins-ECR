package com.bridgelab.functional;

import com.bridgelab.utility.Utility;

public class Harmonic {

	public static void main(String args[]) {
		
		Utility u = new Utility();
		int n = u.getInt("Enter a number which you want to calculate harmonic value.");
		System.out.println("Harmonic value is : "+u.getHarmonoicValue(n));
	}
	
}
