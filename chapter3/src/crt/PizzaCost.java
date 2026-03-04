package crt;

import java.util.Scanner;

public class PizzaCost {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		
		// asks the user to enter the diameter of the pizza in inches
		
		System.out.println("Enter the diameter of the pizza in inches: ");
		int diameter = scanner.nextInt();
		
		// costs for labor, rent and materials.
		
		double labor = 0.75;
		int rent = 1;
		double materials = 0.05 * diameter * diameter;
		
		
		// calculates it all together
		
		double cost = labor + rent + materials;
		
		
		// prints the result
		
		System.out.println("The cost of making the pizza is: " + cost);
		
		
		
		
		scanner.close();
	}

}
