package com.account;

public class SavingsAccount {
	
	private static Double annualInterestRate;
	private Double savingsBalance;
	private Double annualBalance;
	
	public SavingsAccount(Double balance) {
		savingsBalance = balance;
	}
	
	public Double getAnnualBalance() {
		return annualBalance;
	}
	
	public Double getSavingsBalance() {
		return savingsBalance;
	}

	public void setSavingsBalance(Double savingsBalance) {
		this.savingsBalance = savingsBalance;
	}

	public void calculateMonthlyInterest() {
		savingsBalance += (savingsBalance * annualInterestRate)/12;
	}
	
	public void calculateAnnualInterest() {
		Double balance = 0.0;
		for (int i = 1; i <= 12; i++) {
			balance += (savingsBalance * annualInterestRate)/12;
		}
		annualBalance = balance;
	}

	public static void setAnnualInterestRate(Double annualInterestRate) {
		SavingsAccount.annualInterestRate = annualInterestRate;
	}
	
}
