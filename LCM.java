package com.basic.pack;

import java.util.Scanner;

//To print the LCM value of the given 3 value number to known about the common factor (LCM=Least Common Multipul) (LCF=Least Common Factor)
// 				//2,3,9
//					  18
//			18%2==0
//			18%3==0
//			18%9==0
//
public class LCM {
	
	public static void main(String[]args)
	{
		Scanner src=new Scanner(System.in);
		System.out.println("Enter the A value:");
		int A=src.nextInt();
		System.out.println("Enter the B value:");
		int B=src.nextInt();
		System.out.println("Enter the C value:");
		int C=src.nextInt();
		
		int num=1;
		
		while(num>0)
		{
			if(num%A==0 && num%B==0 && num%C==0 )
			{
				System.out.println("The factor of the given number is "+num);
				break;
			}
			num++;
		}
			
		
	

/*	public static void main(String[] args) {
		Scanner src=new Scanner(System.in);
		System.out.println("Enter the A value:");
		int A=src.nextInt();
		System.out.println("Enter the B value:");
		int B=src.nextInt();
		System.out.println("Enter the C value:");
		int C=src.nextInt();
		
		for(int num=1;num>0;num++)
		{
			if(num%A==0 && num%B==0 && num%C==0)
			{
				System.out.println("LCM="+num);
				break;
			}
		}*/

	}

}
