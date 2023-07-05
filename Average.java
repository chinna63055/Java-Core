package com.basic.pack;

import java.util.Scanner;

public class Average {

	public static void main(String[] args) {
		Scanner src=new Scanner(System.in);
		System.out.println("Enter the 3 values:");
		double a=src.nextDouble();
		double b=src.nextDouble();
		double c=src.nextDouble();
		double total=a+b+c;
		double Average=total/3;
		 System.out.println("The average value  of the given values :"+Average);

	}

}
