package com.inheritance.pack;

import java.util.Scanner;

class Jsp
{
	public void jsp()
	{
		String name1="Java-Development\nDeals Joyson";
		String name2="Python-Development\nDeals Santhosh";
		String name3="Mern-Development\nDeals Kishore";
	}
}
class Joyson extends Jsp
{

	String name="Joyson";
	String strenth="220";
	String time="10:30 pm";
	public void Joyson()
	{
		System.out.println("Name   :"+name+"\nStrenth :"+strenth+"\nTiming :"+time);
		
	}
}
class Santhosh extends Joyson
{
	String name="Santhosh";
	String strenth="220";
	String time="12:30 pm";
	public void Santhosh()
	{
		System.out.println("Name   :"+name+"\nStrenth :"+strenth+"\nTiming :"+time);
		
	}
	
}
class Kishore extends Santhosh
{
	String name="Kishore";
	String strenth="220";
	String time="3:30 pm";
	public void Kishore()
	{
		System.out.println("Name   :"+name+"\nStrenth :"+strenth+"\nTiming :"+time);
		
	}
}
public class Jspider {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Kishore k = new Kishore();
		
		Scanner src=new Scanner(System.in);
		System.out.println("1.Joyson\n2.Santhosh\n3.Kishore");
k.jsp();
		int num=src.nextInt();
		
		if(num==1)
		{
			k.Joyson();
		}
		if(num==2)
		{
			k.Santhosh();
		}
		if(num==3)
		{
			k.Kishore();
		}
		

	}

}
