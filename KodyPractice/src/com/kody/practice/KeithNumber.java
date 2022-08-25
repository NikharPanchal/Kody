package com.kody.practice;

import java.util.Scanner;
/**
 * @objective Write a program to check keith number
 * @developer Nikhar Panchal
 */
public class KeithNumber {

	private static Scanner sc;

	public static void main(String[] args) {
		sc = new Scanner(System.in);
		
		int rem = 0;
		int no = sc.nextInt();
		int temp = no;
		int[] a = new int[10];
		int sum = 0;
		
		System.out.println("Enter the number :- ");
		//store digit in reverse order
		for (int i = 2; i >= 0; i--) {
			rem = no % 10;
			a[i] = rem;
			no = no / 10;
		}
		//go until sum < temp
		while (sum < temp) {
			sum = 0;
			for (int i = 0; i <= 2; i++) {
				sum = sum + a[i];
			}
			//change index
			a[0] = a[1];
			a[1] = a[2];
			a[2] = sum;
		}
		if (sum == temp) {
			System.out.println("Given number is keith number");
		} else {
			System.out.println("Given number is not keith number");
		}
		System.out.println(sum);
		sc.close();
	}
}