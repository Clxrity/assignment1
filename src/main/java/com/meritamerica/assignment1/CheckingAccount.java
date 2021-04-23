package com.meritamerica.assignment1;

public class CheckingAccount {
	// Test comment
	private static double interestRate;
	private double balance;
	
	//Opening/Starting balance 0.0
	public CheckingAccount(double openingBalance) {
		balance = 0.0;
	}
	
	//Deposit in checkings
	public void depositChecking(double amount) {
		balance += amount;
	}
	
	//Withdraw from checkings
	public void withdrawChecking(double amount) {
		balance -= amount;
	}
	
	//Get Checking Balance
	public double getBalance() {
		return balance;
	}
	
	//Getter and Setter for interest rate 
	public static double getInterestRate() {
		return interestRate;
	}
	public static void setInterestRate(double interestRate) {
		CheckingAccount.interestRate = interestRate;
	}
}
