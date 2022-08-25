package com.kody.practice;

/**
 * @objective
 * @Developer Nikhar
 * @Date 21-Aug-2022
 */
public class InstantBlock {
	InstantBlock() {
		/*
		 * copies the code by jvm when object is created{
		 * System.out.println("instant initilization blocked invoked.."); }
		 */
		System.out.println("Constructor called..");
	}

	{
		System.out.println("instant initilization blocked invoked..");
	}

	public static void main(String[] args) {
		InstantBlock obj = new InstantBlock();
	}
}