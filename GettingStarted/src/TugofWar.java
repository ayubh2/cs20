import com.phidget22.*;

public class TugofWar {
    
    
    private static int redScore = 0; 
    private static int greenScore = 0; 

    public static void main(String[] args) throws Exception {
       
        DigitalInput redButton = new DigitalInput();
        DigitalOutput redLED = new DigitalOutput();
        DigitalInput greenButton = new DigitalInput();
        DigitalOutput greenLED = new DigitalOutput();

        redButton.setHubPort(0);
        redButton.setIsHubPortDevice(true);
        redLED.setHubPort(1);
        redLED.setIsHubPortDevice(true);
        greenButton.setHubPort(5);
        greenButton.setIsHubPortDevice(true);
        greenLED.setHubPort(4);
        greenLED.setIsHubPortDevice(true);
        
        redButton.open(2000);
        redLED.open(2000);
        greenButton.open(2000);
        greenLED.open(2000);

        System.out.println("Game started! First to 10 wins!");


        while (redScore < 10 && greenScore < 10) {
            
            if (redButton.getState()) {
                redScore++;
                System.out.println("Red pressed! Score: " + redScore);
                while(redButton.getState()) { Thread.sleep(10); } 
            }
            
            if (greenButton.getState()) {
                greenScore++;
                System.out.println("Green pressed! Score: " + greenScore);
                while(greenButton.getState()) { Thread.sleep(10); }
            }
            
            Thread.sleep(10); 
        }

        System.out.println("Game Over!");
        
        DigitalOutput winnerLED;
        if (redScore >= 10) {
            System.out.println("Red Wins!");
            winnerLED = redLED;
        } else {
            System.out.println("Green Wins!");
            winnerLED = greenLED;
        }

     
        redLED.setState(true);
        greenLED.setState(true);
        Thread.sleep(500);
        redLED.setState(false);
        greenLED.setState(false);
        Thread.sleep(500);
    
  
        for (int i = 0; i < 5; i++) {
            winnerLED.setState(true);
            Thread.sleep(300);
            winnerLED.setState(false);
            Thread.sleep(300);
        }

        redButton.close();
        redLED.close();
        greenButton.close();
        greenLED.close();
    }
}
