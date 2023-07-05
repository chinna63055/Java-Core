package com.inheritance.pack;

class Parent
{
	int a=50;
}
 class  parent1 extends Parent
{
	static int b=12;
	public void m1()
	{
		System.out.println("This is the child class "+b);
	}
}
 class child extends parent1
 {
	 public void m2()
	 {
		 System.out.println("This is child class");
	 }
 }
 
public class MultiLevel {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		
		child c1 =new child();
		
		c1.m1();
		System.out.println(c1.a);
		c1.m1();
		c1.m2();
		
		
	}

}
