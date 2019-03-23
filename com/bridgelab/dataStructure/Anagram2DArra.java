package com.bridgelab.dataStructure;

import java.util.ArrayList;

import com.bridgelab.utility.Utility;


public class Anagram2DArra {

	public void anagram2DArr(ArrayList[] arr) {	
		Utility u =new Utility();
		for(int i=0; i<arr.length; i++) {
			arr[i] = new ArrayList();
		}
		ArrayList primeNumber = u.getPrimeNumberInRange(1000);
//		System.out.println(primeNumber);
		boolean flag = true;
		int size = primeNumber.size();
		for(int i=0; i<size; i++) {
			for(int j=0; j<size; j++) {
				if(i==j) continue;
				if(u.isAnagram(String.valueOf(primeNumber.get(i)), String.valueOf(primeNumber.get(j)))) {
					arr[0].add(primeNumber.get(i));
					flag = false;
					break;
				}else {
					flag = true;
 				}
			}
			if(flag) {
				arr[1].add(primeNumber.get(i));		
			}
		}
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Anagram2DArra anagram = new Anagram2DArra();
		ArrayList arr[] = new ArrayList[2];
		anagram.anagram2DArr(arr);
		System.out.println("Anagram number :"+arr[0]);
		System.out.println("Non anagram number :"+arr[1]);
 	}

}
