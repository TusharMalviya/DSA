package com.runners;

import com.basicMath.ArmstrongNumber;
import com.basicMath.CheckForPrime;
import com.basicMath.CountOfDigits;
import com.basicMath.GCDofTwoNumbers;
import com.basicMath.PalindromeOfNumber;
import com.basicMath.PrintAllDivisiors;
import com.basicMath.ReverseNumber;

public class BasicMathRunner {
	public static void main(String[] args) {
		
		
//		To find the exact count of digits in the input
		int exactCount = CountOfDigits.findExactCount(24681000);
		System.out.println("The exact count of 24681000 is:" + exactCount);
		
//		To find the reverse of a give integer as input
		int revNumber = ReverseNumber.revNum(24681000);
		System.out.println("The reverse of the number 24681000 is: " + revNumber);
		
		
//		To find if the number is a palindrome
		boolean isPalin = PalindromeOfNumber.isPalindrome(1234321);
		System.out.println("The number 1234321 is palindrome? :"+isPalin);
		
		
//		To find if the number is Armstrong number or not
		boolean isArmStrong = ArmstrongNumber.isArmstrong(371);
		System.out.println("The number 1634 is Armstrong number? : " + isArmStrong);
		
//		To print a diviors of a number
		PrintAllDivisiors.printAllDiv(36);
		
//		To check if a number is prime number or not
		CheckForPrime.isPrime(17);
		
		
//		To check for the GCD of two numbers
		System.out.println("The GCD of 20 & 15 is: " + GCDofTwoNumbers.gcd(20, 15));
	}
}
