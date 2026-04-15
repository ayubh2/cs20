package skillbuilders;

public class TestCircle {

	public static void main(String[] args) 
	{
		//DecimalFormat dc = new DecimalFormat("0.00");
		//Create a circle object using default constructor
		Circle c1 = new Circle();
		System.out.println(c1.getRadius());
        c1.setRadius(12.9);
        System.out.println(c1.getRadius());
        
	}

}
