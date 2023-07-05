package com.basic.pack;

import java.util.Scanner;

public class OddSum {

	public static void main(String[] args) {
		Scanner src=new Scanner(System.in);
		System.out.println("Enter the value:");
		int num=src.nextInt();
		
		int sum=0;
		for(int i=1;i<=num;i++)
		{
			 if(i%2!=0)
			 {
				 System.out.println(i);
				 sum=sum+i;
			 }
		}
		 System.out.println("sum "+sum);


	}

}
