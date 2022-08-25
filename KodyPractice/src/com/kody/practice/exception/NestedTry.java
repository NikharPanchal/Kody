package com.kody.practice.exception;

/**
 * @objective Nested try statement example
 * @Developer Nikhar
 * @Date 09-Jun-2022
 */
public class NestedTry {

	public static void main(String[] args) {
		try {
			try {
				int arr[] = new int[5];
				arr[6] = 45;
			} catch (ArrayIndexOutOfBoundsException e) {
				System.out.println("Arrayindex out of bound(inner1)");
			}
			try {
				int a = 0;
				int b = 25 / a;
				System.out.println(b);
			} catch (ArithmeticException e) {
				System.out.println("ArithmaticException(inner2)");
			}
		} catch (Exception e) {
			System.out.println("outer catch called");
		} finally {
			System.out.println("finally called");
		}
	}
}