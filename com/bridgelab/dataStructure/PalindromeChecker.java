package com.bridgelab.dataStructure;

import com.bridgelab.utility.Queue;
import com.bridgelab.utility.Utility;

public class PalindromeChecker {

	public boolean isPalindrome(String str) {
		String s[]=str.split("");
		Queue queue = new Queue();
		for(int i=0; i<s.length; i++) {
			queue.enqueue(s[i]);
		}
		int j = s.length-1;
		int count=0;
		while(queue.size()>0) {
			if(queue.dequeue().equals(s[j])) {
				count++;
				j--;
			}
//			System.out.println(queue.dequeueOne());
		}
		if(count==s.length) return true;
		else return false;
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		PalindromeChecker p =new PalindromeChecker();
		Utility u = new Utility();
		String str = u.getNext("Enter string for checking string is palindrome or not : ");
		if(p.isPalindrome(str)) System.out.println(str+", this string is palindrome");
		else System.out.println(str+", this string is not palindrome");
	}

}
