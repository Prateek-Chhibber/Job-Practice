package com.common.questions;

public class PrimeNumber {
	
	static int i = 2;
	static boolean flag = false;
	
	public static void main(String[] args) {
		
		primeNumber(19);
		
	}
	
	public static void primeNumber(int num) {
		
		while(i<=num/2) {
			
			//Condition for non prime number
			if(num% i==0) {
				flag = true;
				break;
			}
			++i;
		}
		if(!flag) {
			System.out.println(num + " is a prime no. ");
		}else {
			System.out.println(num + " is not a prime no. ");
		}
	}

}
