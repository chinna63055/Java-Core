package com.overloading.pack;

import java.util.Scanner;

// AC Conditioner to print temperature celsius

class Air
{
	int Temp;
	public void Air()
	{
		Temp=18;
	}
	public void Air(int Temp)
	{
		this.Temp=Temp;
	}
	public void display()
	{
		System.out.println("The temperature of A/C : "+Temp+" C\n");;
	}
}

public class AirConditioner {

	public static void main(String[] args) {
		Air AC = new Air();
		AC.Air();
		AC.display();
		
		

		Scanner src=new Scanner(System.in);
		System.out.println("Enter the Temperature:");
		int Temp=src.nextInt();
		AC.Air(Temp);
		AC.display();
		
		System.out.println("Enter the Temperature:");
		Temp=src.nextInt();
		AC.Air(Temp);
		AC.display();
		
	
		System.out.println("Enter the Temperature:");
		Temp=src.nextInt();
		AC.Air(Temp);
		AC.display();
	}

}
