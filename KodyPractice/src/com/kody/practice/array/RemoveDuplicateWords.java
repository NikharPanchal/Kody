package com.kody.practice.array;

import java.util.Scanner;
import java.util.regex.Pattern;

/**
 * @objective RegEx to remove instances of words that are repeated more than
 *            once, but retain the first occurrence of any case-insensitive
 *            repeated word. For example, the words love and to are repeated in
 *            the sentence I love Love to To tO code. Can you complete the code
 *            in the editor so it will turn I love Love to To tO code into I
 *            love to code?
 * 
 *            -Write a RegEx that will match any repeated word. -Complete the
 *            second compile argument so that the compiled RegEx is
 *            case-insensitive. -Write the two necessary arguments for
 *            replaceAll such that each repeated word is replaced with the very
 *            first instance the word found in the sentence. It must be the
 *            exact first occurrence of the word, as the expected output is
 *            case-sensitive.
 * 
 * 
 * @developer Nikhar Panchal
 */
public class RemoveDuplicateWords {

	private static Scanner sc;

	public static void main(String[] args) {
		sc = new Scanner(System.in);
		System.out.println("How many sentence do you want :- ");

		int n = Integer.parseInt(sc.nextLine());

		String[] str = new String[n];
		System.out.println("Enter " + n + " sentense : ");

		for (int i = 0; i < n; i++) {
			str[i] = sc.nextLine();
		}

		String pattern = "\\b(\\w+)\\b\\s*(?=.*\\b\\1\\b)";
		
		String result[] = new String[n];
		for (int i = 0; i < str.length; i++) {
			result[i] = str[i].replaceAll(pattern, "");
		}

		
		for (int i = 0; i < result.length; i++) {
			System.out.println("After remove duplicate word:" + result[i]);
		}

		sc.close();
	}
}
