//Write a Java program that takes an integer as input and checks if it is divisible by 5 and 11. Print "Divisible" if it is divisible by both, and "Not Divisible" otherwise.
package Loops;

import java.util.Scanner;

public class IfElseEg2 
{

	public static void main(String[] args) 
	{
		// Scanner Class object
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter any number: ");
		int a=sc.nextInt();
		
		if(a%11==0 && a%5==0)
		{
			System.out.println("It is divisible by 5 and 11");
		}
		else
			System.out.println("It is not divisble by 5 and 11");
		sc.close();
		
	}

}
