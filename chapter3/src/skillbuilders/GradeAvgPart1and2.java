package skillbuilders;

import java.util.Scanner;

public class GradeAvgPart1and2 {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		System.out.print("Please Enter Your Math Grade: ");
		int mathGrade = input.nextInt();
		
		System.out.print("Please Enter Your Science Grade: ");
        int scienceGrade = input.nextInt();
        
        System.out.print("Please Enter Your Social Studies Grade: ");
        int socialGrade = input.nextInt();
        
        System.out.print("Please Enter Your English Grade: ");
        int englishGrade = input.nextInt();
        
        System.out.print("Please Enter Your PE Grade: ");
        int peGrade = input.nextInt();
        
        // ask's the user to enter their grades ^^
        
        
        int sum = mathGrade + scienceGrade + socialGrade + englishGrade + peGrade;
        
        
        double average = sum / 5.0;  
        
        // adds them all together and then divides, below will show the output 
       
        System.out.println("Your grade average is: " + average);
        
        input.close(); 
	}

  

}
