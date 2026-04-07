package skillbuilders;
import java.util.Scanner;
public class Exponentiation {
	
	public static double calculateExponentiation(double fNumber, double sNumber) 
    {
        return Math.pow(fNumber, sNumber);
    }

    public static void main(String[] args) 
    {
    	
        Scanner scanner = new Scanner(System.in);

       
        System.out.print("Enter the First Number: ");
        double fNumber = scanner.nextDouble();

        System.out.print("Enter the Second Number: ");
        double sNumber = scanner.nextDouble();


        double result = calculateExponentiation(fNumber, sNumber);

        
        System.out.println(fNumber + " raised to the power of " + sNumber + " is: " + result);
    }

}