package com.accounttest;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import com.account.SavingsAccount;

class SavingsAccountTest {
	SavingsAccount saver1, saver2;
	

	@BeforeEach
	void setUp() throws Exception {
		saver1 = new SavingsAccount(2000.00);
		saver2 = new SavingsAccount(3000.00);
	}

	@Test
	void test() {
		SavingsAccount.setAnnualInterestRate(0.04);
		
		System.out.println(saver1.getSavingsBalance());
		saver1.calculateMonthlyInterest();
		saver1.calculateAnnualInterest();
		System.out.println(saver1.getAnnualBalance());
		
		
		
	}

}
