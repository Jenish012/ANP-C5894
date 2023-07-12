package Loops;

import java.util.Scanner;

public class NestedIf1 
{
	public static void main(String[] args) 
	{
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter an integer: ");
		int number = scanner.nextInt(); 
		
		// Check if the number is divisible by 2 and/or 3
        if (number % 2 == 0 && number % 3 == 0) 
        {
        	System.out.println("Divisible by both 2 and 3");
        }
        else if (number % 2 == 0) 
        {
        	System.out.println("Divisible by 2");
        } else if (number % 3 == 0) {
        	System.out.println("Divisible by 3");
        } else 
        {
        System.out.println("Not divisible by 2 or 3");
    }
    scanner.close();
}
}