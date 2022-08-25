package com.kody.practice;

public class CountNumber {
	public int count = 0;
	public int a = 0;

	public int Read(int no) {		
		while (no > 0) {
			a = no % 10;
			count = count + 1;
			no = no / 10;
		}
		return count;
	}
}
