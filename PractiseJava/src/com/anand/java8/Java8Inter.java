package com.anand.java8;

public interface Java8Inter {
	public void test();
	public default void testDefault(){
		System.out.println("test in Java8Inter");
	}

	public static void testDefaultStatus(){
		System.out.println("test Static");
	}
}
