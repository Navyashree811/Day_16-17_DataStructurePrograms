package com.bridgelabz.cashcounter;

public class Customer {
	private String name;
	private long accountNumber;
	private long amount;
	private long cashBalance;
	private Constants.Operation operationType;

	public Customer() {
	}

	public Customer(String name, long accountNumber, long amount, long cashBalance, Constants.Operation operationType) {
		this.name = name;
		this.accountNumber = accountNumber;
		this.amount = amount;
		this.cashBalance = cashBalance;
		this.operationType = operationType;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public long getAccountNumber() {
		return accountNumber;
	}

	public void setAccountNumber(long accountNumber) {
		this.accountNumber = accountNumber;
	}

	public long getAmount() {
		return amount;
	}

	public void setAmount(long amount) {
		this.amount = amount;
	}

	public long getCashBalance() {
		return cashBalance;
	}

	public void setCashBalance(long cashBalance) {
		this.cashBalance = cashBalance;
	}

	public Constants.Operation getOperationType() {
		return operationType;
	}

	public void setOperationType(Constants.Operation operationType) {
		this.operationType = operationType;
	}

	@Override
	public String toString() {
		return "Customer{" + "name='" + name + '\'' + ", accountNumber=" + accountNumber + ", amount=" + amount
				+ ", cashBalance=" + cashBalance + ", operationType=" + operationType + '}';
	}

}
