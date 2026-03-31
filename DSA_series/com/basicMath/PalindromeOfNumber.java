package com.basicMath;

public class PalindromeOfNumber {

	public static boolean isPalindrome(int n) {
		int duplicateNum = n;
		int revNumber = 0;
		while(n>0) {
			int lastdig = n%10;
			revNumber = (revNumber*10)+lastdig;
			n/=10;
		}
		if(revNumber==duplicateNum) return true;
		
		return false;
	}
	
}
