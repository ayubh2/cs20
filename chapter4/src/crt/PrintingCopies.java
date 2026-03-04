package crt;

import java.util.Scanner;

public class PrintingCopies {

	public static void main(String[] args)
	{   
		
		// user enters the number of copies they need printed, the code makes sure its an integer
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the number of copies to be printed: ");
		int copies = scanner.nextInt();
          
		
		// copies between 0-99, the code shows the price and the total cost
		
		
		if (copies >= 0 && copies <= 99) {
		System.out.println("Price per copy is $0.30");
		System.out.println("Total Cost is: $" + 0.30 * copies);
		}
		
		
		// copies between 100-499, the code shows the price and the total cost

		
		if (copies >= 100 && copies <= 499) {
		System.out.println("Price per copy is $0.28");
		System.out.println("Total Cost is: $" + 0.28 * copies);
		}

		
		// copies between 500-749, the code shows the price and the total cost

		
        if (copies >= 500 && copies <= 749) {
	    System.out.println("Price per copy is $0.27");
	    System.out.println("Total Cost is: $" + 0.27 * copies);
        }

        
		// copies between 750-1000, the code shows the price and the total cost

        
        if (copies >= 750 && copies <= 1000) {
	    System.out.println("Price per copy is $0.26");
	    System.out.println("Total Cost is: $" + 0.26 * copies);
	    }
    
        
		// copies above 1000, the code shows the price and the total cost

        
        if (copies > 1000) {
	    System.out.println("Price per copy is $0.25");
	    System.out.println("Total Cost is: $" + 0.25 * copies);
        }
        else {
            System.out.println("Thanks for using the printing cost calculator by Ayub."); 
        }
	}

}
