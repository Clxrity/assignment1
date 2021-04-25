package com.meritamerica.assignment1;

public class CheckingAccount {
	
	private double balance;
	private double futureVal;
	
	//Opening/Starting balance 0.0
	public CheckingAccount(double openingBalance) {
		balance = 0.0;
	}
	
	//Get Checking Balance
		public double getBalance() {
			return balance;
		}
		
	//Deposit in checking
	public boolean deposit(double amount) {
		balance += amount;
		if (amount > 0) {
			System.out.println("Balance after deposit: " + (getBalance() - amount));
			return true;
			
		} else {
			System.out.println("Unable to proccess deposit.");
			return false;
		} 
	}
	
	//Withdraw from checking
	public boolean withdraw (double amount) {
		balance -= amount;
		if(balance < amount) {
            System.out.println("Transaction denied due to insufficient funds.");
            return false;
            
        } else {
        	
            System.out.println("Balance amount after withdraw: " + (getBalance() - amount));
            return true;
        }
	}
	//interest
	public double getInterestRate(double i) {
		return i;
	}
	
	public double futureValue(int years) {
		futureVal = Math.pow(1+0.01, years);
		return futureVal;
	}
	
	public String toString() {
		return "Checking Account Balance: /n" + "Checking Account Interest Rate: /n" + "Checking Account Balance in 3 years: ";
	}
}
