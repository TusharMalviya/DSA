package com.basicMath;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class PrintAllDivisiors {
	
	public static void printAllDiv(int n) {
		List<Integer> ls = new ArrayList<Integer>();
		for(int i=1;i<=Math.sqrt(n);i++) {
			if(n%i==0) {
				ls.add(i);
				if((n/i)!=i) {
					ls.add(n/i);
				}
			}
		}
		System.out.println("Before sorting: " + ls);
		ls.sort((a,b)->a-b);
		System.out.println("after sorting: " + ls);
		
		//To sort in descending order
		ls.sort(Comparator.reverseOrder());
//		OR
//		ls.sort((a,b)->b-a);
		System.out.println("Reverse order sort: " + ls);
	}

}
