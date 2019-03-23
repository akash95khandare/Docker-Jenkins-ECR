package com.bridgeLab.dataStructure.banking.service;

import com.bridgeLab.dataStructure.banking.Banking;
import com.bridgeLab.dataStructure.banking.entity.Customer;
import com.bridgelab.utility.Queue;
import com.bridgelab.utility.Utility;

public class CustomerService {
	
	public void userEnterInQueue(Queue queue,Utility u) {
		System.out.println("Welcome to Dhani Bank");
		int n = u.getInt("How many people will stay in queue");
		for (int i = 0; i < n; i++) {
			Customer cust = new Customer();
			cust.setName(u.getNext("Enter Name : "));
			String dw= u.getNext("Select input from following input \n Enter 1 for deposit \n Enter 2 as withdrawal");
			if(dw.equals("1")) {
				cust.setOperation("deposit");
			}
			else if(dw.equals("2"))
			 {
				cust.setOperation("withdraw"); 
			}
			else
				System.out.println("Please enter valid number");
			cust.setAmount(u.getDouble("Enter Amount : "));
			cust.setToken();
			queue.enqueue(cust);
			System.out.println("Please find your token:" + cust.getToken());
		}
	}
	


	public void casher(Queue queue,Utility u,Banking bank) {
		Customer cust = (Customer)queue.dequeue();
		if (bank.isBankUser(cust)) {
			System.out.println(cust.getName() + ", your account not available. First you should be created account");
			String name = u.getNext("Enter your name for creating account: ");
			Customer cust1 = new Customer();
			cust1.setAmount(0.0);
			cust1.setName(name);
			bank.createAccount(cust1);
			System.out.println("Account created..");
			queue.enqueue(cust);
			return;
		}
		if (cust.getOperation().equals("withdraw")) {
			bank.withdraw(cust);
		} else if (cust.getOperation().equals("deposit")) {
			bank.deposit(cust);
		}
	}
}
