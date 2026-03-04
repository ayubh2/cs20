package crt;

import java.util.Scanner;

public class digits {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);

		
            // ask's the user to input a three digit number
	        System.out.print("Enter a three digit number: ");
	          
	    
	        // The program then will find out the digit for the ones, tens and hundreds place for that number.
	        
	        int number = scanner.nextInt();

	        if (number >= 100 && number <= 999) {
	            int onesPlace = number % 10;

	            int tensPlace = (number / 10)  % 10; 
	            
	            int hundredsPlace = number / 100;
                     
	            
	            // after calculating it then finds the digit in the hundreds place, tens place and ones place.
	            
	            System.out.println("The hundreds place digit is: " + hundredsPlace);
	            System.out.println("The tens place digit is: " + tensPlace);
	            System.out.println("The ones place digit is: " + onesPlace);
	        } else {
	            System.out.println("The number is not a three digit number. Please enter a three digit number (10-999)");
	        }
	        scanner.close();
	}
	
}
