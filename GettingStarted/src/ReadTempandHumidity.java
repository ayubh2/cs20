//Add Phidgets Library | You added a file called phidget22 when configuring your project. Import gives you access to the Phidgets library code inside that file. 
import com.phidget22.*;

public class ReadTempandHumidity {
    public static void main(String[] args) throws Exception{

        //Create | Here you've created a HumiditySensor and a TemperatureSensor object for your Humidity Phidget. This allows you to access both temperature and humidity data from your Phidget.
        HumiditySensor humiditySensor = new HumiditySensor();
        TemperatureSensor temperatureSensor = new TemperatureSensor();

        //Open | Open establishes a connection between your object and your physical Phidget. You provide a timeout value of 1000 to give the program 1000 milliseconds (1 second) to locate your Phidget. If your Phidget can't be found, an exception occur.
        humiditySensor.open(1000);
        temperatureSensor.open(1000);

        //Use your Phidgets | This code checks and prints data based on your specific limits every 150ms.
        while(true){
            double currentHumidity = humiditySensor.getHumidity();
            double currentTemperature = temperatureSensor.getTemperature();

          
            if (currentHumidity > 30) {
                System.out.println("Humidity: " + currentHumidity + " %RH");
            } else {
                System.out.println("Humidity is low");
            }

            
            if (currentTemperature > 21) {
                System.out.println("Temperature: " + currentTemperature + " °C");
            } else {
                System.out.println("Room is too cold");
            }

          
            Thread.sleep(150);
        }
    }
}
