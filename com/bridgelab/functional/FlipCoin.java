package com.bridgelab.functional;

import java.util.Random;

import com.bridgelab.utility.Utility;

public class FlipCoin {

	public static void main(String args[]) {
		Utility u = new Utility();
		int n = u.getInt("Enter number of times to Flip Coin.");
		float value;
		if((value=Utility.flipCoin(n))<0.5) {
			System.out.println((int)(100-value*100)+"Percentage of head will get chance on top of the coin. ");
		}else System.out.println((int)(value*100)+"percentage of tail will get chance on top of the coin. ");
	}
}
