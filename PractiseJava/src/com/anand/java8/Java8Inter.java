package com.anand.java8;

public interface Java8Inter {
	public void test();
	public default void testDefault(){
		System.out.println("testDefault");
	}

	public static void testDefaultStatus(){
		System.out.println("test Static");
	}
}
