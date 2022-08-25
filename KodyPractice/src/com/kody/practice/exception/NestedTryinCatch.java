package com.kody.practice.exception;

/**
 * @objective This is example of Nested try catch block in catch
 * @Developer Nikhar
 * @Date 10-Jun-2022
 */
class Test {
	static void genException() {
		try {
			System.out.println("Before exception.");
			throw new ArrayIndexOutOfBoundsException("Hello");
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println(e.getMessage());
			throw new ArithmeticException("arithmetic");
		} finally {
			System.out.println("Test Finally");
		}
	}
}

public class NestedTryinCatch {

	public static void main(String[] args) {
		try {
			Test.genException();
		} catch (ArithmeticException e) {
			System.out.println("arith  Ex2" + e.getMessage());
			try {
				throw new ArrayIndexOutOfBoundsException("Example2 error");
			} catch (ArrayIndexOutOfBoundsException e1) {
				System.out.println(e1.getMessage());
			}
		}

		finally {
			System.out.println("Example2 Finally");
		}
		System.out.println("After catch stmt");
	}

}