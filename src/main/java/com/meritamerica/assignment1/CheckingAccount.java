package com.meritamerica.assignment1;

public class CheckingAccount {
	
	private double balance;
	
	//Opening/Starting balance 0.0
	public CheckingAccount() {
		balance = 0.0;
	}
	
	//Deposit in checkings
	public void depositChecking(double amount) {
		balance = balance + amount;
	}
	
	//Withdraw from checkings
	public void withdrawChecking(double amount) {
		balance = balance - amount;
	}
	
	//Get Checking Balance
	public double getBalance() {
		return balance;
	}
}