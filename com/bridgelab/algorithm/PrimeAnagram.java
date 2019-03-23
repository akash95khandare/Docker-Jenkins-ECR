package com.bridgelab.algorithm;

import java.util.ArrayList;

import com.bridgelab.utility.Utility;

public class PrimeAnagram {

	
	public static void main(String args[]) {
		Utility u = new Utility();
		ArrayList arr = u.getPrimeNumberInRange(1000);
		System.out.println("Anagram prime numbers");
		u.isPrimeAnagram(arr);
		System.out.println("\nPalindrome prime numbers ");
		for(int i=0; i<arr.size(); i++) {
			if(Utility.isPalindrome((int)arr.get(i))) {
				System.out.print(arr.get(i)+" ");
			}
		}
	}
}
