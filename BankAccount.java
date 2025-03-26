package suncoastChapter2;

import java.util.Date;

/**
 * This class defines a basic bank account
 * This class demonstrates the basics of java classes
 * It has variables representing properties
 * It has methods representing behaviors
 * It has a main method that tests the functionality of the class
 * @author Jan Kozlow
 *
 */
public class BankAccount {
	// Member variables for the BankAccount class
	double accountBalance;   // account balance
	String accountId;		// account id
	String accountOwner;	// Owner of the account
	
	// Constructor - call this method to create an instance of the BankAccount class
	public BankAccount() {
		accountBalance = 0;
		accountId = "";
		accountOwner = "";
	}

	// this method withdraws an amount from the account
	public double withdraw(double amount) {
			accountBalance = accountBalance - amount;
			return amount;
	}
	
	// This method deposits an mount into the account
	public void deposit(double amount) {
		accountBalance = accountBalance + amount;
	}
	
	// This method sets the name of the account owner
	public void setOwner(String name) {
		accountOwner = name;
	}
	
	// This method sets the Id of the account
	public void setId(String id) {
		accountId = id;
	}
	
	// This method prints information about the account
	public void printInfo() {
		System.out.println("Account Id = " + accountId);
		System.out.println("Account Owner = " + accountOwner);
		System.out.println("Account balance = " + accountBalance);
		
	}
	
	public static void main(String[] args) {
		
		BankAccount myAccount = new BankAccount();
		myAccount.deposit(20000.00);
		myAccount.withdraw(1000.00);
		myAccount.setId("ABC123");
		myAccount.setOwner("John Smith");
		myAccount.printInfo();
	}

}
