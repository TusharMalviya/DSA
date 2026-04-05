package com.recursion;

import java.util.Collections;
import java.util.List;

public class ReverseArray {

	public static void reverseArrayList(List<Integer> arr) {
		Collections.sort(arr);
		Collections.reverse(arr);
		for(int i : arr) {
			System.out.print(i + " ");
		}
		System.out.println();
	}
}
