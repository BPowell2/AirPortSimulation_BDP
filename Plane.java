/*
 * @author Benjamin Powell
 */
public class Plane {
    private int id;
    private int milesFromAirport;
    private boolean landed;
    /**
	 * @return constructor
	 */
    public Plane(int id, int milesFromAirport) {
        this.id = id;
        this.setMilesFromAirport(milesFromAirport);
    }//end of plane

    /**
	 * @return the planes id
	 */

    public int GetId() {
        return this.id;
    }//end of get id
    
    /**
	 * @return the distance from the airport
	 */
	public int getMilesFromAirport() {
		return milesFromAirport;
	}//end of GetMilesFromAirport
	/**
	 * @param lets you set the distance from the airport
	 */
	public void setMilesFromAirport(int milesFromAirport) {
		this.milesFromAirport = milesFromAirport;
	}//end of setMilesFromAirport
}//end of plane class
