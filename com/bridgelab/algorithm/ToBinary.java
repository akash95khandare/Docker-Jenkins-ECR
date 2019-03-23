package com.bridgelab.algorithm;

import com.bridgelab.utility.Utility;

public class ToBinary {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Utility u = new Utility();
		int decimal = u.getInt("Enter decimal number. ");
		System.out.println("Binary number is : ");
		Utility.displayIntArr(Utility.toBinary(decimal));
	}

}
