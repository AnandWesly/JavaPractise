package com.anand.javabuzzles;

public class TestX {

	public static void main(String[] args) {
		for(int i=0;i<8;i++){
			for(int j=0;j<=i;j++){
				System.out.print("*");
			}
			System.out.println();
		}
		
		for(int i=0;i<8;i++){
			if (i!=7)System.out.print(String.format("%"+(7-i)+"s",""));
			for(int j=0;j<=i;j++){
				System.out.print("*");
			}
			System.out.println();
		}
		
	}

}
