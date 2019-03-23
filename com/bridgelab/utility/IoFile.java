package com.bridgelab.utility;


import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class IoFile {

	public String readFromFile(String fileName) {
		BufferedReader br;
		String str;
		try{
			br = new BufferedReader(new FileReader(fileName));
			str=br.readLine();
			String temp;
			while((temp=br.readLine())!=null) {
				str = str+" "+temp;
			}
			br.close();
			return str;
		}catch(Exception e) {
			e.printStackTrace();
		}
		return "None";
	}
	
	public void writeToFile(LinkedList list,String fileName) {
		BufferedWriter bw;
		try{
			bw = new BufferedWriter(new FileWriter(fileName));
			PrintWriter pw = new PrintWriter(bw);
			int i=0;
			int n = list.size();
			while(i<n) {
				bw.write(list.pollFirst()+" ");
				i++;
			}
			pw.flush();
			pw.close();
			bw.close();
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
	public void appendToFile(LinkedList list,String fileName) {
		
		try{
			BufferedWriter bw = new BufferedWriter(new FileWriter(fileName,true));
			PrintWriter pw = new PrintWriter(bw);
			int i=0;
			int n = list.size();
			while(i<n) {
				pw.append(list.pollFirst()+" ");
				i++;
			}
			pw.flush();
			pw.close();
			bw.close();
			
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
}
