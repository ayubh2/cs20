package skillbuilders;

public class Evens 
{

	public static void main(String[] args) 
	{
		final int maxValue = 20;
		
		int latestValue = 0;
		
		System.out.println("Even numbers that are between 1-20");
		
		while( latestValue < maxValue)
		{
			latestValue += 2;
			
			System.out.println(latestValue);		}

	}

}