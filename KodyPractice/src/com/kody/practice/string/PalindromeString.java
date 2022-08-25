package com.kody.practice.string;

import java.util.Scanner;

/**
 * @objective Write a program to print PalindromeString
 * @Developer Nikhar
 * @Date 07-Jun-2022
*/
public class PalindromeString {

	private static Scanner sc;

	public static void main(String[] args) {
		sc = new Scanner(System.in);
		System.out.print("Enter the String :: ");
		String input=sc.next();
		String result=new String();
		char[] ch=input.toCharArray();
		for(int i=ch.length-1;i>=0;i--)
		{
			result+=ch[i];
		}
		if(input.equals(result))
		{
			System.out.println("Given string is palindrome");
		}
		else
		{
			System.out.println("Given string is not a palindrome");
		}
		
	}
}
