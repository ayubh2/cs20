package mastery;

import java.util.Scanner;

public class Password {

	public static void main(String[] args) 
	{
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the password: ");
		int password = scanner.nextInt();
		
		if (password == 6767) {
			System.out.println("Welcome");
			}
		if (password > 6767) {
			System.out.println("The password you typed is incorrect");
			}
		if (password < 6767) {
			System.out.println("The password you typed is incorrect");
			}
	}

}
