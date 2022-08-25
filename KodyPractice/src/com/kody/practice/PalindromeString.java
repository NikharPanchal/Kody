package com.kody.practice;

import java.util.Scanner;
/**
 * @objective Write a program to check PalindromeString
 * @developer Nikhar Panchal
 */
public class PalindromeString {

	private static Scanner sc;

	public static void main(String[] args) {
		sc = new Scanner(System.in);
		System.out.println("Enter the String :- ");
		String str = sc.next();
		//converting string to character array
		char ch[] = str.toCharArray();
		String ans = "";
		for (int i = ch.length - 1; i >= 0; i--) {
			//store one by one character in array
			ans += ch[i];
		}
		System.out.println("Original String :: " + str);
		System.out.println("Reverse String :: " + ans);
		//Check whether string is equal or not
		if (str.equals(ans)) {
			System.out.println("\nGiven String is palindrome");
		} else {
			System.out.println("\nGiven String is not palindrome");
		}
		sc.close();
	}
}
