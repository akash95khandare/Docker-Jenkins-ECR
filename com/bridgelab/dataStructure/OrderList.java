package com.bridgelab.dataStructure;


import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;

import com.bridgelab.utility.IoFile;
import com.bridgelab.utility.LinkedList;
import com.bridgelab.utility.Utility;

public class OrderList {
	
	public void unorderList() {
		IoFile io = new IoFile();
		String str[]=io.readFromFile("abc.txt").split(" ");
		Utility u = new Utility();
		LinkedList list = new LinkedList();
		for(int i=0; i<str.length; i++) {
			list.sort(str[i]);
		}
		list.display();
		String st = u.getNext("\nEnter word");
		if(list.search(st)) {
			list.remove(st);
		}else list.sort(st);
		list.display();
		io.writeToFile(list,"abc.txt");
	}
		
	public static void main(String[] args) {
			// TODO Auto-generated method stub
		OrderList un = new OrderList();
		un.unorderList();
		}
	}

	


