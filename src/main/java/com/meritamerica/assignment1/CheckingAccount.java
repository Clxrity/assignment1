package com.meritamerica.assignment1;

public class CheckingAccount {
	
	private double balance;
	
	//Opening/Starting balance 0.0
	public CheckingAccount(double openingBalance) {
		balance = 0.0;
	}
	
	//Deposit in checkings
	public Boolean deposit(double amount) {
		balance += amount;
	}
	
	//Withdraw from checkings
	public withdraw(double amount) {
		balance -= amount;
	}
	
	//Get Checking Balance
	public double getBalance() {
		return balance;
	}
	
	pubic double getInterestRate(double i) {
		return i;
	}
}
