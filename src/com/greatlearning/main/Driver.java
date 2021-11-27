package com.greatlearning.main;
import java.util.Scanner;
import com.greatlearning.model.Customer;
import com.greatlearning.service.Banking;


 class Driver {

	private static Scanner sc=new Scanner(System.in);
	private static Customer cust =new Customer("G000123","pass");
	private static Banking bank =new Banking();
	public static void main(String[] args){
		int choice;
		int amount;
		String reciac;
		//Welcome Message
				displayMessage();
				
				//Authenticate
				if (isCredenTialOK()) {
					System.out.println("Authentication Success");
					
					//Display Main Menu
					displayMenu();
					
					do {
						System.out.println("Enter Your Choice ");
						choice =(int) sc.nextInt();
						switch (choice)
						{
							case 1:
								System.out.println("1.Enter the amount to Deposit ");
								amount= sc.nextInt();
								bank.deposit(amount);
								break;
							case 2:
								System.out.println("2.Enter the amount to Withdraw ");
								amount= sc.nextInt();
								bank.withdraw(amount);
								break;
							case 3:
								System.out.println("3.Enter the amount to Transfer ");
								amount= sc.nextInt();
								System.out.println("Enter the recipient account ");
								reciac= sc.next();
								bank.transfer(amount, reciac);
								break;
							case 4:
								bank.Logout();
								break;									
						}
					}while(choice != 4);
					
					
				}else {
					System.out.println("Authentication Faiier");
				}
	}
	
	public static Boolean isCredenTialOK() {
		System.out.println("Enter Your Account Number");
		String accountNo= sc.next();
		System.out.println("Account Number" + accountNo );
		
		System.out.println("Enter Your Password");
		String password= sc.next();
		System.out.println("Password" + password );
		
		return (cust.getBankAccountNo().equals(accountNo) && cust.getPassword().equals(password));
				
	}
	
	
	public static void displayMessage() {
		System.out.println("Wecome Customer");
	}
	
	public static void displayMenu() {
		
		System.out.println("1.Deposit ");
		System.out.println("2.Withdraw ");
		System.out.println("3.Transfer ");
		System.out.println("4.Logout ");
	}
}
