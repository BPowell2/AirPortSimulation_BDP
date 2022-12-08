/*
 * @author Benjamin Powell
 */

import java.util.TimerTask;
import java.util.Timer;

public class application {
    public static void main(String[] args) {
    	
    
        Timer timer = new Timer();

        TimerTask airport = new Runway();

        timer.schedule(airport, 0, 2500);
      
    }
}
