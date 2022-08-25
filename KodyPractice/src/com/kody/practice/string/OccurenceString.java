package com.kody.practice.string;

import java.util.Scanner;

/**
 * @objective Write a program to check Occurence of the string
 * @Developer Nikhar
 * @Date 08-Jun-2022
 */
public class OccurenceString {

	private static Scanner sc;

	public static void main(String[] args) {
		sc = new Scanner(System.in);
		System.out.println("Enter the string :- ");
		String input_str = sc.next();
		String str = input_str.toLowerCase();
		for (char c = 'a'; c <= 'z'; c++) {
			int flag = 0;
			for (int i = 0; i < str.length(); i++) {
				if (c == str.charAt(i)) {
					flag++;
				}
			}
			if (flag != 0) {
				System.out.println(c + " Occured at " + flag + " Times");
			}
		}
	}
}