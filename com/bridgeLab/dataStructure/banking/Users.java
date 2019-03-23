package com.bridgeLab.dataStructure.banking;

import com.bridgeLab.dataStructure.banking.entity.Customer;
import com.bridgeLab.dataStructure.banking.service.CustomerService;
import com.bridgelab.utility.Queue;
import com.bridgelab.utility.Utility;


public class Users {

	public static void main(String args[]) throws InterruptedException {
		Queue queue = new Queue();
		Utility u = new Utility();
		Users user = new Users();
		CustomerService custService = new CustomerService();
		
	
		custService.userEnterInQueue(queue,u);
		Banking bank = new Banking();
		bank.bankUser.getUsersData();
		while(queue.size()>0) {
			custService.casher(queue,u,bank);
			Thread.sleep(2000);
		}
		bank.setUsersData();
	}
}
