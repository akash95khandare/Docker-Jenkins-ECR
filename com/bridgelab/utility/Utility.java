/**
 * compilation : javac -d bin Utility.java
 * Execution : java -cp bin com.bridgelab.utility
 * Purpose : Provide functional program and Algorithm
 * @author : Akash Khandare
 * @version : 1.8
 * @Since : 07-02-2019
 *
 */
package com.bridgelab.utility;

import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

import com.bridgelab.functional.Gambler;

public class Utility {

	Scanner scan = new Scanner(System.in);
	
	boolean check = true;
	int player = 0;
	int counter = 1;
	char game[][] = new char[][] {{'-','-','-'}, {'-','-','-'}, {'-','-','-'}}; 
	
	/**
	 * Read int value from user and return
	 */
	public int getInt() {
		return scan.nextInt();
	}
	
	/**
	 * Read int value from user and return
	 */
	public int getInt(String str) {
		System.out.println(str);
		return scan.nextInt();
	}
	
	/**
	 * Read int value from user and return
	 */
	public double getDouble() {
		return scan.nextDouble();
	}
	
	/**
	 * Read int value from user and return
	 */
	public double getDouble(String str) {
		System.out.println(str);
		return scan.nextDouble();
	}
	
	/**
	 * Read float value from user and return
	 */
	public float getFloat() {
		return scan.nextFloat();
	}
	
	public float getFloat(String str) {
		System.out.println(str);
		return scan.nextFloat();
	}
	/**
	 * Read string value from user and return
	 */
	public String getNext() {
		return scan.next();
	}
	
	/**
	 * Read string value from user and return
	 */
	public String getNext(String str) {
		System.out.println(str);
		return scan.next();
	}
	
	/**
	 * Read string line value from user and return
	 */
	public String getNextLine() {
		return scan.nextLine();
	}
	
	/**
	 * Return the string after change 
	 * @param Getting two string
	 */
	public static String getReplaceStr(String str, String s) {
		try {
			return str.replace("<<UserName>>", s);
		} catch(Exception e) {
			e.printStackTrace();
		}
		return "String not change...";
	}
	
	/**
	 * check year is leap year or not and then return boolean value
	 * @param Getting year as int type 
	 */
	public static boolean isLeapYear(int year) {
		if(year%100==0) {
			if(year%400==0) {
				return true;
			}else {
				return false;
			}
		}else if(year%4==0) {
			return true;
		}else {
			return false;
		}
	}
	
	/**
	 * Give the table of power of 2 when number will less than 31
	 * @param Getting number as int type
	 */
	public static void tableOfPowerOf2(int number) {
		if(number<31) {
			for(int i=1; i<=number; i++) System.out.println(i+" is power of 2 : "+(int)Math.pow(2, i));
		}else {
			System.out.println("You have enter greater number than 31..");
		}
	}
	
	/**
	 * Return the harmonic value as float
	 * @param Getting number n as int type
	 */
	public float getHarmonoicValue(int n) {
		float value=0;
		for(int i=1; i<=n; i++) {
			value = value + (1/i);
		}
		return value;
	}
	
	/**
	 * Print Prime factor of n
	 * @param Getting number n as int type
	 */
	public void printPrimeFactor(int n) {
		System.out.println("Prime Factor are :");
		for(int i=2; i<=n; i++) {
			if(n%i==0) {
				if((i!=2 && i!=3 && i!=5) && (i%2==0 || i%3==0 || i%5==0)) {}
				else System.out.print(i+","); 
			}
		}
	}
	/**
	 * Getting value from user and return two D array 
	 */
	public int[][] getTwoDArray(int r, int c) {
		int arr[][];
		arr = new int[r][c];
		System.out.println("Enter array element : ");
		for(int i=0; i<r; i++) {
			for(int j=0; j<c; j++) {
				arr[i][j]=scan.nextInt();
			}
		}
		return arr;
	}
	
