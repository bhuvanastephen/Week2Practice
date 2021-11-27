package com.greatlearning.service;

public class OTPGenerator {

	public static int generateOtp() {
		
		return 1000 + (int) (Math.random() * 9000 );
		
	}
}
