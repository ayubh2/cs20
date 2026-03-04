package skillbuilders;

import java.util.Scanner;

public class Digits {
    public static void main(String[] args) {
       
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a two digit number: ");
          
        // ask's the user for a two digit number
        
        int number = scanner.nextInt();

        if (number >= 10 && number <= 99) {
            int onesPlace = number % 10;

            int tensPlace = number / 10; 

            System.out.println("The tens place digit is: " + tensPlace);
            System.out.println("The ones place digit is: " + onesPlace);
        } else {
            System.out.println("The number is not a two digit number. Please enter a two digit number (10-99)");
        }

        scanner.close();   
    }
}

