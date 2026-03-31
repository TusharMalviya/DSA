package com.patterns;

public class P2 {
	
//	* 
//	* * 
//	* * * 
//	* * * * 
//	* * * * *
	public static void Pattern2(int n) {
		System.out.println("Pattern 2");
		for(int i=0;i<n;i++) {
			for(int j=0;j<=i;j++) {
				System.out.print("* ");
			}
			System.out.println();
		}
	}
}
