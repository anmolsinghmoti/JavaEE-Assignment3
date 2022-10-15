//Anmol Singh 301145362
package com.spring.packages.Entities;

public class AccountTypeEntity {

	private int accountTypeId;
	private String accountTypeName;
	private float rate;
	//Entity class for AccountType
	
	
	public AccountTypeEntity() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public AccountTypeEntity(int accountTypeId, String accountTypeName, float rate) {
		super();
		this.accountTypeId = accountTypeId;
		this.accountTypeName = accountTypeName;
		this.rate = rate;
	}
	public int getAccountTypeId() {
		return accountTypeId;
	}
	public void setAccountTypeId(int accountTypeId) {
		this.accountTypeId = accountTypeId;
	}
	public String getAccountTypeName() {
		return accountTypeName;
	}
	public void setAccountTypeName(String accountTypeName) {
		this.accountTypeName = accountTypeName;
	}
	public float getRate() {
		return rate;
	}
	public void setRate(float rate) {
		this.rate = rate;
	}
	
	

}
