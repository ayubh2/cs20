package skillbuilders;

import java.util.Scanner;

public class PerfectSquare 
{

	public static void main(String[] args) 
	{
	    //makes sure that values that are inputted are valid
		int num, squared;
		double squareRoot;
		
		
		Scanner input = new Scanner(System.in);
		System.out.println("Enter a number: ");
		
		
		num = input.nextInt();
		
		//Takes the square root of the number entered by the user
		squareRoot = Math.sqrt(num);
		squared = (int)Math.pow((int)squareRoot, 2);
		
		//Check to see if the two numbers are equal
		if(num == squared)
		{
			System.out.println("The number is a perfect square");
		}
		else
		{
			System.out.println("The number is NOT a perfect square");
		}

	}

}