package com.kody.practice;

import java.util.Random;

/**
 * @objective
 * @Developer Nikhar
 * @Date 30-Jun-2022
 */
public class RandomExample {

	public static void main(String[] args) {
		Random rand=new Random();
	    int a=rand.nextInt(10000000);
		System.out.println(a);

		String alphabet = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";

		StringBuilder sb = new StringBuilder();


		int length = 5;

		for (int i = 0; i < length; i++) {

			int index = rand.nextInt(alphabet.length());

			char randomChar = alphabet.charAt(index);

			sb.append(randomChar);
		}

		String randomString = sb.toString() + a;
		System.out.println("Random String is: " + randomString);
	}
}
