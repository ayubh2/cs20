package skillbuilders;

import java.util.Random;
import java.util.Scanner;

public class Guessinggame {

	public static void main(String[] args) 
	{
		Scanner input = new Scanner(System.in); 
		
		Random random = new Random();
		
		//game setup
		int secretNumber = random.nextInt(30) + 1;
		
		//output
		System.out.println("Guess the number (1-30):");
        System.out.println("Your Guess: ");
        
		//input
		int guess = input.nextInt();
	}

}
