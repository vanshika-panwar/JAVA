package com.adobe.prj.ui;

import com.adobe.prj.entity.Account;

public class AccountClient {

	public static void main(String[] args) {
		
		System.out.println(Account.getCount()); // 0
		
		Account rahulAcc = new Account(); // noArgs
		System.out.println(Account.getCount()); // 1
		
		Account swethaAcc = new Account(1000); // parametrized constructor
		System.out.println(Account.getCount()); // 2
		
		rahulAcc.deposit(5000);
		System.out.println("Rahul Acc");
		System.out.println("Balance : " + rahulAcc.getBalance());
		swethaAcc.deposit(45000);
		System.out.println("Swetha Acc");
		System.out.println("Balance : " + swethaAcc.getBalance());
	}

}
