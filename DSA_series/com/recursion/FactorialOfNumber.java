package com.recursion;

public class FactorialOfNumber {
	
	public static int factOfNumber(int n) {
		if(n==1) return 1;
		return n * factOfNumber(n-1);
	}

}
