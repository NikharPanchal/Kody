package com.kody.practice;

import java.util.Scanner;
/**
 * @objective Remove same word in sentence. Take input about how many sentence  user  will enter  
	Sample Input
	Enter number of sentence  : 5
	Goodbye bye bye world world world
	Sam went went to to to his business
	Reya is is the the best player in eye eye game
	in inthe
	Hello hello Ab aB
	
	Sample Output
	Goodbye bye world
	Sam went to his business
	Reya is the best player in eye game
	in inthe
	Hello Ab
 * @developer Nikhar Panchal
 */
public class RemoveDuplicateWords {

	private static Scanner sc;

	public static void main(String[] args) {
		sc = new Scanner(System.in);
		System.out.println("How many sentence do you want :- ");
		
		int n = sc.nextInt();
		
		String[] str = new String[n + 1];
		System.out.println("Enter " + n + " sentense : ");
		
		for (int i = 0; i <= n; i++) {
			str[i] = sc.nextLine();
		}

		for (int i = 1; i <= n; i++) {
			System.out.println(+i + " index " + str[i]);
		}

		for (int i = 1; i <= n; i++) {
			// split array by space
			String[] split = str[i].split(" ");
			for (int t = 0; t < split.length; t++) {
				System.out.println(split[t]);
			}
			for (int j = 0; j < split.length; j++) {
				for (int k = j + 1; k < split.length; k++) {
					if (split[j].equalsIgnoreCase(split[k])) {
						System.out.println("Matched : " + split[j]);
						// replace % with match word
						split[j] = "%";
					} else {
						continue;
					}
				}
			}
			for (int z = 0; z < split.length; z++) {

				if (split[z].equals("%")) {
					continue;
				} else {
					System.out.print(split[z] + " ");
				}
			}
			System.out.println();
		}
		sc.close();
	}
}
