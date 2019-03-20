package com.anand.java8;

import java.util.ArrayList;
import java.util.List;

public class Java8Feature implements Java8Inter{

	public static void main(String[] args) {

		List<String> alist = new ArrayList<>();
		
		alist.add("ADD");
		alist.add("UPDATE");

		System.out.println(alist.stream().filter(a -> a.equals("CEASE")).findFirst().orElse("CEASE").toString());
		System.out.println(alist.stream().filter(a -> !a.equals("CEASE")).findAny().orElse("ADD").toString());
		
		
	}

	@Override
	public void test() {
		// TODO Auto-generated method stub
		
	}

}
