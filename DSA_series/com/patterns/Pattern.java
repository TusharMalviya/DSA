package com.patterns;

public class Pattern {

	//	* * * * * 
	//	* * * * * 
	//	* * * * * 
	//	* * * * * 
	//	* * * * * 
	public void P1(int n) {
		System.out.println("Pattern 1");
		for(int i=0;i<n;i++) {
			for(int j=0;j<n;j++) {
				System.out.print("* ");
			}
			System.out.println();
		}
	}
	
	
	//	* 
	//	* * 
	//	* * * 
	//	* * * * 
	//	* * * * *
	public static void P2(int n) {
		System.out.println("Pattern 2");
		for(int i=0;i<n;i++) {
			for(int j=0;j<=i;j++) {
				System.out.print("* ");
			}
			System.out.println();
		}
	}
	
	//	Pattern 3
	//	1 
	//	1 2 
	//	1 2 3 
	//	1 2 3 4 
	//	1 2 3 4 5
	public static void P3(int n) {
		System.out.println("Pattern 3");
		
		for(int i=0;i<n;i++) {
			int count = 1;
			for(int j=0;j<=i;j++) {
				System.out.print(count + " ");
				count+=1;
			}
			System.out.println();
		}
	}
	
	
	//	Pattern 4
	//	1 
	//	2 2 
	//	3 3 3 
	//	4 4 4 4 
	//	5 5 5 5 5
	public static void P4(int n) {
		System.out.println("Pattern 4");
		int count = 1;
		for(int i=0;i<n;i++) {
			for(int j=0;j<=i;j++) {
				System.out.print(count + " ");
			}
			count+=1;
			System.out.println();
		}
	}
	
	
	//	Pattern 5
	//	* * * * * 
	//	* * * * 
	//	* * * 
	//	* * 
	//	* 
	public static void P5(int n) {
		System.out.println("Pattern 5");
		for(int i=0;i<n;i++) {
			for(int j=0;j<n-i;j++) {
				System.out.print("* ");
			}
			System.out.println();
		}
	}
	
	
	//	Pattern 6
	//	1 2 3 4 5 
	//	1 2 3 4 
	//	1 2 3 
	//	1 2 
	//	1
	public static void P6(int n) {
		System.out.println("Pattern 6");
		for(int i=0;i<n;i++) {
			int count = 1;
			for(int j=0;j<n-i;j++) {
				System.out.print(count++ + " ");
			}
			System.out.println();
		}
	}
	
	//	Pattern 7
	//	    *
	//	   ***
	//	  *****
	//	 *******
	//	*********
	public static void P7(int n) {
		System.out.println("Pattern 7");
		for(int i=0;i<n;i++) {
			//Print white spaces
			for(int j=0;j<n;j++) {
				if(j<n-i-1 ) {
					System.out.print(" ");
				}else{
					System.out.print("*");
				}
			}
			for(int k=1;k<=i;k++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
	
	
	//	Pattern 8
	//	*********
	//	 *******
	//	  *****
	//	   ***
	//	    *
	public static void P8(int n) {
		System.out.println("Pattern 8");
		for(int i=0;i<n;i++) {
			for(int k=0;k<n;k++) {
				if(k<i) {
					System.out.print(" ");
				}else {
					System.out.print("*");
				}
				
			}
			for(int j=1;j<n-i;j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
	
	
//	Pattern 9
//	    *
//	   ***
//	  *****
//	 *******
//	*********
//	 *******
//	  *****
//	   ***
//	    *
	public static void P9(int n) {
		System.out.println("Pattern 9");
		for(int i=0;i<n;i++) {
			for(int j=0;j<n;j++) {
				System.out.print((j<n-i-1)?" ":"*");
			}
			for(int k=1;k<=i;k++) {
				System.out.print("*");
			}
			System.out.println();
		}
		for(int i=0;i<n;i++) {
			for(int j=0;j<n;j++) {
				System.out.print((j<=i?" ":"*"));
			}
			for(int k=2;k<n-i;k++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
}
