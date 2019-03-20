package com.anand.practise;

public class B extends A{
	static int i =3;
	public void show(){
		System.out.println("B"+super.i);
	}
	
	public void showB(){
		System.out.println("B");
	}
	
	public static void main(String[] args) {
		A obj  = new B();
		obj.show();
		System.out.println();
		
	}
}

