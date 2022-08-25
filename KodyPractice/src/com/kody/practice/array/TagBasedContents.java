package com.kody.practice.array;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * @objective
 * @Developer Nikhar
 * @Date 14-Jun-2022
 */
public class TagBasedContents {

	private static Scanner sc;

	public static void main(String[] args) {
		try {
			sc = new Scanner(System.in);
			System.out.println("How many sentence do you want :- ");

			int n = Integer.parseInt(sc.nextLine());

			String[] str = new String[n];
			System.out.println("Enter " + n + " sentense : ");

			for (int i = 0; i < n; i++) {
				str[i] = sc.nextLine();
			}

			for (int i = 0; i < n; i++) {
				System.out.println(str[i]);
			}

			String[] result = new String[n];
			for (int i = 0; i < str.length; i++) {
				result[i] = str[i].replaceAll("\\<.*?\\>", "");
			}

			for (int i = 0; i < str.length; i++) {
				System.out.println(result[i]);
			}

		}

		catch (InputMismatchException e) {
			System.out.println("Invalid input..");
		} catch (NumberFormatException e) {
			System.out.println("Invalid input..");
		}
	}
}
