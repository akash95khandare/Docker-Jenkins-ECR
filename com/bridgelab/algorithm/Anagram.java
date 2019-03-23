package com.bridgelab.algorithm;

import java.util.Scanner;

import com.bridgelab.utility.Utility;

public class Anagram {

	public static void main(String args[]) {
		Utility u = new Utility();
		String first = u.getNext("Enter first string : ");
		String second = u.getNext("Enter second string : ");
		if(u.isAnagram(first, second)) System.out.println("String is anagram.");
		else System.out.println("String is not anagram.");
	}
}
