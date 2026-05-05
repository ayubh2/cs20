/*

Program: DigitExtractor.java          Last Date of this Revision: May 5, 2026

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
		
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter an integer: ");
		int integer = scanner.nextInt();

		
		System.out.println("show (W)hole number.");
		System.out.println("show (O)nes place number.");
		System.out.println("show (T)ens place number.");
		System.out.println("show (H)undreds place number.");
		System.out.println("(Q)uit");
		System.out.println("Enter your choice: ");
		String choice = scanner.next();
		
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
		
		
		}
	}


