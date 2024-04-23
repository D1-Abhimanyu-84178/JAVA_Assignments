package com.sunbeam.creditLimitCalculator;

public class CreditsFactory {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Customer alex = new Customer();
		alex.accountNo = 1;
		alex.allowedCredit = 50000;
		alex.totalItemsCharged = 25000;
		alex.totalcreditsApplied = 10000;
		alex.pendingBalance = 5000;
		
		int balance = alex.calculateNewBalance();
		alex.checkLimit(balance);

		Customer max = new Customer();
		max.accountNo = 2;
		max.allowedCredit = 20000;
		max.totalItemsCharged = 20000;
		max.totalcreditsApplied = 5000;
		max.pendingBalance = 10000;
		
	    balance = max.calculateNewBalance();
		max.checkLimit(balance);
	}

}
