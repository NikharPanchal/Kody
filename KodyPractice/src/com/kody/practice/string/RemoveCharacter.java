package com.kody.practice.string;

import java.util.Scanner;

/**
 * @objective Write a program to remove given characters from the string.
 *            (removing character 'a' from the inputString 'Java' the result
 *            will be: Jv)
 * @Developer Nikhar
 * @Date 08-Jun-2022
 */
public class RemoveCharacter {

	private static Scanner sc;

	public static void main(String[] args) {
		sc = new Scanner(System.in);
		
		System.out.print("Enter the String :- ");
		String input_str = sc.next();

		System.out.print("Enter the Character for remove :- ");
		String remove_str = sc.next();

		char remove_char = remove_str.toLowerCase().charAt(0);
		String answer = new String();

		if (input_str.toLowerCase().contains(remove_str.toLowerCase())) {
			for (int i = 0; i < input_str.length(); i++) {
				if (remove_char == input_str.toLowerCase().charAt(i)) {
					continue;
				} else {
					answer += input_str.charAt(i);
				}
			}
			System.out.println("After remove character :- " + answer);
		} else {
			System.out.println(remove_char + " is not present in " + input_str);
		}

	}

}
