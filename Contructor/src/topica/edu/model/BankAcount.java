package topica.edu.model;

import java.util.Scanner;

public class BankAcount {
	private String acountNumber;
	private double balance;
	private String customeName;
	private String email;
	
	//xu ly nhap
	s
	
	
	
	
	//
	private void withrawn(double amount){
		if (balance<amount) {
			System.out.println("ban chi rut toi da "+this.balance);
		}
		else {
			this.balance = this.balance-amount;
		}
	}
	private void deposit(double amount) {
		this.balance -=amount;
		System.out.println(" Rut tien thanh cong so luong :"+ amount);
		System.out.println(" so du tai khoan hien tai:"+this.balance);
		
	}
	
	
	
	
	
	
	public BankAcount() {
		super();
	}

	public BankAcount(String acountNumber, double balance, String customeName, String email) {
		super();
		this.acountNumber = acountNumber;
		this.balance = balance;
		this.customeName = customeName;
		this.email = email;
	}

	public String getAcountNumber() {
		return acountNumber;
	}

	public void setAcountNumber(String acountNumber) {
		this.acountNumber = acountNumber;
	}

	public double getBalance() {
		return balance;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}

	public String getCustomeName() {
		return customeName;
	}

	public void setCustomeName(String customeName) {
		this.customeName = customeName;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	@Override
	public String toString() {
		return "BankAcount [acountNumber=" + acountNumber + ", balance=" + balance + ", customeName=" + customeName
				+ ", email=" + email + "]";
	}
	
	
}
