package com.basicMath;

public class CountOfDigits {
//To find the exact count of digits in the number 
//Ex: 4545
//count=4
	public static void main (String[] args) {
		System.out.println("The exact count is: " + findExactCount(48476));
	}
	
	public static int  findExactCount(int number) {
		
		int count=0;
		while(number>0) {
			count++;
			number/=10;
		}
		return count;
	}
}
