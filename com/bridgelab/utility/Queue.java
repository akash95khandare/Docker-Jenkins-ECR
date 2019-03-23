package com.bridgelab.utility;

public class Queue {

//	ListBank queue = new ListBank();
	LinkedList list = new LinkedList();
	
	public void enqueue(Object obj) {
		list.add(obj);
	}
		
	public Object dequeue() {
		return list.pollFirst();
	}
	
	public void display() {
		list.display();
	}
	
	public int size() {
		return list.size();
	}
	
}
