package com.basicMath;

public class ArmstrongNumber {
	
	public static boolean isArmstrong(int n) {
		int sum=0;
		int dup=n;
		while(n>0) {
			int lastDigit = n%10;
			sum = (int) (sum + Math.pow(lastDigit, 3));
			System.out.println(sum);
			n/=10;
		}
		if(dup==sum) return true;
		
		return false;
	}

}
