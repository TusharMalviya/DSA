package com.runners;

import java.util.Scanner;

import com.patterns.*;

public class PatternRunner {
	public static void main(String[] args) {

		int n;
//		Scanner sc = new Scanner(System.in);
//		System.out.println("Enter the * length: ");
//		n = sc.nextInt();
		
//		P1 p1 = new P1();
		//here we are creating an object of P1 class to access the method Patter1
//		p1.Pattern1(n);
		//here we can access the method Pattern2 directly as it is a static method 
//		P2.Pattern2(n);
		
		n=5;
		Pattern obj = new Pattern();
		
		obj.P1(n);  // here we are using the reference obj to call the method
		Pattern.P2(n); //here the P2 method is a static method 
		Pattern.P3(n);
		Pattern.P4(n);
		Pattern.P5(n);
		Pattern.P6(n);
		Pattern.P7(n);
		Pattern.P8(n);
		Pattern.P9(n);
	}
}
