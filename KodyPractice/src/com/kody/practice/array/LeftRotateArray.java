package com.kody.practice.array;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * @objective Write a Java Program to left rotate the elements of an array
 * @Developer Nikhar
 * @Date 14-Jun-2022
 */
public class LeftRotateArray {

	private static Scanner sc;

	public static void main(String[] args) {
		sc = new Scanner(System.in);
		System.out.print("Enter the size of array :- ");
		try {
			int n = sc.nextInt();
			String arr[] = new String[n];

			for (int i = 0; i < arr.length; i++) {
				System.out.print("Enter " + (i + 1) + " Element : ");
				arr[i] = sc.next();
			}

			// Left Rotate in array
			System.out.print("\nHow many times do you want to rotate :- ");
			int rotate = sc.nextInt();
			for (int i = 0; i < rotate; i++) {

				String temp = arr[0];
				int j = 0;

				for (j = 0; j < arr.length - 1; j++) {
					arr[j] = arr[j + 1];
				}
				arr[j] = temp;

			}

			System.out.println("\nArray After left rotate");
			// print the array after left rotate
			for (int i = 0; i < arr.length; i++) {
				System.out.print(arr[i] + " ");
			}
		} catch (InputMismatchException e) {
			System.out.println("invalid input..!only accept integer value");
		}
	}
}
