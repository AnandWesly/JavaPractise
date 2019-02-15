package com.anand.practise;

import java.util.LinkedHashMap;
import java.util.Map;

public class NonRepeatingFirstChar {
	static final int NO_OF_CHARS = 256;
	static char count[] = new char[NO_OF_CHARS];

	public static void main(String[] args) {
		firsNonRepeatingByLinkedHash("anandwesly");
		int index = firstNonRepeating("anandwesly");
		System.out.println(index == -1 ? "Either all characters are repeating or string " + "is empty"
				: "First non-repeating character is " + "AnandWesly".charAt(index));
	}

	static void getCharCountArray(String str) {
		for (int i = 0; i < str.length(); i++) {
			char ch = str.charAt(i);
			count[ch] = (char) (count[ch] + 1);
		}
		// System.out.println(String.valueOf(count));
	}

	static int firstNonRepeating(String str) {
		getCharCountArray(str);
		int index = -1, i;

		for (i = 0; i < str.length(); i++) {
			if (count[str.charAt(i)] == 1) {
				index = i;
				break;
			}
		}

		return index;
	}

	static void firsNonRepeatingByLinkedHash(String str) {
		Map<Character, Integer> mapStr = new LinkedHashMap<Character, Integer>();
		for (int i = 0; i < str.length(); i++) {
			if (mapStr.containsKey(str.charAt(i))) {
				mapStr.put(str.charAt(i), mapStr.get(str.charAt(i)) + 1);

			} else {
				mapStr.put(str.charAt(i), 1);
			}
		}

		for (Character key : mapStr.keySet()) {
			if (mapStr.get(key).intValue() == 1) {
				System.out.println("First non-repeating character is by using LinkedHashMap==>" + key);
				break;
			}

		}
	}
}
