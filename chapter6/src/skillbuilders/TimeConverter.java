package skillbuilders;

import java.util.Scanner;

public class TimeConverter {

	
	public static void daysToHours() 
	{
	  double days, hours, minutes;
	  Scanner input = new Scanner(System.in);
          
	  System.out.print("Enter the days: ");
	  days = input.nextDouble();
	  input.close();
	  
	  hours = days * 24;
	  System.out.println(days + " days is equal to " + hours + " hours." );
	  
	  
	}
	
	public static void HoursToDays() 
	{
		double days, hours, minutes;
		  Scanner input = new Scanner(System.in);
	          
		  System.out.print("Enter the hours: ");
		  hours = input.nextDouble();
		  input.close();
		  
		  days = hours / 24;
		  System.out.println(hours + " hours is equal to " + days + " days." );
		
	}
	
	public static void HoursToMinutes() 
	{
		double days, hours, minutes;
		  Scanner input = new Scanner(System.in);
	          
		  System.out.print("Enter the hours: ");
		  hours = input.nextDouble();
		  input.close();
		  
		  minutes = hours * 60;
		  System.out.println(hours + " hours is equal to " + minutes + " minutes. " );
		
	}
	
	public static void MinutesToHours() 
	{
		double days, hours, minutes;
		  Scanner input = new Scanner(System.in);
	          
		  System.out.print("Enter the minutes: ");
		  minutes = input.nextDouble();
		  input.close();
		  
		  hours = minutes / 60;
		  System.out.println(minutes + " minutes is equal to " + hours + " hours. " );
		
	}
	
	
	public static void main(String[] args) 
	{
		int choice; 
		Scanner input = new Scanner(System.in);
		
		System.out.println("1. Days to hours conversion");
		System.out.println("2. Hours to days conversion");
		System.out.println("3. Hours to minutes conversion");
		System.out.println("4. Minutes to hours conversion");
		System.out.println("Enter your choice:  ");
		choice = input.nextInt();
		
		if (choice == 1) 
		{
	    daysToHours();
		} 
		if (choice == 2) 
		{
	    HoursToDays();
		} 
		if (choice == 3) 
		{
	    HoursToMinutes();
		} 
		if (choice == 4) 
		{
	    MinutesToHours();
		} 
		input.close();
	}
} 
