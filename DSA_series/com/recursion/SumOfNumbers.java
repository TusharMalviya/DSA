package com.recursion;

public class SumOfNumbers {
	
	
	//Solution 1
	public static int sumOfNaturalNumbers(int n, int sum){
		if(n<=0) return sum;
		sum+=n;
		return sumOfNaturalNumbers(n-1, sum);
	}

	
	//Solution 2
	public static int sumOfNo(int n) {
		if(n==1) {
			return 1;
		}
		return n + sumOfNo(n-1);
	}
}
