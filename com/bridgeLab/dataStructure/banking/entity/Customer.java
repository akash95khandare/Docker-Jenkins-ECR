package com.bridgeLab.dataStructure.banking.entity;

public class Customer {
	
	String name;
	String accountNumber;
	double amount;
	double balance;
	String operation;
	public String getOperation() {
		return operation;
	}
	public void setOperation(String operation) {
		this.operation = operation;
	}
	int token;
	
	public int getToken() {
		return token;
	}
	public void setToken() {
		
		this.token = (int) (Math.random()*10000);
	}
	public double getBalance() {
		return balance;
	}
	public void setBalance(double balance) {
		this.balance = balance;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getAmount() {
		return amount;
	}
	public void setAmount(double amount) {
		this.amount = amount;
	}
	public String getAccountNumber() {
		return accountNumber;
	}
	public void setAccountNumber(String accountNumber) {
		this.accountNumber = accountNumber;
	}
	

}
