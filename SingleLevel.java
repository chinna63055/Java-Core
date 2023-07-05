package com.inheritance.pack;

class Ayat
{
	String name="Ayat";
	int age=21;
	String college="ANM College";
	
	public void Ayat()
	{
		System.out.println("NAME :"+name+"\nAGE  :"+age+"\nCOLLEGE :"+college);
	}
}
class Lokesh extends Ayat
{
	String name="Lokesh";
	int age=21;
	String college="C.R.REDDY DEGREE COLLEGE";
	
	public void Lokesh()
	{
		System.out.println("NAME :"+name+"\nAGE  :"+age+"\nCOLLEGE :"+college);
	}
	
}

public class SingleLevel extends Lokesh {

	public static void main(String[] args) {
		
		Lokesh l = new Lokesh();
		
//		System.out.println(name);
		l.Lokesh();
		l.Ayat();
	}

}
