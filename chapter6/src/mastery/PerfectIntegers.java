/*

Program: PerfectIntegers.java          Last Date of this Revision: April 10, 2026

Purpose: An application that displays all perfect integers up to 100.

Author: Ayub Handule 
School: CHHS
Course: Computer Science 20
 

*/

package mastery;

public class PerfectIntegers {
	
	public static boolean isPerfect(int num)
	{
		int sum = 0;
		int divisor;
		
		for(divisor = 1; divisor < num; divisor++)
		{
			if(isFactor(num, divisor))
			{
				sum = sum + divisor;
			}
		}
		if(sum == num)
			return(true);
		else
			return(false);	
		
	}
	// does the calculations
	public static boolean isFactor(int dividend, int divisor)
	{
		if(dividend % divisor == 0)
			return(true);
		else
			return(false);
	}
	

	// makes sure the number for the perfect integers counted are only up to 100 and a minumum of 1.
	public static void main(String[] args) 
	{
		for (int num = 1; num <=100; num++)
		{
			if(isPerfect(num))
			{
				System.out.println(num);
			}
		}
		
	}

}

/* Screen Dump

6
28
 
 */
