package com.bridgelab.dataStructure;

import java.io.FileWriter;
import java.io.IOException;

import com.bridgelab.utility.IoFile;
import com.bridgelab.utility.LinkedList;
import com.bridgelab.utility.Utility;


public class HashingSearch {

	public void hashingSearch(LinkedList list[], String[] num) {
		for(int i=0; i<num.length; i++) {
			int number = Integer.parseInt(num[i]);
			int dec = number%11;
			list[dec].sort(number);
		}
	}
	
	public void search(int number,LinkedList list[]) {
		int dec = number%11;
		if(list[dec].search(number)) {
			list[dec].remove(number);
			System.out.println("Remove..");
		}else {
			list[dec].sort(number);
			System.out.println("Added..");
		}
	}
	
	public static void main(String[] args) throws IOException {
		HashingSearch h = new HashingSearch();
		LinkedList list[] = new LinkedList[11];
		Utility u = new Utility();
		IoFile io = new IoFile();
		String num[] = 	io.readFromFile("number.txt").split(" ");
		for(int i=0; i<11; i++) {
			list[i] = new LinkedList();
		}
		h.hashingSearch(list, num);
		for(int i=0; i<11; i++) {
			if(list[i].size()==0) {
				continue;
			}
			list[i].display();
			System.out.println();
		}
		int n =u.getInt("Enter a number for finding : ");
		h.search(n, list);
		FileWriter fw = new FileWriter("number.txt");
		fw.write("");
		fw.close();
		for(int i=0; i<11; i++) {
			if(list[i].size()==0) {
				continue;
			}
			list[i].display();
			System.out.println();
		}
		for(int i=0; i<11; i++) {
			if(list[i].size()==0) {
				continue;
			}
			io.appendToFile(list[i], "number.txt");
		}
	
	}

}
