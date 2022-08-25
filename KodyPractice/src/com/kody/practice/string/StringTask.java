package com.kody.practice.string;
/**
 * @objective String Practice program
 * @Developer Nikhar
 * @Date 07-Jun-2022
*/
public class StringTask {

	public static void main(String[] args) {
		/*StringBuffer sb = new StringBuffer("NikharPanchal");
		 System.out.println("buffer = " + sb);
		 System.out.println("length = " + sb.length());
		 System.out.println("capacity = " + sb.capacity());
		 String s1=String.format("Format %3.3f",12.23);
		 System.out.println(s1);*/
		String string = "Hello. How are you?";
		char str1[] = string.toCharArray();
		char str2[] = new char[21];
		int pos;

		for (pos = 0; pos < 18; pos++);
		{
			str2[pos] = str1[pos];
		}

		System.out.print(str1);
		System.out.print(str2);
	}

}
