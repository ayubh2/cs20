package skillbuilders;

import java.util.Scanner;

public class Delivery {

	public static void main(String[] args) 
	{
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Enter the length of the package: ");
		int length = scanner.nextInt();
		
		System.out.println("Enter the width of the package: ");
		int width = scanner.nextInt();
		
		System.out.println("Enter the height of the package: ");
		int height = scanner.nextInt();
		
		int value;
		value = length + height + width;
		
		int failed;
		
	if (length <= 10) {
			
			int lengthValid;
			
			System.out.println("passed");
		}
	else System.out.println("failed");
	

	if (width <= 10) {
		
		int widthValid;
		
		System.out.println("passed");
	}
else System.out.println("failed");


if (height <= 10) {
		
		int heigthValid;
		
		System.out.println("passed");
	}
else System.out.println("failed");

if (value <= 30) {
		
		int valueValid;
		
		System.out.println("THIS PACKAGE IS ALLOWED FOR DELIVERY!");
	}
else System.out.println("THIS PACKAGE IS NOT ALLOWED FOR DELIVERY!");
}}
