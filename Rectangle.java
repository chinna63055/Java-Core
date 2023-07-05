package com.overloading.pack;

import java.util.Scanner;

class RectangleArea
{
	int length;
	int breath;
	public void initRect()
	{
		length=4;
		breath=8;
	}
	public void initRect(int num)
	{
		length=num;
		breath=num;
	}
	public void initRect(int length,int breath)
	{
		this.length=length;
		this.breath=breath;
	}
	public void initRect1()
	{
		Scanner src=new Scanner(System.in);
		System.out.println("Enter the length:");
		length=src.nextInt();
		System.out.println("Enter the breath:");
		breath=src.nextInt();
		display();
		area();
		add();
	}
	public void add()
	{
		int a=length+breath;
		System.out.println("The addition of 2 values is "+a);
	}
	public void display()
	{
		System.out.println("The Length is "+this.length+"\nThe Breath is "+this.breath);
	}
	public void area()
	{
		int area=this.length*this.breath;
		System.out.println("The Area of Rectangle is "+area);
	}
}

public class Rectangle {

	public static void main(String[] args) {
		RectangleArea r1 = new RectangleArea();
		r1.initRect(4);
		r1.display();
		r1.initRect1();
		
	}

}
