package com.runners;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import com.recursion.FactorialOfNumber;
import com.recursion.Fibonacci;
import com.recursion.Palindrome;
import com.recursion.PrintNames;
import com.recursion.ReverseArray;
import com.recursion.SumOfNumbers;

public class RecursionRunner {

	public static void main(String[] args) {
		
//		To Print names recursively
		PrintNames.printNamesUsingRecursiveMethod(5);
		
//		To print the name N times recursively
		PrintNames.printNTimes(1, 5);
		
//		To print numbers in reverse order 
		PrintNames.printNumbersInReverseOrder(10);
		System.out.println();
		
//		To add the sum of N natural numbers
//		Solution 1
		System.out.println("Solution 1: The sum of N natural numbers is: "+ SumOfNumbers.sumOfNaturalNumbers(5, 0));
//		Solution 2
		System.out.println("Solution 2: The sum of N natural numbers is: " + SumOfNumbers.sumOfNo(5));
		
//		To print factorial of a number
		System.out.println("The factorial of 5 is:" + FactorialOfNumber.factOfNumber(5));
		
//		To print the reverse of a arrayList
//		Add-on (first we are sorting the array using collection framework then reversing the array)
		List<Integer> arr = new ArrayList<>(Arrays.asList(1,2,9,8,5,6,7));
		ReverseArray.reverseArrayList(arr);
		
//		To check if a string is Palindrome 
		boolean checkPalindrome = Palindrome.checkPalindrome(0, "madam");
		if(checkPalindrome) {
			System.out.println("Palindrome");
		} else {
			System.out.println("Not Palindrome");
		}
		
		
//		To print fibonacci series till N
		System.out.print(Fibonacci.fib(4) + " ");
		
	}
	
}
