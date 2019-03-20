package com.anand.java8;

public class InterfaceTest implements Java8Inter {

	public static void main(String[] args) {
		//Java8Inter.testDefaultStatus();
		InterfaceTest obj = new InterfaceTest();
		obj.testDefault();
		obj.test();
	}

	public void testDefault(){
		System.out.println("test in InterfaceTest");
	}

	
	@Override
	public void test() {
		System.out.println("test in class");
	}

}
