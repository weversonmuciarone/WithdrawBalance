package entities;

import exceptions.BusinessException;

public class Account {
	private int number;
	private String name;
	private double balance;
	private double WithdrawLimit;
	
	public Account() {
	}

	public Account(int number, String name, double balance, double withdrawLimit) {
		this.number = number;
		this.name = name;
		this.balance = balance;
		WithdrawLimit = withdrawLimit;
	}

	public int getNumber() {
		return number;
	}

	public void setNumber(int number) {
		this.number = number;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getBalance() {
		return balance;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}

	public double getWithdrawLimit() {
		return WithdrawLimit;
	}

	public void setWithdrawLimit(double withdrawLimit) {
		WithdrawLimit = withdrawLimit;
	}
	 public void deposit(double ammount) {
		 balance += ammount;
	 }
	 
	 public void withdraw(double ammount) {
		 validateWithdraw(ammount);
		 balance -= ammount;
	 }
	 
	 public void validateWithdraw(double ammount) {
		 if (ammount > getWithdrawLimit()) {
				throw new BusinessException("Withdraw error: The amount exceeds withdraw limit");
			}
		 if (ammount > getBalance()) {
				throw new BusinessException("Withdraw error: Not enough balance");
			}
	 }

}
