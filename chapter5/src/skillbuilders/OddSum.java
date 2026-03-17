package skillbuilders;

import java.util.Scanner;

public class OddSum {

	public static void main(String[] args) 
	{
	
		    Scanner scanner = new Scanner(System.in);
		
			int max = 0;
			int sum = 0;
			int step = 2;
			
			System.out.println("Enter the max value: ");
			max = scanner.nextInt();
			
			for(int i = 1; i <= max; i += 2)
			{
				sum = sum + i;
			}
			System.out.println("Sum = "+ sum);
			


		}
	

}
