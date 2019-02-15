package com.anand.practise;

import java.util.HashMap;
import java.util.Map;

public class HashMapPractice {

	public static void main(String[] args) {
		
		Map<String, Integer> person = new HashMap<>();
		String str = "Anand";
		String st1 = "Anand";
		System.out.println(str == st1);
		//System.out.println(str + st1);
		person.put(str, 1);
		person.put(new String("Anand"), 2);
		System.out.println(person.toString());
		person.forEach((key,value) -> System.out.println(key + " = " + value));
		
	}

}
