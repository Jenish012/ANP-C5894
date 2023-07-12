package Loops;

import java.util.Scanner;

//Write a Java program that takes an integer as input and checks if it is positive or negative. Print "Positive" if the number is greater than 0, and "Negative" if it is less than 0.
public class IfElseEg1 
{
	public static void main(String[] agrs)
	{
		//Creating object of Scanner class
		//Keep mouse in Scanner CTRl Shift O
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter any Integer: ");
		int i =sc.nextInt();
		
		//condition
		if(i>=0 )
		{
			System.out.println("You entered a positive number");
		}
		else
		{
			System.out.println("You entered a negative number");
		}
		sc.close();	
	}
}


//Nested If 

//1.Write a Java program that takes a year as input and checks if it is a leap year. If the year is divisible by 4, check if it is also divisible by 100. If it is divisible by 100, check if it is also divisible by 400. Print "Leap Year" if it satisfies all the conditions, and "Not a Leap Year" otherwise.

//2.Write a Java program that takes an integer as input and checks if it is divisible by 2, 3, or both. Print "Divisible by 2" if it is divisible by 2, "Divisible by 3" if it is divisible by 3, and "Divisible by both 2 and 3" if it is divisible by both.