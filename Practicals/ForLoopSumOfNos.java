package Loops;
//Sum of the digits given the user using for Loop
import java.util.Scanner;

class ForLoopSumOfNos
{
	public static void main(String []agrs)
	{
		//Creating object of Scanner Class
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the no. of digits: ");
		//integer input
		int digits=sc.nextInt();
		
		int sum=0;
		for (int i=1; i<=digits; i++)
		{
			System.out.println("Enter the #"+i+": ");
			int values=sc.nextInt();
			sum+=values;
		}
		System.out.println("The sum of the "+digits+" digits is "+sum);
		sc.close();
		
	}
}
