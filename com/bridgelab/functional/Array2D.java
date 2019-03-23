package com.bridgelab.functional;

import java.io.PrintWriter;
import java.util.Scanner;

import com.bridgelab.utility.Utility;

public class Array2D {

	public static void main(String args[]) {
		Utility u = new Utility();
		int[][] arr;
		int x, y;
		System.out.println("Enter row and coloumn : ");
		x = u.getInt();
		y = u.getInt();
		arr = u.getTwoDArray(x,y);
		u.printTwoDArray(arr, x, y);
	}
}
