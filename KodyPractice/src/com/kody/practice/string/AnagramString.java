package com.kody.practice.string;

import java.util.Scanner;

/**
 * @objective Write a program to check two string are anagram or not
 * @Developer Nikhar
 * @Date 07-Jun-2022
 */
public class AnagramString {

	private static Scanner sc;

	public static void main(String[] input) {
		String str1, str2;
		int temp = 0;
		int flag = 0;
		sc = new Scanner(System.in);

		System.out.print("Enter First String : ");
		str1 = sc.nextLine();
		System.out.print("Enter Second String : ");
		str2 = sc.nextLine();

		int firstStringLength = str1.length();
		System.out.println("Length of str1: " + firstStringLength);
		int secondStringLength = str2.length();
		System.out.println("Length of str2: " + secondStringLength);
		int n = firstStringLength;

		if (firstStringLength != secondStringLength) {
			System.out.print("Both Strings Must Have The Same Length");
		} else {
			for (int i = 0; i < n; i++) {
				temp = 0;
				for (int j = 0; j < n; j++) {
					if (str1.toLowerCase().charAt(i) == str2.toLowerCase().charAt(j)) {
						temp = 1;
						break;
					}
				}
				if (temp == 0) {
					flag = 1;
					break;
				}
			}
			if (flag == 1) {
				System.out.print("Strings are not Anagrams");
			} else {
				System.out.print("Strings are Anagrams");
			}
		}
	}
}