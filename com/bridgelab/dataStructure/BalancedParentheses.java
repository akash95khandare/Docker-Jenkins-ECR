package com.bridgelab.dataStructure;

import com.bridgelab.utility.Stack;

public class BalancedParentheses {

	public static boolean isbalancedParenthes(String str) {
		int len = str.length();
		Stack stack = new Stack();
		for(int i=0; i<len; i++) {
			if(str.charAt(i)=='(') {
				stack.push("(");
			}else if(str.charAt(i)==')') {
				if(stack.peak()=="(" && !stack.isEmpty()) {
					stack.pop();
				}else {
					return false;
				}
			}
		}
		if(!stack.isEmpty()) {
			return false;
		}
		return true;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "(5+6)∗(7+8)/(4+3)(5+6)∗(7+8)/(4+3)";
		System.out.println(BalancedParentheses.isbalancedParenthes(str));
	}

}
