package com.bridgelab.dataStructure;

import com.bridgeLab.dataStructure.calendar.Calendar;
import com.bridgelab.utility.Queue;
import com.bridgelab.utility.Stack;

public class CalendarWithStack {

	Stack stack1 = new Stack();

	public void calendarWithStack(Queue queue) {
		stack1.push(queue);
	}
	
	public Stack transferFromOneStackToOther() {
		int size = stack1.size();
		Stack stack2 = new Stack();
		for(int i=0; i<size; i++) {
			stack2.push(stack1.peak());
		}
		return stack2;
	}
	
	public static void main(String args[]) {
		Calendar calendar = new Calendar();
		String[][] s1=calendar.calendar(2019, 1);
		String[][] s2=calendar.calendar(2019, 2);
		String[][] s3=calendar.calendar(2019, 3);
		CalendarWithQueue calendarWithQueue = new CalendarWithQueue();
		Queue q1 = calendarWithQueue.weekDayWithQueue(s1);
		Queue q2 = calendarWithQueue.weekDayWithQueue(s2);
		Queue q3 = calendarWithQueue.weekDayWithQueue(s3);
		CalendarWithStack calendarWithStack = new CalendarWithStack();
		calendarWithStack.calendarWithStack(q1);
		calendarWithStack.calendarWithStack(q2);
		calendarWithStack.calendarWithStack(q3);
		Stack stack = calendarWithStack.transferFromOneStackToOther();
		Queue qu1 = (Queue)stack.peak();
		Queue qu2 = (Queue)stack.peak();
		Queue qu3 = (Queue)stack.peak();
		calendarWithQueue.display(qu1);
		calendarWithQueue.display(qu2);
//		calendarWithQueue.display(qu3);

	}
}
