package com.bridgelab.functional;

import com.bridgelab.utility.Utility;

public class Stopwatch {
	
	public static void main(String args[]) throws InterruptedException {
		Utility u = new Utility();
		Long start = u.startWatch();
		Thread.sleep(5000);
		System.out.println("Elapse Time : "+u.elapseTime(start));
	}
}
