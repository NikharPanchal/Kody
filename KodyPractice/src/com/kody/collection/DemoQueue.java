package com.kody.collection;

import java.util.PriorityQueue;
import java.util.Queue;

/**
 * @objective This is a demo of collection
 * @Developer Nikhar
 * @Date 17-Jun-2022
 */

public class DemoQueue {

	public static void main(String[] args) {

		Queue<String> queue=new PriorityQueue<String>();
		queue.add("Nikhar");
		queue.add("Panchal");
		queue.add("Divyesh");
		queue.add("Ankur");
		queue.add("Mistry");
		
		System.out.println(queue);
		System.out.println("Queue print");
		
		for (String string : queue) {
			System.out.println(string);
		}
	
		System.out.println("Sequence Order....");
		while (queue.peek() != null) {
		    System.out.println(queue.poll());
		}
	}
}