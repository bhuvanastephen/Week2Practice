package com.greatlearning.service;
import java.util.Scanner;

public class Banking {

	private int balance =10000;
	private static Scanner sc=new Scanner(System.in);
	
	public void deposit(int amount) {
		if (amount > 0) {
			balance += amount;
			System.out.println("Sucessfully added Rs " + amount + "New balance is " + balance );
		}
	}
	
		public void withdraw(int amount) {
			if (amount > balance) {
			System.out.println("Insufficient Funds  Balance is " + balance );
			}else {
				balance -= amount;
				System.out.println("Sucessfully withdrawn Rs " + amount + "New balance is " + balance );
			}
		}
		
		public void transfer(int amount, String recipientAcountNumber) {
			
			if (amount > balance) {
				System.out.println("Insufficient Funds  Balance is " + balance );
				return;
				}
			
			int otpGenerator = OTPGenerator.generateOtp();
			System.out.println("OTP Generated " + otpGenerator );

			System.out.println("Enter the OTP Generated "  );
			int otpGeneratorTyped = sc.nextInt();
			
			if (otpGeneratorTyped == otpGenerator) {
				if (amount > balance) {
					System.out.println("Insufficient Funds  Balance is " + balance );
					}else {
						balance -= amount;
						System.out.println("Transfer Sucessfull Rs." + amount + "to Account " + recipientAcountNumber + ". your balance is now " + balance );
					}
				
			}
			
		}
		
		public void Logout() {
			System.out.println("Thanks for Banking with us !!! " );
		}

	}

