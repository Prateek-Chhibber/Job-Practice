package com.array;

public class PrimeNumberSum {

	public static void main(String[] args) {
		int i, number, count,sum =0; 

		System.out.println(" Prime Numbers from 1 to 100 are : ");	
		for(number = 1; number <= 100; number++)
		{
			count = 0;
			for (i = 2; i <= number/2; i++)
			{
				if(number % i == 0)
				{
					count++;
					break;
				}
			}
			if(count == 0 && number != 1 )
			{
				System.out.print(number + " ");
				sum += number;
			}  
		}
		System.out.println("\nSum of prime numbers : "+sum);
	}

}
