package com.bridgelab.algorithm;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

import com.bridgelab.utility.Utility;

public class Prime {

	public static void main(String args[]) {
		
		Utility u =new Utility();
		ArrayList arr = u.getPrimeNumberInRange(1000);
		Iterator it = arr.iterator();
		while(it.hasNext()) {
			System.out.print(it.next()+" ");
		}
	}
	
}
