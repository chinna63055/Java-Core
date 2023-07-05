package com.basic.pack;

import java.util.Scanner;

public class RadiusCircle {
	 
	public static void circleArea(int a)
	{
		double r=a;
		 double pie=3.14159;
		double circlearea=2*pie*r*r;
		System.out.println("The area of the circle is "+circlearea+" square meters");
	}
	
	public static void main(String[] args) {
		Scanner src=new Scanner(System.in);
		System.out.println("Enter the area of radius:");
		int circle=src.nextInt();
		
		circleArea(circle);
		

	}

}
