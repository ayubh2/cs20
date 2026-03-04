package crt;

import java.util.Scanner;

public class GradeLetter {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		
		// asks the user to input the percentage score as a number.
		
		System.out.println("Enter the pecentage as a number: ");
		
		int number = scanner.nextInt();
		
		
		// SCORE BELOW 60 (F)

		 
		
		if (number <= 60) {
			
			int fScore;
			
			System.out.println("The corresponding grade letter is: F");
		}
		
		// SCORES 61 - 69 (D)

		
		
	if (number >= 61 && number <= 69) {
			
			int dScore;
			
			System.out.println("The corresponding grade letter is: D");
		}
	
	// SCORES 70 - 79 (C)

	

	if (number >= 70 && number <= 79) {
		
		int cScore;
		
		System.out.println("The corresponding grade letter is: C");
	}
	
	
	// SCORES 80 - 89 (B)

	
	if (number >= 80 && number <= 89) {
		
		int bScore;
		
		System.out.println("The corresponding grade letter is: B");
	} 
	// SCORES 90 - 100 (A)
	
	
	
	if (number >= 90 && number <= 100) {
		
		int aScore;
		

		System.out.println("The corresponding grade letter is: A");
	}
	
	}

}
