package skillbuilders;

public class Gradebook 
{
    public static void main(String[] args) 
	{
	    //Client creates objects
    	Student ayub = new Student("Ayub Handule", 3.2);
    	Student ali = new Student("Mohomed Ali", 3.3);
    	Student amy = new Student("Amy Li", 3.4);
    	Student jasmine = new Student("Jasmin Jordan", 3.5);
	
    	 ayub.updateGPA(4.0);
    	
	    System.out.println(ayub); //Automatically calls toString()
	    System.out.println(ali);
	    System.out.println(amy);
	    System.out.println(jasmine);
	    
	   
	}

}
