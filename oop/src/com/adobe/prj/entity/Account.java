package com.adobe.prj.entity;

/**
 * entity class to represent a banking account
 * 
 * @author banuprakash
 * @version 1.0.2
 * @since 1.0.0
 *
 */
public class Account {
	private double balance; // state of object; instance variable
	
	/**
	 * method to credit into banking account
	 * @param amt amount to credit
	 */
	public void deposit(double amt) {
		this.balance += amt;
	}
	
	/**
	 * method to get current balance
	 * @return current balance
	 */
	public double getBalance() {
		return this.balance;
	}
}
