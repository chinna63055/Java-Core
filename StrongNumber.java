package com.p.pack;

import java.util.Scanner;

class Factorial
{
	public int Fact(int num)
	{
		int fact=1;
		for(int i=1;i<=num;i++)fact=fact*i;
		return fact;
		
	}
}
class Strong
{
	public int Strong(int num)
	{
		Factorial f1 = new Factorial();
		
		int sum=0;
		while(num>0)
		{
			int rem=num%10;
			sum=sum+f1.Fact(rem);
			num/=10;
		}return sum;
	}
}
public class StrongNumber {

	public static void main(String[] args) {
		Scanner src=new Scanner(System.in);
		System.out.println("Enter the number :");
		int num=src.nextInt();
		
		Strong s = new Strong();
		
		if(num>0)
		{
			int res=s.Strong(num);
			if(num==res)
				System.out.println("Iam Strong");
			else System.out.println("Iam Not Strong");
				
		}
		else System.out.println("NO Negatives Allowed");
			
		

	}

}
