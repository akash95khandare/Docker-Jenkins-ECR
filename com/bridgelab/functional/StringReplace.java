package com.bridgelab.functional;

import com.bridgelab.utility.Utility;

public class StringReplace {
	
	public static void main(String args[]) {
		
		Utility u = new Utility();
		String sentence = u.getNext("Write sentence : ");
		String word = u.getNext("Enter string which you want change : ");
		System.out.println(u.getReplaceStr(sentence, word));
	}
}
