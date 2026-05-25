/*

Program: RandomStats.java          Last Date of this Revision: May 25, 2026

Purpose: Generates 500 random numbers between 0 and 9 and then displays the number of occurrences of each number.

Author: Ayub Handule 
School: CHHS
Course: Computer Science 20
 

*/

package mastery;

import java.util.Random;

public class RandomStats {

	public static void main(String[] args) 
	{
		  
		Random rand = new Random();
        int[] counts = new int[10];

        // Generates the 500 random numbers between 0 and 9.
        for (int i = 0; i < 500; i++) {
            int randomNumber = rand.nextInt(10);
            counts[randomNumber]++;
        }

        // Then displays the results.
        System.out.println("Number of Ocurrences:");
        for (int i = 0; i < counts.length; i++) {
        System.out.println(i + " appeared " + counts[i] + " times");
      
	}

}}
/* Screen Dump
Number of Ocurrences:
0 appeared 52 times
1 appeared 44 times
2 appeared 43 times
3 appeared 53 times
4 appeared 52 times
5 appeared 54 times
6 appeared 48 times
7 appeared 51 times
8 appeared 44 times
9 appeared 59 times
*/