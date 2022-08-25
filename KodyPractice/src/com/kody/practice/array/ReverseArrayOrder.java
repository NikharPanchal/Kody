package com.kody.practice.array;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * @objective Write a Java Program to print the elements of an array in reverse
 *            order
 * @Developer Nikhar
 * @Date 14-Jun-2022
 */
public class ReverseArrayOrder {

	private static Scanner sc;

	public static void main(String[] args) {

		sc = new Scanner(System.in);
		System.out.println("How many elemet do you want to insert :- ");
		try {
			int n = sc.nextInt();
			int[] arr = new int[n];
			// insert element in array
			for (int i = 0; i < arr.length; i++) {
				System.out.print("Enter " + (i + 1) + " Element :- ");
				arr[i] = sc.nextInt();
			}
			// print reverse order array
			System.out.println("\n\nReverse order element");
			for (int i = arr.length - 1; i >= 0; i--) {
				System.out.print(arr[i] + " ");
			}
		} catch (InputMismatchException e) {
			System.out.println("Invalid input..!only accept interger value");
		}
	}
}
