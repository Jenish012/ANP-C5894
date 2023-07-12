package Loops;

import java.util.Scanner;

//IfElse Example 

public class IfElse 
{

	public static void main(String[] args) 
	{	//Creating Object of Scanner Class  // Scanner class to take input from the user
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter your Age: ");
		//integer input from the user 
		int a =sc.nextInt();
		
		//Condition
		if(a>18)
		{
			System.out.println("You are eligible for voting");
		}
		else
		{
			System.out.println("You are not eligible for voting");
		}
		sc.close();	
	}

}
