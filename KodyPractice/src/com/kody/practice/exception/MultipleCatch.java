package com.kody.practice.exception;

/**
 * @objective Example of multiple catch block
 * @Developer Nikhar
 * @Date 10-Jun-2022
 */
public class MultipleCatch {

	public static void main(String[] args) {
		try {
			int a = 0;
			int b = 64 / a;
			int arr[] = new int[5];
			arr[6] = 45;

			System.out.println(b);

		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("Arrayindex out of bound called");
		} catch (ArithmeticException e) {
			System.out.println("Arithmatic Exception called");
		}
		System.out.println("out of catch block");
	}
}
