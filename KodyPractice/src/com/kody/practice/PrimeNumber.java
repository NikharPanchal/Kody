package com.kody.practice;
/**
 * @developer Nikhar Panchal
 */
public class PrimeNumber {

	public static void main(String[] args) {
		String ans = "";
		System.out.println("Prime number between 1 to 100");
		for (int j = 1; j <= 100; j++) {
			int flag = 0;
			for (int i = 1; i <= j; i++)
			{
				if(j%i==0)
				{
					flag+=1;
				}			
			}
			//if number divide by 1 and own number
			if(flag==2)
			{
				ans=ans+j+" ";
			}
		}
		System.out.println("Prime number are: "+ans);
	}
}
