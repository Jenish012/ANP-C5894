//1.Write a Java program that takes a year as input and checks if it is a leap year. If the year is divisible by 4, check if it is also divisible by 100. If it is divisible by 100, check if it is also divisible by 400. Print "Leap Year" if it satisfies all the conditions, and "Not a Leap Year" otherwise.
package Loops;

import java.util.Scanner;

public class NestedIf 
{

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a year");
		int y=sc.nextInt();
		
		//Condition
		if(y%4==0)
		{
			System.out.println("It is Leap Year");
		}
		
		else if(y%100==0)
		{
			System.out.println("It is a leap year");
		}
		else if(y%400==0)
		{
			System.out.println("It is a a leap year");
		}
		else
		{
			System.out.println("It is not a Leap year");
		}
		sc.close();
	}
}
