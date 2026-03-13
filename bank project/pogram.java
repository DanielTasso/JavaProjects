package aplication;

 import java.util.*;
 
 import entities.Account;
 
 import java.util.Scanner;

public class program {

	public static void main(String[] args) {
		
		Scanner sc =new Scanner (System.in);
		
		Account account;
		
		 System.out.print("Enter account number: ");
		 int accountNumber = sc.nextInt();
		 
		 sc.nextLine();
		 
		 System.out.print("Enter account holder: ");
		 String name = sc.nextLine();
		 
		 System.out.print("Is there na initial deposit (y/n)? ");
		 char response = sc.next().charAt(0);
		 
		 if(response == 'y') {
			 
			 System.out.print("Enter initial deposit value: ");
			 double initialDeposit = sc.nextDouble();
			 
			 account = new Account(initialDeposit, name, accountNumber);
			 
		 }else {
			 account = new Account(name, accountNumber);
		 }
		 
		 
		 System.out.println();
		 System.out.println("Account data: ");
		 System.out.println(account);
		 
		 System.out.println();
			 
		 System.out.print("Enter a deposit value: ");	
		 double depositValue = sc.nextDouble();
		 
		 account.deposit(depositValue);
		 
		 System.out.println();
		 
		 System.out.println("updated account data: ");
		 System.out.println(account);
		 
		 System.out.println();
		 
		 System.out.print("Enter a withdraw value: ");
		 double withdrawValue = sc.nextDouble();
		 
		 account.withdraw(withdrawValue);
		 
		 System.out.println();
		 
		 System.out.println("updated account data: ");
		 System.out.print(account);
		 
		sc.close();

	}

}
