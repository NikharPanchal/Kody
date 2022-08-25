package com.kody.collection;

import java.util.Arrays;
import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * @objective Given an array of size N, find the smallest positive integer value
 *            that cannot be represented as sum of some elements from the array.
 *            N = 6 array[] = {1, 10, 3, 11, 6, 15} Output: 2 Explanation: 2 is
 *            the smallest integer value that cannot be represented as sum of
 *            elements from the array.
 * @Developer Nikhar
 * @Date 20-Jun-2022
 */

public class SmalletstPositiveSum {

	private static Scanner sc;

	public static void main(String[] args) throws NegativeInputNotAllowed {
		try {
			sc = new Scanner(System.in);
			System.out.println("Enter the size :- ");
			int n = sc.nextInt();
			if(n<=0)
			{
				throw new NegativeInputNotAllowed("Negative or zero not allowed..");
			}
			int arr[] = new int[n];
			for (int i = 0; i < n; i++) {
				System.out.print("Enter Element : ");
				arr[i] = sc.nextInt();
				if (arr[i] <= 0) {
					throw new NegativeInputNotAllowed("Negative or zero not allowed..");
				}
			}

			Arrays.sort(arr);

			int ans = 1;
			for (int i = 0; i < n; i++) {
				if (arr[i] <= ans) {
					ans += arr[i];
				} else {
					break;
				}
			}
			System.out.println(ans);

		} catch (InputMismatchException e) {
			System.out.println("Invalid input...!");
		} catch (NegativeInputNotAllowed e) {
			System.out.println("Negative or zero not allowed");
		}
	}

}
