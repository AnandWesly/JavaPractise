package com.anand.javabuzzles;

import java.util.HashSet;
import java.util.Set;

public class FindDuplicateElement {

	public static void main(String[] args) {
		Integer[] intArr = new Integer[] { 1, 5, 7, 5, 6, 10, 100, 100 ,100};
		Set<Integer> serIntArr = new HashSet<Integer>();
		for (Integer number : intArr) {
			if (!serIntArr.add(number)) {
				System.out.println("Found duplicate number:" + number);
			}
		}
	}

}
