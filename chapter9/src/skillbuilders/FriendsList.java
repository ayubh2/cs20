package skillbuilders;

public class FriendsList {

	public static void main(String[] args) 
	{
		//String[] friends = new String[5];
		
		int[] squares = new int [11];
		
		
		//To fill the array
		for(int i = 0; i < squares.length; i++)
		{
			squares[i] = i * i;
		}
		
		//To dusplay values from the array
		for(int val: squares)
		{
			System.out.println(val);
		}
		
		
		
		
		
    }

}
