package com.kody.oractice.statickeyword;

import java.io.IOException;


/**
 * @objective 
 * @Developer Nikhar
 * @Date 03-Jun-2022
*/
public class StaticDemo {

	public static void main(String[] args) {
			 byte b = 42;
			 char c = 'a';
			 short s = 1024;
			 int i = 50000;
			 float f = 5.67f;
			 double d = .1234;
			 double result = (f * b) + (i / c) - (d * s);
			 System.out.println((f * b) + " + " + (i / c) + " - " + (d * s));
			 System.out.println("result = " + result);
			 }
}