	/**
	 * Print two D array on console
	 * @param Get two D integer array, row value and coloumn value 
	 */
	public void printTwoDArray(int[][] arr, int r, int c) {
		PrintWriter writer = new PrintWriter(System.out);
		for(int i=0; i<r; i++) {
			for(int j=0; j<c; j++) {
				try {
					writer.print(arr[i][j]);
					writer.flush();
				} catch(Exception e) {}
					System.out.print(" ");
			}
			System.out.println();
		}
        writer.close();
	}
	
	/**
	 * Getting current time and return it
	 */
	public long startWatch() {
		return System.nanoTime();
	}
	
	/**
	 * Return elapse time 
	 */
	public long elapseTime(long start) {
		long stop = System.nanoTime();
		return ((stop-start));
	}
	
	/**
	 * init to play tic-tac-toe game 
	 */
	public void ticTacToe() {
		if(check) {
			if(counter <= 9) {
				if(player == 0) {
					showGame(); 
					player = getPlayer();
					ticTacToe();
				} else if(player == 1) {
					player();
					checkWin('X');
					player = 2; 
					counter++; 
					ticTacToe();
				} else if(player == 2) {
					computer();
					checkWin('O');
					player = 1; 
					counter++; 
					ticTacToe();
				}
			} else { 
				showGame();
				System.out.println("Draw Match.");
			} 
		}
	}
	
	/**
	 * This method for computer player
	 * Generate position and then marked O 
	 */
	private void computer() {
		Random random = new Random();
		int x = random.nextInt(3);
		int y = random.nextInt(3);
		if(game[x][y]=='-') { game[x][y] = 'O'; return; }
		computer();
	}
	
	/**
	 * Get player value for which player will play first  
	 */
	private int getPlayer() {
		System.out.println("do you want 1 player or 2 player..");
		return scan.nextInt();
	}
	
	/**
	 * This method for user player to play tic-tac-toe
	 * First will get position from player to marked X 
	 */
	private void player() {
		showGame();
		System.out.println("Which position do you want to mark X");
		int x = scan.nextInt();
		int y = scan.nextInt();
		if(game[x][y]=='-') {
			game[x][y] = 'X'; 
			return; 
		} else {
			System.out.println("This position have already marked.");
			player();
		}
	}
	
	/**
	 * Show the tic-tac-toe game 
	 */
	private void showGame() {
		for(int i=0; i<3; i++) {
			for(int j=0; j<3; j++) {
				System.out.print(game[i][j]+" ");
			}
			System.out.println();
		}
	}
	
	/**
	 * Check to who won the tic-tac-toe game 
	 */
	private void checkWin(char c) {
		if((game[0][0]==c && game[0][1]==c && game[0][2]==c) 
			|| (game[1][0]==c && game[1][1]==c && game[1][2]==c)
			|| (game[2][0]==c && game[2][1]==c && game[2][2]==c)
			|| (game[0][0]==c && game[1][0]==c && game[2][0]==c)
			|| (game[0][1]==c && game[1][1]==c && game[2][1]==c)
			|| (game[0][2]==c && game[1][2]==c && game[2][2]==c)
			|| (game[0][0]==c && game[1][1]==c && game[2][2]==c)
			|| (game[0][2]==c && game[1][1]==c && game[2][0]==c)) {
			if(c=='X') {
				System.out.println("player won.");
			} else {
				System.out.println("Computer player won.");
			}
			showGame();
			check = false;
		}
	}
	
	/**
	 * Give the roots of x for a*x*x + b*x + c.
	 */
	public void getRootOfX() {
		int a, b, c;
		double x1, x2;
		System.out.println("Equation is a*x*x + b*x + c.");
		System.out.println("Enter a, b and c");
		a = scan.nextInt();
		b = scan.nextInt();
		c = scan.nextInt();
		double delta = (b*b - 4*a*c);
		x1 = ((-b + Math.sqrt(delta))/(2*a));
		x2 = ((-b - Math.sqrt(delta))/(2*a));
		System.out.println("Root 1 of x = "+(int)x1);
		System.out.println("Root 2 of x = "+(int)x2);
	}
	
