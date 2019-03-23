package com.bridgelab.dataStructure;

import com.bridgeLab.dataStructure.calendar.Calendar;
import com.bridgelab.utility.Queue;

public class CalendarWithQueue {

	public Queue weekDayWithQueue(String[][] arr) {
		Queue queue = new Queue();
		for(int i=0; i<7; i++) {
			for(int j=0; j<7; j++) {
				queue.enqueue(arr[i][j]);
			}
		}
		return queue;
	}
	
	public void display(Queue queue) {
		int size = queue.size();
		for(int i=0; i<=size; i++) {
			if(i%7==0) System.out.println();
			String str = (String)queue.dequeue();
			if(str==null) break;
			System.out.print(str+"   ");
		}
	}
	
	public static void main(String args[]) {
		CalendarWithQueue calendar = new CalendarWithQueue();
		Calendar cal = new Calendar();
		String arr[][] = cal.calendar(2019, 1);
//		cal.display(arr);
		Queue queue = calendar.weekDayWithQueue(arr);
		calendar.display(queue);
	}
}
