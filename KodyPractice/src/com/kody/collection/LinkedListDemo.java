package com.kody.collection;

import java.util.LinkedList;

/**
 * @objective 
 * @Developer Nikhar
 * @Date 23-Jun-2022
*/
public class LinkedListDemo{
	
	public static void main(String[] args) {
		
	LinkedList<Integer> linkedlist=new LinkedList<Integer>();
	linkedlist.add(10);
	linkedlist.add(20);
	linkedlist.add(30);
	linkedlist.add(30);
	
	linkedlist.forEach((n) -> System.out.print(n));
	
	}
}