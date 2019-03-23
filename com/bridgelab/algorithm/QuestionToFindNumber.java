package com.bridgelab.algorithm;

import com.bridgelab.utility.Utility;

public class QuestionToFindNumber {
	
	public static void questionToFindNumber() {
		Utility u = new Utility();
		int n = u.getInt("Enter N number : ");
		System.out.println("Enter 1 for true and 0 for false..");
		System.out.println("you think of a number between 1 and "+n);
		int start=1;
		int end=n;
		
			int mid;
			while(start<=end) {
				mid = (start+end)/2;
				if(u.getInt("This number you have guess."+mid)==1) {
					System.out.println("Your number found");
					break;
				}
				else if(u.getInt("Number is less than "+mid+" or not.")==1) end = mid-1;
				else start = mid + 1;
			}
		}
			

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		QuestionToFindNumber.questionToFindNumber();
	}

}
