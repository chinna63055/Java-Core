package com.overloading.pack;

class Prime
{
	 static int length;
	 static int breath;
	
	public void Prime()
	{
		length=4;
		breath=4;
	}
	public void Prime(int num)
	{
		length=num;
		breath=num;
	}
	public void PrimeDisplay()
	{
		int area=length*breath;
		System.out.println("The area of Rectangle :"+area);
	}
}

public class Avinash {

	public static void main(String[] args) {
		Prime Rectangle = new Prime();
		Rectangle.Prime();
		Rectangle.PrimeDisplay();
	}

}
