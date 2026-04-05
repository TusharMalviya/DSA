package com.recursion;

public class PrintNames {
	
	public void recursiveCall(int n) {
		if(n==0 || n<0) {
			return;
		}
		System.out.println("Tushar");
		n=n-1;
		recursiveCall(n);
	}
	
	public static void printNamesUsingRecursiveMethod(int count) {
		PrintNames obj = new PrintNames();
		obj.recursiveCall(count);
	}
	
	public static void printNTimes(int i , int n) {
		if(i>n) return;
		System.out.println("Tushar count: "+i);
		printNTimes(i+1, n);
	}
	
	
	public static void printNumbersInReverseOrder( int n) {
		if(n<=0) return;
		
		System.out.print(n+" ");
		printNumbersInReverseOrder(n-1);
	}

}
