/*

Program: EvensAndOdds.java          Last Date of this Revision: May 20, 2026

Purpose: Generates 25 random integers between 0 and 99 and then displays all the evens on one line and all the odds on the next line.

Author: Ayub Handule 
School: CHHS
Course: Computer Science 20
 

*/

package mastery;

import java.util.Random; 


public class EvensAndOdds {

	    public static void main(String[] args) {
	       
	       // Generates 25 random numbers between 0-99
		    Random random = new Random();
	        int[] numbers = new int[25];

	       // makes sure the numbers are between 0 and 99
	        for (int i = 0; i < numbers.length; i++) {
	            numbers[i] = random.nextInt(100);
	        }

	       // prints the even numbers after finding them
	        System.out.print("Even Numbers: ");
	        for (int num : numbers) {
	            if (num % 2 == 0) {
	                System.out.print(num + " ");
	            }
	        }
	        System.out.println(); 

	        // prints the odd numbers after finding them
	        System.out.print("Odd Numbers: ");
	        for (int num : numbers) {
	            if (num % 2 != 0) {
	                System.out.print(num + " ");
	            }
	        }
	        System.out.println();
		
	}

}
/* Screen Dump

Even Numbers: 30 92 38 10 86 90 82 84 16 74 12 92 
Odd Numbers: 97 95 91 39 31 99 3 81 3 85 89 23 81 
 
 */