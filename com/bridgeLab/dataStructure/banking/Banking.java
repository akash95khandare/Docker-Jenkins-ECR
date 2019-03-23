package com.bridgeLab.dataStructure.banking;

import com.bridgeLab.dataStructure.banking.data.Restore;
import com.bridgeLab.dataStructure.banking.entity.Customer;
import com.bridgelab.utility.LinkedList;
import com.bridgelab.utility.Utility;

public class Banking {

//	public static ListBank bankUser = new ListBank();
	static LinkedList bankUser = new LinkedList();
	Utility u = new Utility();
	
	public void createAccount(Customer cust) {
		bankUser.add(cust);
	}
	
	public void withdraw(Customer cust) {
		Customer cust1 =(Customer) bankUser.getAmount(cust);
		if(cust1.getAmount()>=cust.getAmount()) {
			double newAmt = cust1.getAmount()-cust.getAmount();
			bankUser.modifyAmount(cust.getName(), newAmt);
			System.out.println("Available amount is : "+cust1.getName());
			System.out.println("Collect the cash..");
		}
		else {
			System.out.println("Insufficient balance.");
		}
	}
	
	public void deposit(Customer cust) {
		Customer cust1 =(Customer) bankUser.getAmount(cust);
		double newAmt = cust1.getAmount() + cust.getAmount();
		bankUser.modifyAmount(cust.getName(), newAmt);
	}
	
	public boolean isBankUser(Customer cust) {
		if(!bankUser.search(cust)) {
			return true;
		}else {
			return false;
		}
	}
	
	
	public void setUsersData() {
		Restore res = new Restore();
		res.writeToFile(bankUser);
	}

}
