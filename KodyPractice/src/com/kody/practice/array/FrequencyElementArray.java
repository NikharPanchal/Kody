package com.kody.practice.array;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * @objective Write a Java Program to find the frequency of each element in the
 *            array
 * @Developer Nikhar
 * @Date 14-Jun-2022
 */
public class FrequencyElementArray {

	private static Scanner sc;

	public static void main(String[] args) {
		sc = new Scanner(System.in);
		System.out.print("Enter the size :- ");
		try {
			int n = sc.nextInt();
			String[] arr = new String[n];

			// insert element in array
			for (int i = 0; i < n; i++) {
				System.out.print("Enter " + (i + 1) + " Element : ");
				arr[i] = sc.next();
			}

			for (int i = 0; i < n; i++) {
				int count = 1;
				for (int j = i + 1; j < n; j++) {
					if (arr[i].equals(arr[j])) {
						count++;
						arr[j] = "%";// replace with % if element is repeat
					}
				}

				// print array if it not contain % 
				if (!arr[i].contains("%")) {
					System.out.println(arr[i] + " Element Occured :: " + count + " Times");
				}
			}
		} catch (InputMismatchException e) {
			System.out.println("Invalid input..!\nEnter size in integer only");
		}
	}

}
