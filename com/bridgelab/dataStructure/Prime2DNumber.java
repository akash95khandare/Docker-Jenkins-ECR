package com.bridgelab.dataStructure;

import java.util.ArrayList;

import com.bridgelab.utility.Utility;

public class Prime2DNumber {

	public void prime2DArray(ArrayList arr[]) {
		int cnt=0;
		int block=100;
		Utility u =new Utility();
		for(int i=0; i<arr.length; i++) {
			arr[i] = new ArrayList();
		}
		for(int i=2; i<1000; i++) {
			if(i==block) {
				cnt++;
				block+=100;
			}
			if(u.isPrime(i)) {
				arr[cnt].add(i);
			}
		}
	}
	
	public void print(ArrayList arr[]) {
		for(int i=0; i<10; i++) {
			System.out.println(arr[i]);
		}
	}
	
	public static void main(String args[]) {
		Prime2DNumber p = new Prime2DNumber();
		ArrayList arr[]=new ArrayList[10];
		p.prime2DArray(arr);
		p.print(arr);
	}
}
