package com.bridgelab.algorithm;

import com.bridgelab.utility.Utility;

public class VendingMachine {

	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Utility u = new Utility();
		int change = u.getInt("Enter cash : ");
		Utility.vendingMachine(change);
	}

}