	/**
	 * @param it will get temperature and wind speed value as double
	 * Return weather value
	 */
	public double weather(int t,int v) {
		double w;
		if(t<50 && v>3 && v<120) {
				w = (35.74 + 0.6215*t + (0.4275*t -35.75)*Math.pow(v, 0.16));
				return w;
		}else return -1;		
	}
	
	
	
	public double euclideanDistance(int x, int y) {
		return (Math.sqrt(Math.pow(x,x)+Math.pow(y, y)));
	}
	
	public static float flipCoin(int n) {
		Random rand = new Random();
		float flip = rand.nextFloat();;
		if(n>0) flipCoin(n-1);	
		return flip;
	}
	
	public static int[] couponGenerator(int number) {
		int[] coupon = new int[number];
		int i=1,j=0;
		boolean check = true;
		Random r = new Random();
		int randCoupon = r.nextInt(100);
		coupon[0] = randCoupon;
		while(i<number) {
			while(j<i) {
				if(coupon[j]==randCoupon) {
					randCoupon = r.nextInt(100);
					j=0;
				}
				j++;
			}
				coupon[i] = randCoupon;
				i++;
		}
		return coupon;
	}
	
	public static void gambler(int goal) {
		int doller = 1;
		int win=0;
		int tMatch=0;
		Utility u = new Utility();
		Random rand = new Random();
		while(doller!=0) {
			System.out.println("Guess number :");
			int n = u.getInt();
			tMatch++;
			if(rand.nextInt(3)==n) {
				doller++;
				win++;
			} else doller--;
			if(doller==goal) { System.out.println("You reached goal"); break; }
		}
		if(doller==0) System.out.println("You loss your doller");
		System.out.println(tMatch);
		int temp = (win*100)/tMatch;
		System.out.println("Persentage of win : "+temp);
		System.out.println("Persentage of loss : "+(100-temp));
	}
	
	public static void sumOfThree(int[] arr) {
		int counter=0;
		for(int i=0; i<arr.length; i++) {
			for(int j=1+i; j<arr.length; j++) {
				for(int k=j+1; k<arr.length; k++) {
					if(arr[i]+arr[j]+arr[k]==0) {
						System.out.println(arr[i]+" + "+arr[j]+" + "+arr[k]+" = 0");
						counter++;
					}
				}
			}
		}
		System.out.println("Total no of triplets are "+counter);
	}
	
	private static String swap(String str, int i, int j) {
		char temp;
		char ch[] = str.toCharArray();
		temp = ch[i];
		ch[i] = ch[j];
		ch[j] = temp;
		return String.valueOf(ch);
	}
	public static void permutation(String str, int l, int r) {
		if (l == r) 
            System.out.println(str); 
        else{ 
            for(int i=l; i<=r; i++) { 
                str = swap(str,l,i); 
                permutation(str, l+1, r); 
                str = swap(str,l,i); 
            } 
        } 
	}
	
//	private static int swap(int number, int i, int j) {
//		int temp;
//		char ch[] = str.toCharArray();
//		temp = ch[i];
//		ch[i] = ch[j];
//		ch[j] = temp;
//		return String.valueOf(ch);
//	}
//	
//	public static void permutation(int number, int l, int r) {
//		if (l == r) 
//            System.out.println(number); 
//        else{ 
//            for(int i=l; i<=r; i++) { 
//                number = swap(number,l,i); 
//                permutation(number, l+1, r); 
//                number = swap(number,l,i); 
//            } 
//        } 
//	}
	
	/*******************************************************************
	 * Algorithm 
	 *******************************************************************/
	
	/**
	 * @param it will get two string 
	 * check it is anagram or not then return boolean value
	 */
	public boolean isAnagram(String first, String second) {	
		boolean bool[];
		int counter = 0;
		if(first.length() == second.length()) {
			bool = new boolean[second.length()];
			for(int j=0; j<second.length(); j++) bool[j] = false;
			for(int i=0; i<first.length(); i++) {
				for(int j=0; j<second.length(); j++) {
					if(first.charAt(i)==second.charAt(j) && bool[j]==false) {
						bool[j]=true;
//						System.out.println(first.charAt(i)+" "+second.charAt(j)+" "+counter);
						counter++;
						break;
					}
				}
			}
			if(counter==second.length()) {
				return true;
			} else {
				return false;
			}
		}else {
			return false;
		}
	}
	
