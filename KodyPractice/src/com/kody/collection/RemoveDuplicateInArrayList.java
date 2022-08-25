package com.kody.collection;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.InputMismatchException;
import java.util.Scanner;
import java.util.Set;

/**
* @objective Write a program to Remove duplicates from ArrayList in Java?
* @Developer Nikhar
* @Date 20-Jun-2022
*/
public class RemoveDuplicateInArrayList {

	private static Scanner sc;

	public static void main(String[] args) throws NegativeInputNotAllowed {
		try {
			sc = new Scanner(System.in);
			System.out.println("Enter the size : ");
			int n = sc.nextInt();
			if (n <= 0) {
				throw new NegativeInputNotAllowed("Only accept positive");
			}
			System.out.println("Enter Element : ");

			ArrayList<String> arrylist = new ArrayList<String>();
			for (int i = 0; i < n; i++) {
				arrylist.add(sc.next());
			}
			Set<String> set = new HashSet<String>(arrylist);
			System.out.println("After remove duplicate");
			for (String s : set) {
				System.out.println(s);
			}
		} catch (InputMismatchException e) {
			System.out.println("Invalid input..!");
		} catch (NegativeInputNotAllowed e) {
			System.out.println("Negative or zero not allowed..");
		}
	}
}