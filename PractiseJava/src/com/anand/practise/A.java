package com.anand.practise;

public class A {
	static int i =1;
	public void show(){
		System.out.println("A");
	}
	public static void showA(){
		i++;
		System.out.println("B");
	}
	public  A(){
		i++;
	}
}
