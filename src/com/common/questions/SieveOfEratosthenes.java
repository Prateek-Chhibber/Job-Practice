package com.common.questions;

public class SieveOfEratosthenes {

	//	This algorithm is suitable for number <= 10 million

	public static void main(String[] args) {
		//		This is the maximum range achieved up to which this algorithm gives output
		int range = 6661;
		System.out.print("Following are the prime numbers "); 
		System.out.println("smaller than or equal to " + range);
		sieveOfEratosthenes(range);
	}

	public static void sieveOfEratosthenes(int range) {
		//		 Create a boolean array "prime[0..n]" and initialize 
		//		 all entries it as true. A value in prime[i] will 
		//		 finally be false if i is Not a prime, else true.
		//		Step 1 of algorithm
		boolean prime[] = new boolean[range+1];	
		for(int i=0;i<range;i++)
			prime[i]=true;
		//		Step 2 of algorithm	
		for(int p=2;p*p<=range;p++) {
			// If prime[p] is not changed, then it is a prime
			if(prime[p] == true) 
			{ 
				//				Step 3 of algorithm
				// Update all multiples of p 
				for(int i = p*p; i <= range; i += p) 
					prime[i] = false; 
			} 
		}

		//Print all prime numbers now
		for(int i = 2; i <= range; i++) 
		{ 
			if(prime[i] == true) 
				System.out.print(i + " "); 
		}
	}

}
