package com.anand.practise;

import java.util.Arrays;

public class ArrayReverseWithOutNewArray {

	public static void main(String[] args) {
		ArrayReverseWithOutNewArray ar = new ArrayReverseWithOutNewArray();
		int[] a = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11 };
		ar.reverseArrayMid(a);
		ar.reverseArray(a);
	}

	public void reverseArrayMid(int[] a) {
		int middle = a.length / 2;
		int i = 0, j = a.length - 1, temp = 0;
		for (;i < middle; i++, j--) {
			temp = a[i];
			a[i] = a[j];
			a[j] = temp;
		}
		System.out.println(Arrays.toString(a));
	}
	
	public void reverseArray(int[] a) {
		int  j = a.length - 1, temp = 0;
		for ( int i=0;i  < a.length - 1; i++) {
			temp = a[i];
			a[i] = a[j];
			a[j] = temp;
			if(i == j){
				break;
			}
			j--;
		}
		System.out.println(Arrays.toString(a));
	}
}
