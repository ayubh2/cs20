package skillbuilders;

public class Student 
{
	
	         //Instance variables
              private String fullName;
              private double gpa;
              
              //Constructor Method
              public Student(String stuName, double startingGPA)
              {
            	  fullName = stuName;
            	  gpa = startingGPA;
              }
              //Accessor Methods
              public String getFullName()
              {
            	  return fullName;
              }
              public double getGPA()
              {
            	  return gpa;
              }
              
              //Modifier methods
              public void setFullName(String nm)
              {
            	 fullName = nm;
              }
              public void setGPA(double x)
              {
            	 gpa = x;
              }
              
              public void updateGPA(double newGPA)
              {
            	  if(newGPA >= 0 && newGPA <= 4.0) 
            	  {
            		  gpa = newGPA;
            	  }
            	  else 
            	  {
            		  System.out.println("Invalid GPA - must be between 0 - 4.0");
            	  }
              }
              
              public String toString() 
              {
            	  return fullName + "(GPA: "+ gpa + ")";
              }
              
} //closes class

