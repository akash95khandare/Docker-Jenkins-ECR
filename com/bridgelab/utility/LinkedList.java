package com.bridgelab.utility;

import com.bridgeLab.dataStructure.banking.data.Restore;
import com.bridgeLab.dataStructure.banking.entity.Customer;

public class LinkedList {

	Node head;
	public void add(Object obj) {
		Node newNode = new Node();
		newNode.obj = obj;
		newNode.next = null;
		
		if(head==null) head = newNode;
		else {
			Node tempNode = head;
			while(tempNode.next!=null) {
				tempNode = tempNode.next;
			}
			tempNode.next = newNode;
		}
	}
	
	public void remove(Object obj) {
		Node tempNode = head;
		Node previousNode = tempNode;
		 do{
			 if(obj.equals(head.obj)) {
				 head = tempNode.next;
			 }
			 else if(!tempNode.obj.equals(obj)) {
				previousNode = tempNode;
				tempNode = tempNode.next;
			}else {
				previousNode.next = tempNode.next;
				break;
			}
		}while(tempNode!=null);
	}	

	public boolean search(Object obj) {
		Node tempNode = head;
		while(tempNode!=null){
				if(tempNode.obj.equals(obj)) return true;
				tempNode = tempNode.next;
			}
		 return false;
	}

	public Object pollFirst() {
		Object obj = head.obj;
		head = head.next;
		return obj;
	}
	
	public boolean isEmpty() {
		if(head==null) return true;
		else return false;
	}

	public int size() {
		Node tempNode = head;
		int count = 0;
		
		if(tempNode!=null) {
			while(tempNode!=null){
				count++;
				tempNode = tempNode.next;
			}
		}else return 0;
		return count;
	}

	public void display() {
		Node tempNode = head;
		while(tempNode!=null){
			System.out.print(tempNode.obj.toString()+" ");
			tempNode = tempNode.next;
		}
	}
	
	private void addAfter(Node previousNode,Node newNode) {
		newNode.next=previousNode.next;
		previousNode.next=newNode;
	}
	
	public void sort(Object obj) {
		Node newNode = new Node();
		newNode.obj = obj;
		newNode.next = null;
		if(head==null) {
			head = newNode;
		}else {
			Node tempNode = head;
			Node previousNode=head;
			if(Math.abs(head.obj.hashCode())>Math.abs(obj.hashCode())) {
				newNode.next = tempNode;
				head = newNode;
			}else {
				while(true) {
					if(Math.abs(tempNode.obj.hashCode())>Math.abs(obj.hashCode())) {
						addAfter(previousNode, newNode);
						break;
					}
					else if(tempNode.next==null && Math.abs(tempNode.obj.hashCode())<Math.abs(obj.hashCode())) {
						tempNode.next=newNode;
						break;
					}
					if(tempNode.next==null) {
						break;
					}
					previousNode = tempNode;
					tempNode = tempNode.next;
				}
			}
		}
	}

	public Object getLast() {
		Node tempNode = head;
		while(tempNode.next!=null) {
			tempNode = tempNode.next;
		}
		return tempNode.obj;
	}
	
	public void removeLast() {
		Node tempNode = head;
		Node previousNode = tempNode;
		if(tempNode.next==null) {
			head=null;
			return;
		}
		while(tempNode.next!=null) {
			previousNode = tempNode;
			tempNode = tempNode.next;
		}
		previousNode.next=null;
	}
	

	public void modifyAmount(String name,double amount) {
		Node tempNode = head;
		Customer cust =(Customer) tempNode.obj;
		while(!cust.getName().equals(name)) {
			tempNode = tempNode.next;
			cust =(Customer) tempNode.obj;
			if(tempNode==null) {
				System.out.println("User not available.");
			}
		}
		Customer ob =(Customer) tempNode.obj;
		ob.setAmount(amount);;
	}

	public void getUsersData() {
		Restore res = new Restore();
		String data[] = res.readFromFile().split(" ");
		for(int i=0; i<data.length-1; i+=2) {
			Customer cust = new Customer();
			cust.setName(data[i]);
			cust.setAmount(Double.parseDouble(data[i+1]));
			add(cust);
		}
	}
	
	public Object getAmount(Customer cust) {
		Node tempNode = head;
		while(tempNode!=null){
			Customer ob =(Customer) tempNode.obj;
				if(ob.getName().equals(cust.getName())) return tempNode.obj;
				tempNode = tempNode.next;
			}
		 return null;
	}
	
	public boolean search(Customer cust) {
		Node tempNode = head;
		while(tempNode!=null){
			Customer ob =(Customer) tempNode.obj;
				if(ob.getName().equals(cust.getName())) return true;
				tempNode = tempNode.next;
			}
		 return false;
	}
}
