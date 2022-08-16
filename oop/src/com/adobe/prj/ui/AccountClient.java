package com.adobe.prj.ui;

import com.adobe.prj.entity.Account;

public class AccountClient {

	public static void main(String[] args) {
		Account rahulAcc = new Account();
		Account swethaAcc = new Account();
		rahulAcc.deposit(5000);
		System.out.println("Rahul Acc");
		System.out.println("Balance : " + rahulAcc.getBalance());
		swethaAcc.deposit(45000);
		System.out.println("Swetha Acc");
		System.out.println("Balance : " + swethaAcc.getBalance());
	}

}
