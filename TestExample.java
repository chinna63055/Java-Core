package com.basic.pack;
class A
{
	int i;
}
public class TestExample {

	public static void main(String[] args) {
		A a;
		a=new A();
		
		System.out.println(a);
		System.out.println(a.i++);
		System.out.println(a.i);
		System.out.println(++a.i);


	}

}
