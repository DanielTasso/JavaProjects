package entities;

public class Account {
	
	  private double balance;
	  private String holder;
	  private int accountNumber;
	  
	  public Account(double initialDeposit, String holder, int accountNumber) {
		this.holder = holder;
		this.accountNumber = accountNumber; 
		deposit(initialDeposit);
		
	  }
	  

	  public Account(String holder, int accountNumber) {
		super();
		this.holder = holder;
		this.accountNumber = accountNumber;
	  }


	  public double getBalance() {
		  return balance;
	  }

	  
	  public String getHolder() {
		  return holder;
	  }


	  public void setHolder(String holder) {
		  this.holder = holder;
	  }


	  public int getAccountNumber() {
		  return accountNumber;
	  }


	  
	  public void deposit (double amount) {
		  
		  balance += amount;
	  }
	
	  
	  public void withdraw ( double amount) {
		  balance -= amount+5;
	  }
	  
	    
	 public String toString() {
		 return "Account "
	           + accountNumber 
	           + ", Holder: "
	           + holder 
	           + ", balance: $"
	           + String.format("%.2f", balance);
	              
	 }
	  
	  
}
