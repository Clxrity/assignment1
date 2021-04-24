package com.meritamerica.assignment1;

public class SavingsAccount {
	
	private double futureVal;
	private double balance;
	
	SavingsAccount savings = new SavingsAccount();
	
	//Opening/Starting balance 0.0
	public SavingsAccount() {
		balance = 0.0;
	}
	
	//Get Checking Balance
			public double getBalance() {
				return balance;
	}
			
	//Deposit in savings
	public boolean deposit(double amount) {
		balance += amount;
		if (amount > 0) {
			System.out.println("Balance after deposit: " + (getBalance() + amount));
			return true;
			
		} else {
			System.out.println("Unable proccess deposit.");
			return false;
		} 
	}
	
	//Withdraw from savings
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
	
	public double getInterestRate(double i) {
		return i;
	}
	
	public double futureValue(int years) {
		futureVal = Math.pow(1+1.00, years);
		return futureVal;
	}
	
	public String toString() {
		return 
	}
}
