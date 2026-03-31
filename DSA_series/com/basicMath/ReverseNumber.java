package com.basicMath;

public class ReverseNumber {
	
	public static int revNum(int n) {
		int revNum=0;
		while(n>0) {
			int lastDig = n%10;
			revNum = (revNum * 10) + lastDig;
			n/=10;
		}
		return revNum;
	}

}
