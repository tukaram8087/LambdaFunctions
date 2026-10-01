package com.bank;

import java.util.function.Supplier;

public class OTPGenerator {

	public static void main(String[] args) {
		
		
		Supplier <String > otpGenerator = () ->
		
		{
			char [] vowels = {'A','E','I','O','U'};
			
			int index = (int ) (Math.random() * 4);
			
			String otp = String.valueOf(vowels[index]);
			
			for(int temp =0;temp<5;temp++) {
				int num = (int) (Math.random() * 9 );
				
				otp+= num;
			}
			return otp;
			
		};
		
	System.out.println(otpGenerator.get());	
	
	}

}
