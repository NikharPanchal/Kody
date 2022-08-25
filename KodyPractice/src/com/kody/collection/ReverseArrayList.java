package com.kody.collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * @objective Write a program to print reverse ArrayList
 * @Developer Nikhar
 * @Date 20-Jun-2022
 */
public class ReverseArrayList {

	private static Scanner sc;

	public static void main(String[] args)throws NegativeInputNotAllowed {
		try {
		sc = new Scanner(System.in);
		System.out.println("Enter the size : ");
		int n = sc.nextInt();
		if(n<=0)
		{
			throw new NegativeInputNotAllowed("Negative or zero is not allowed.");
		}
		System.out.println("Enter Element : ");

		ArrayList<String> arrylist = new ArrayList<String>();
		for (int i = 0; i < n; i++) {
			arrylist.add(sc.next());
		}

		Collections.reverse(arrylist);
  
		for (String i : arrylist) {
			System.out.println(i);
		}
		}catch (InputMismatchException e) {
			System.out.println("Invalid input..!");
		}
		catch (NegativeInputNotAllowed e) {
			System.out.println(e.getMessage());
		}
	}
}