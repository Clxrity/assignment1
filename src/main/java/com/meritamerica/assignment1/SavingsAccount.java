package com.meritamerica.assignment1;

public class SavingsAccount {
	private static double interestRate;
	private double balance;
	
	SavingsAccount savings = new SavingsAccount();
	
	//Opening/Starting balance 0.0
	public SavingsAccount() {
		balance = 0.0;
	}
	
	//Deposit in savings
	public void depositSavings(double amount) {
		balance += amount;
	}
	
	//Withdraw from savings
	public void withdrawSavings(double amount) {
		balance -= amount;
	}
	
	//Get savings Balance
	public double getBalance() {
		return balance;
	}
	
	//Getter and Setter for interest rate 
	public static double getInterestRate() {
		return interestRate;
	}
	public static void setInterestRate(double interestRate) {
		SavingsAccount.interestRate = interestRate;
	}
}
