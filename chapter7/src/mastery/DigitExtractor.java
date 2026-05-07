/*

Program: DigitExtractor.java          Last Date of this Revision: May 6, 2026

Purpose: An application that asks the user for an integer than the user can decide if they want to see the ones, tens, hundreds place for that integer or even the whole number.

Author: Ayub Handule 
School: CHHS
Course: Computer Science 20
 

*/


package mastery;

import java.util.Scanner;

public class DigitExtractor {

	public static void main(String[] args) 
	{
		
		// asks the user for an integer and makes sure its an integer
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter an integer: ");
		int integer = scanner.nextInt();

		// asks the user to choose one of the options below and then scanning to see what they chose
		System.out.println("show (W)hole number.");
		System.out.println("show (O)nes place number.");
		System.out.println("show (T)ens place number.");
		System.out.println("show (H)undreds place number.");
		System.out.println("(Q)uit");
		System.out.println("Enter your choice: ");
		String choice = scanner.next();
		
		// depending on their choice they will get their answer it makes sure the value is correctly inputed and calculates the result
		if (choice.equals("W"))
		{
	        System.out.println("Answer: " + integer); 

		}
		
		if (choice.equals("O"))
		{
	        System.out.println("Answer: " + integer % 10); 

		}
		
		if (choice.equals("T"))
		{
	        System.out.println("Answer: " + integer / 10 % 10); 

		}
		
		if (choice.equals("H"))
		{
	        System.out.println("Answer: " + integer / 100 % 10); 

		}
		
		scanner.close();
		}
	}


/* Screen Dump

Enter an integer: 
871
show (W)hole number.
show (O)nes place number.
show (T)ens place number.
show (H)undreds place number.
(Q)uit
Enter your choice: 
T
Answer: 7
 
 */