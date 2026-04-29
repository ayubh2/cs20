package mastery;

import java.util.Scanner;

public class MySavings {

	public static void main(String[] args) 
	{
		Scanner scanner = new Scanner(System.in);

		double amount = 0;
		
		System.out.println("1. Show total in bank.");
		System.out.println("2. Add a penny");
		System.out.println("3. Add a nickel");
		System.out.println("4. Add a dime");
		System.out.println("5. Add a quarter");
		System.out.println("6. Take money out of bank");
		System.out.println("Enter 0 to quit");
		System.out.println("Enter Your Choice: ");
		int input = scanner.nextInt();
		

		if (input == 1) 
		{

        System.out.println("Your total amount in bank is: $" + amount); 
        
		}
		
		if (input == 2) 
		{

        amount = amount + 0.01;
		System.out.println("Succesfully Added! Your new total amount in bank is: $" + amount); 
        
		}
		
		if (input == 3) 
		{

        amount = amount + 0.05;
		System.out.println("Succesfully Added! Your new total amount in bank is: $" + amount); 
        
		}

		if (input == 4) 
		{

        amount = amount + 0.10;
		System.out.println("Succesfully Added! Your new total amount in bank is: $" + amount); 
        
		}
	
		if (input == 5) 
		{

        amount = amount + 0.25;
		System.out.println("Succesfully Added! Your new total amount in bank is: $" + amount); 
        
		}
		
		if (input == 6) 
		{
          
	    System.out.println("How Much would you like to take out?");
	    int take = scanner.nextInt();
	    
	    if (take >= amount)
        amount = amount - take;
		System.out.println("Succesfully Taken! You took: $" + take); 
		
        
		}
	}

}
