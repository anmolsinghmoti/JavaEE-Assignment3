//Anmol Singh 301145362
package com.spring.packages.Entities;

import org.springframework.stereotype.Component;
@Component
//Account entity class
public class AccountEntity {

	private int accountNumber;
	private int accountTypeId;
	private long customerId;
	private double balance;
	private double rate;
	
	public AccountEntity() {
		super();
		// TODO Auto-generated constructor stub
	}
	public AccountEntity(int accountNumber, int accountTypeId, long customerId, double balance, double rate) {
		super();
		this.accountNumber = accountNumber;
		this.accountTypeId = accountTypeId;
		this.customerId = customerId;
		this.balance = balance;
		this.rate = rate;
	
		
	}
	public int getAccountNumber() {
		return accountNumber;
	}
	public void setAccountNumber(int accountNumber) {
		this.accountNumber = accountNumber;
	}
	public long getCustomerId() {
		return customerId;
	}
	public void setCustomerId(long customerId) {
		this.customerId = customerId;
	}
	public int getAccountTypeId() {
		return accountTypeId;
	}
	public void setAccountTypeId(int accountTypeId) {
		this.accountTypeId = accountTypeId;
	}
	public double getBalance() {
		return balance;
	}
	public void setBalance(double balance) {
		this.balance = balance;
	}
	public double getRate() {
		return rate;
	}
	public void setRate(double rate) {
		this.rate = rate;
	}
}
