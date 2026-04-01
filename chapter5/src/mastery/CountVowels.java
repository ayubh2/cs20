package mastery;

import java.util.Scanner;

public class CountVowels {

	public static void main(String[] args) 
	{
		Scanner scanner = new Scanner(System.in);
		
		String text;
		int vowels = 0;
		
		System.out.println("Enter text: ");
	    text = scanner.next();
		
	    for(int i = 1; i <= vowels; i += 2)
		{
			vowels = vowels + i;
		}
		System.out.println("The number of vowels in "+ text + " is " + vowels);

	}

}
