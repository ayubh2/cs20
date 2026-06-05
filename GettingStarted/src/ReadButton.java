//Add Phidgets Library 
import com.phidget22.*;

public class ReadButton {
    //Handle Exceptions 
    public static void main(String[] args) throws Exception{
        
        //Create 
        DigitalInput redButton = new DigitalInput();

        //Address 
        redButton.setHubPort(0);
        redButton.setIsHubPortDevice(true);
 
        //Open 
        redButton.open(1000);

        //Use your Phidgets 
        while(true){
        	if( redButton.getState()){
        	System.out.println("Button State: " + redButton.getState());  
        	Thread.sleep(100);
            } else {
            Thread.sleep(100);
           
        }
        }
    }}

  