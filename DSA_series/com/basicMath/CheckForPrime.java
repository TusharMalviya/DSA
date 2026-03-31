package com.basicMath;

public class CheckForPrime {
	public static void isPrime(int n) {
		int count=0;
		for(int i=1;i<=Math.sqrt(n);i++) {
			if(n%i==0) {
				count++;
				if((n/i)!=i) {
					count++;
				}
			}
		}
		System.out.println("The number is a prime no? : " + ((count==2)?true:false));
	}
}
