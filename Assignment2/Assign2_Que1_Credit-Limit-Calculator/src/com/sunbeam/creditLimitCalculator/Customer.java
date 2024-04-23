package com.sunbeam.creditLimitCalculator;

public class Customer {

	protected int accountNo;
	protected int pendingBalance;
	protected int totalItemsCharged;
	protected int totalcreditsApplied;
	protected int allowedCredit;
	protected int newBalance;
	int allowedLimit = 22000;
    public int calculateNewBalance() {
    	
    	newBalance = (pendingBalance + totalItemsCharged) - totalcreditsApplied;
    	
		return newBalance;
    	
    }
	
	public void checkLimit(int balance) {
		if(balance > allowedLimit) {
//			System.out.println(pendingBalance);
//			System.out.println(totalItemsCharged);
//			System.out.println(allowedCredit);
			
			
			System.out.println("Credit Limit Exceeded");
		}
		else {
//			System.out.println(pendingBalance);
//			System.out.println(totalItemsCharged);
//			System.out.println(allowedCredit);
			System.out.println("Your New Balance for Next month is : "+ balance);
		}
	}

}
