package mastery;

import java.util.Scanner;

public class Password {

	
	  // holds the password and the max attempts of 3.
	 public static void main(String[] args) {
	        String password = "Ayub";
	        int attempts = 0, maxAttempts = 3;
	        Scanner input = new Scanner(System.in);

	        // PASSWORD IS CASE SENSITIVE!
	     
	        while (attempts < maxAttempts) {
	            System.out.print("Enter password: ");
	            if (input.nextLine().equals(password)) {
	                System.out.println("Welcome!");
	                return; 
	            } else {
	                attempts++;
	                System.out.println("The password you typed is incorrect");
	            }
	        }
	        System.out.println("Access Denied");
	        input.close();
	    }
	}
 