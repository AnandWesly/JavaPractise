package com.anand.practise;

import static org.junit.Assert.*;

import org.junit.Test;

public class JavaPractiseUnitTest {

	@Test
	public void testArrayReverseWithOutNewArray() {
		ArrayReverseWithOutNewArray obj = new ArrayReverseWithOutNewArray();
		int[] a = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11 };
		obj.reverseArray(a);
	}

	@Test
	public void testArrayReverseWithOutNewArrayMid() {
		ArrayReverseWithOutNewArray obj = new ArrayReverseWithOutNewArray();
		int[] a = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11 };
		obj.reverseArrayMid(a);
	}
}
