package com.kody.enumandvarcargs;

/**
 * @objective
 * @Developer Nikhar
 * @Date 21-Jun-2022
 */
public class VarArgsAmbiguity {
	
	/*static void vaTest(boolean... v) {
		System.out.print("boolean");
	}*/

	static void vaTest(byte... v) {
		System.out.print("byte");
	}
		
	/*static void vaTest(char... v) {
		System.out.print("char");
	}*/

	static void vaTest(long... v) {
		System.out.print("Long");
	}

	static void vaTest(float... v) {
		System.out.print("Float");
	}

	static void vaTest(double... v) {
		System.out.print("Double");
	}

	public static void main(String args[]) {
		vaTest();
	}
}