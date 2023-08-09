package com.jsp.interfaces;

public class Phonepe extends BalanceInquiry implements Payment,Transaction{
	
	public void makePayment() {
		System.out.println("Payment via Phonepe.");	 
	 }
	
	public void printTransaction() {
		System.out.println("Transaction via Phonepe.");
	}
	
	public void checkBalance() {
		System.out.println("Check the Balance via Phonepe.");
	}
}
