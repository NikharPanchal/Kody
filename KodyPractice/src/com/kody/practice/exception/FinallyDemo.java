package com.kody.practice.exception;

/**
 * @objective This is example of Finally block
 * @Developer Nikhar
 * @Date 10-Jun-2022
 */
public class FinallyDemo {

	private static void funA() {
		try {
			System.out.println("inside function A");// 1
			throw new RuntimeException("Demo");
		} catch (RuntimeException e) {
			e.printStackTrace();
		} finally {
			System.out.println("Finally block for fun A");// 2
		}
	}

	private static void funB() {
		try {
			System.out.println("inside function B");// 4
			return;
		} finally {
			System.out.println("Finally block for fun B");// 5
		}
	}

	private static void funC() {
		try {
			System.out.println("inside function C");// 6
			return;
		} finally {
			System.out.println("Finally block for fun C");// 7
		}
	}

	public static void main(String[] args) {
		try {
			funA();
		} catch (Exception e) {
			System.out.println("Main catch");
		}
		funB();
		funC();
	}
}