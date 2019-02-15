package com.anand.practise;

import javax.print.DocFlavor.STRING;

public class PasswordShouldbeChar {

	public static void main(String[] args) {
		String stringPassword = "Password";
		System.out.print("Original String password value: ");
		System.out.println(stringPassword);
		System.out.println("Original String password hashCode: " + Integer.toHexString(stringPassword.hashCode()));

		String newString = "********";
		stringPassword = stringPassword.replace(stringPassword, newString);

		System.out.print("String password value after trying to replace it: ");
		System.out.println(stringPassword);
		System.out.println("hashCode after trying to replace the original String: "
				+ Integer.toHexString(stringPassword.hashCode()));
		
	}

}
