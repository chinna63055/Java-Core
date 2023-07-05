package com.classes.pack;

import java.util.Scanner;

class Student
{
	int Id;
	String Name;
	
	public void initi(int a,String b)
	{
		Id=a;
		Name=b;
	}
	public void Display()
	{
		System.out.println("Hi\n"+Name+"\nYour  Id :"+Id+"\nHave Great Day Sir");
	}
}
public class Studentclass {

	public static void main(String[] args) {
		Scanner src=new Scanner(System.in);
		System.out.println("Enter YOur Name");
		String Name=src.next();
		int id=1234;
		Student n = new Student();
		n.initi(id,Name);
		n.Display();

	}

}
