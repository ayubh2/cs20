/*

Program: AddCoins.java          Last Date of this Revision: April 8, 2026

Purpose: An application that asks the users to input the number of pennies, nickels, dimes and quarters 
         and then displays the total dollar amount.

Author: Ayub Handule 
School: CHHS
Course: Computer Science 20
 

*/

package mastery;

import java.util.Scanner;

public class AddCoins {

	
	// gets the quarters, asks the user for how many and assigns it a value of $0.25
	
 	public static double getQuarters(Scanner input) 
 	    {
        System.out.print("Enter the number of quarters: ");
        int count = input.nextInt();
        return count * 0.25;
 	    }
		
 	
 	
	// gets the dimes, asks the user for how many and assigns it a value of $0.10

 	public static double getDimes(Scanner input) 
	    {
         System.out.print("Enter the number of dimes: ");
         int count = input.nextInt();
         return count * 0.10;
	    }
		
 	
	// gets the nickels, asks the user for how many and assigns it a value of $0.05

 	public static double getNickels(Scanner input) 
       {
        System.out.print("Enter the number of nickels: ");
        int count = input.nextInt();
        return count * 0.05;
       }
 	
 	
	// gets the pennies, asks the user for how many and assigns it a value of $0.01

 	public static double getPennies(Scanner input) 
    {
     System.out.print("Enter the number of pennies: ");
     int count = input.nextInt();
     return count * 0.01;
    }
		
 	// sums it up and then prints the total so the user can see
 	
 	public static void main(String[] args) 
		{
			Scanner input = new Scanner(System.in);
	
			 double totalAmount = getPennies(input) + getNickels(input) + getDimes(input) + getQuarters(input);
		     System.out.println("Total: $" + totalAmount);
		
			input.close();
		}
		
	}



/* Screen Dump

Enter the number of pennies: 10
Enter the number of nickels: 10
Enter the number of dimes: 10
Enter the number of quarters: 10
Total: $4.1
 
 */