	/**
	 * @param it will get number b as int type
	 * check it is prime or not and then return boolean value
	 */
	public boolean isPrime(int n) {
		for(int i=2; i<n; i++) {
			if(n%i==0) return false;
		}
		return true;
	}
	
	/**
	 * @param It will get number range as int type
	 * return the array of prime number between 2 to range
	 */
	public ArrayList getPrimeNumberInRange(int range) {
		ArrayList arr = new ArrayList<Integer>();
		int j=0;
		for(int i=2; i<=range; i++) {
			if(isPrime(i)) {arr.add(i); j++;}
		}
		return arr;
	}
	
	/**
	 * @param It will get number n as int type
	 * Check it is palindrome or not and then return boolean value
	 */
	
	public static boolean isPalindrome(int n) {
		int revNo=0;
		int temp1, temp2=n; 
		while(true) {
			temp1 = temp2%10;
			temp2 = temp2/10;
			revNo = (revNo*10)+temp1;
			if(temp2==0) {
				break;
			}
		}
		if(n==revNo) return true;
		else return false;
	}	
	
	public void isPrimeAnagram(ArrayList arr) {
		Utility u = new Utility();
		for(int i=0; i<arr.size(); i++) {
			for(int j=i+1; j<arr.size(); j++) {
				if(u.isAnagram(String.valueOf((int)arr.get(i)), String.valueOf((int)arr.get(j)))) System.out.print("["+arr.get(i)+" and "+arr.get(j)+"] ");
			}
		}
	}
	
	/**
	 * @param It will get String array, start index and end index
	 * Give array in sorted order by merge sort algorithm
	 */
	public static void mergeSort(String[] str, int start, int end) {
		if(start<end) {
			int mid = (start + end)/2;
			mergeSort(str, start, mid);
			mergeSort(str, mid+1, end);
			merge(str, start, mid, end);
		}
	}
	
	/**
	 * @param It will get String array, start index,middle index and end index
	 * Give array in sorted order by merge sort algorithm
	 * This method call in mergeSort
	 */
	private static void merge(String[] str, int start, int mid, int end) {
		int n1 = mid-start+1;
		int n2 = end-mid;
		int s = start;
		String[] tm1 = new String[n1];
		String[] tm2 = new String[n2];
		
		for(int i=0; i<n1; i++) {
			tm1[i] = str[s];
			s++;
		}
		for(int i=0; i<n2; i++) {
			mid++;
			tm2[i] = str[mid];
		}
		int i=0, j=0;
		while(i<n1 && j<n2) {
			if(tm1[i].hashCode()<tm2[j].hashCode()) {
				str[start] = tm1[i];
				start++;
				i++;
			}else {
				str[start] = tm2[j];
				start++;
				j++;
			}
		}
		while(i<n1) {
			str[start]=tm1[i];
			start++;
			i++;
		}
		while(j<n2) {
			str[start]=tm2[j];
			start++;
			j++;
		}
	}
	
	/**
	 * @param It will get int array, start index, end index and key
	 * Give index of key value of which will find in array
	 */
	public static int binarySearchInt(int[] arr,int start, int end, int key) {
		int mid;
		while(start<=end) {
			mid = (start+end)/2;
			if(arr[mid]==key) return mid;
			else if(arr[mid]>key) end = mid-1;
			else if(arr[mid]<key) start = mid + 1;
		}
		return -1;
	}
	
	
	/**
	 * @param It will get String array, start index, end index and key
	 * Give index of key value of which will find in array
	 */
	public static int binarySearchStr(String[] arr,int start, int end, String key) {
		int mid;
		while(start<=end) {
			mid = (start+end)/2;
			if(arr[mid]==key) {
				System.out.println("Value is found");
				return mid;
			}
			if(arr[mid].hashCode()<key.hashCode()) start = mid + 1;
			else end = mid-1;
		}
		return -1;
	}
	
