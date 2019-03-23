package com.bridgelab.functional;

import java.util.Scanner;

import com.bridgelab.utility.Utility;

public class Distance {

	public static void main(String args[]) {
		Utility u =new Utility();
		int x = u.getInt("Enter value of x axis.");
		int y = u.getInt("Enter value of y axis.");
		System.out.println("Euclidean distance from (x,Y) to origin (0,0) is :\n"+u.euclideanDistance(x,y));
	}
}
