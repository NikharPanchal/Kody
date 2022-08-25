package com.kody.practice.string;

import java.util.Scanner;

/**
 * @objective Write a program to print reverse string
 * @Developer Nikhar
 * @Date 07-Jun-2022
 */
public class ReverseString {

	private static Scanner sc;

	public static void main(String[] args) {
		sc = new Scanner(System.in);
		System.out.println("Enter the String :- ");
		String str = sc.next();
		String ans = new String();
		//convert string to charArray
		char[] ch = str.toCharArray();
		System.out.println(ch);
		//reverse loop for store the value in string
		for (int i = ch.length - 1; i >= 0; i--) {
			ans += ch[i];
		}
		System.out.println("Reverse String :-" + ans);
	}
}
