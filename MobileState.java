package com.p.pack;

import java.util.Scanner;

class Sim1

{	String sim1;
	String sim2;
	public void Sim(String sim1,String sim2)
	{
		this.sim1=sim1;
		this.sim2=sim2;
		System.out.println(sim1+" calling is on\n"+sim2+" calling is off ");
	}
}
class Sim2

{	String sim1;
	String sim2;
	public void Sim(String sim1,String sim2)
	{
		this.sim1=sim1;
		this.sim2=sim2;
		System.out.println(sim1+" calling is off\n"+sim2+" calling is on");
	}
}

public class MobileState {

	public static void main(String[] args) {
		Sim1 s1 = new Sim1();
		Sim2 s2 = new Sim2();
		
		Scanner src=new Scanner(System.in);
		System.out.println("Make a call \n1.sim1 jio \n2.sim2 vada\nEnter :");
		
		int sim=src.nextInt();
		if(sim==1)
		{
			s1.Sim("jio","vada");
		}
		if(sim==2)
		{
			s2.Sim("jio","vada");
		}

	}

}