	/**
	 * @param It will get integer array, start index and end index
	 * Give array in sorted order by insertion sort algorithm
	 */
	public static int[] insertionSortInt(int [] arr, int start, int end) {
		for(int i=1; i<=end; i++)
			for(int j=i-1; j>=0; j--) {
				if(arr[j]>arr[j+1]) {
					int temp = arr[j];
					arr[j] = arr[j+1];
					arr[j+1] = temp;
				}
			}
		return arr;
	}
	
	/**
	 * @param It will get String array, start index and end index
	 * Give array in sorted order by insertion sort algorithm
	 */
	public static String[] insertionSortStr(String [] arr, int start, int end) {
		for(int i=1; i<=end; i++)
			for(int j=i-1; j>=0; j--) {
				if(arr[j].hashCode()>arr[j+1].hashCode()) {
					String temp = arr[j];
					arr[j] = arr[j+1];
					arr[j+1] = temp;
				}
			}
		return arr;
	}
	
	/**
	 * @param It will get integer array, start index and end index
	 * Give array in sorted order by bubble sort algorithm
	 */
	public static int[] bubbleSortInt(int[] arr, int start, int end) {
		for(int i=0; i<=end; i++)
			for(int j=0; j<end-i; j++) {
				if(arr[j]>arr[j+1]) {
					int temp = arr[j];
					arr[j] = arr[j+1];
					arr[j+1] = temp;
				}
			}
		return arr;
	}
	
	/**
	 * @param It will get String array, start index and end index
	 * Give array in sorted order by merge sort algorithm
	 */
	public static String[] bubbleSortStr(String[] arr, int start, int end) {
		for(int i=0; i<=end; i++)
			for(int j=0; j<end-i; j++) {
				if(arr[j].hashCode()>arr[j+1].hashCode()) {
					String temp = arr[j];
					arr[j] = arr[j+1];
					arr[j+1] = temp;
				}
			}
		return arr;
	}
	
	/**
	 * @param Get integer array
	 * Print array on console
	 */
	public static void displayIntArr(int[] arr) {
		for(int i=0; i<arr.length; i++) System.out.print(arr[i]+" ");
	}
	
	/**
	 * @param Get string array
	 * Print array on console
	 */
	public static void displayStringArr(String[] arr) {
		for(int i=0; i<arr.length; i++) System.out.print(arr[i]+" ");
	}
	
	public static void vendingMachine(int change) {
		int arr[] = new int[] {1,2,5,10,50,100,500,1000};
		int la = arr.length-1;
		while(change!=0) {
			if(arr[la]<=change) {
				System.out.print(arr[la]+" ");
				change = change-arr[la];
				vendingMachine(change);
				break;
			}
			la--;
		}
	}
	
	public double CelsiusToFahrenheit(int Celsius) {
		double Fahrenheit = (Celsius * 9/5) + 32;
		return Fahrenheit;
	}
	
	public double FahrenheitToCelsius(int Fahrenheit) {
		double Celsius = (Fahrenheit - 32) * 5/9;
		return Celsius;
	}
	
	public static int arrToInt(int[] arr) {
		int i = 0;
		int binaryNo=0;
		while(i<arr.length) {
			binaryNo = (binaryNo*10)+arr[i];
			i++;
		}
		return binaryNo;
	}
	
	public static int[] toBinary(int n) {
		int arr[] = new int[8];
		int i=arr.length-1;
		while(i>=0) {
				int temp1 = n%2;
				n = n/2;
				arr[i] = temp1;
				i--;
		}
		return arr;
	}
	
	public static int toDecimal(int[] binary) {
		int decimal=0;
		int j=7;
		for(int i=0; i<binary.length; i++) {
			if(binary[i]==1) {
				decimal=decimal+(int)Math.pow(2,j);
			}
			j--;
		}
		return decimal;
	}
	
	public static int nibbleSwap(int[] arr) {
		int i=0,j=4;
		while(i<4) {
			int temp = arr[i];
			arr[i]=arr[j];
			arr[j]=temp;
			i++;
			j++;
		}
		return toDecimal(arr);
	}
	
}
