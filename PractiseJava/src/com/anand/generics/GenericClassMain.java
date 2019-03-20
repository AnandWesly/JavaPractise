package com.anand.generics;

public class GenericClassMain {

	public static void main(String[] args) {
		GenericClass<Integer, String> gene = new GenericClass<Integer, String>();
		gene.setKey(1);
		gene.setValue("Anand");
		System.out.println(gene.getKey()+"###"+gene.getValue());
		
		GenericClassWithType geneWithType = new GenericClassWithType();
		geneWithType.setKey(1);
		geneWithType.setValue("Anand");
		System.out.println(gene.getKey()+"###"+gene.getValue());
	}

}
