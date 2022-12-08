/*
 * @author Benjamin Powell
 */

import java.util.Random;
import java.util.TimerTask;
import java.util.TimerTask;
import java.io.IOException;
import java.util.LinkedList;
import java.util.Queue;
import java.util.PriorityQueue;

class Runway extends TimerTask {

    private int numPlanesSpawned;
    Random rand = new Random();
    Queue<Plane> InFlight = new LinkedList<Plane>();
    Queue<Plane> onRunWay = new LinkedList<Plane>();

    public void run() {
    	clear();
        int random = rand.nextInt(10);
        if (random < 3) {
            GeneratePlane();
            
            System.out.println(",");
            System.out.println(",");
            System.out.println(",");
            System.out.println(",");
            System.out.println(",");
            System.out.println(",");
            System.out.println(",");
            System.out.println(",");
           
        }//end of if
        
  
        	System.out.println("Current planes in flight currently"+InFlight);
        	System.out.println("Current Planes on the runway"+onRunWay);
        	PlaneChecker(InFlight);
        	//DistanceCheck(InFlight);
    }//end of run

    public void GeneratePlane() {
        // All planes get detected 16 miles away from airport
        Plane plane = new Plane(numPlanesSpawned, 16);
        System.out.println("a plane has spawned");
        numPlanesSpawned++;
        InFlight.add(plane);
    }//end of GenratePlane
    /**
	 * @params InFlight Queue
	 */
    public void PlaneChecker (Queue<Plane> InFlight) {
    	if (InFlight.isEmpty()){
    		System.out.println("There are No Flights");
    	}//end of id 
    	else {
    		DistanceFromAirport(InFlight);
    	}
    }//end of PlaneChecker
    /**
   	 * @params InFlight Queue
   	 */
    public void DistanceFromAirport(Queue <Plane>InFlight) {
    
    	
    	if (InFlight.element().getMilesFromAirport() ==0 ) {
    		LandPlane();
    	}//
    	else {
    		DistanceCheck(InFlight);
    	}
    }//end of DistanceFromAirport
    
    /**
   	 * @params InFlight Queue
   	 */
    public void DistanceCheck(Queue <Plane>InFlight) {
    	for (Plane plane: InFlight) {
    		plane.setMilesFromAirport(plane.getMilesFromAirport()-1);
    		System.out.print("Plane Number "+plane.GetId()+" the current distance is "+plane.getMilesFromAirport()+" ");
    	}//end of for loop
    	
    	
    }
   
    public void LandPlane() {
  
    	onRunWay.add(InFlight.poll());
    	
    }//end of LandPlane
    public static void clear()

    {
        try
        {
            if (System.getProperty("os.name").contains("Windows"))
                new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
            else
                Runtime.getRuntime().exec("clear");
        } catch (IOException | InterruptedException ex) {}
    }
}//end of RunWay class
