/* Name: Jordania Donaldson
 * Program: FlightTest.java
 * Spec: Design and implement a class called Flight that represent an airline flight.
 *       It should contain instance data that represents the airline name, the flight
 *       number, and the flight’s origin and destination cities. Define the flight c
 *       onstructor to accept and initialize all instance data. Include a getter and 
 *       setter methods for all instance data. Include a toString method that returns
 *       a one-line description of the flight. Create a driver class that called FlightTest
 *        whose main method instantiates and updates several flight objects.
 * 
*/

public class Flight 
{
  private String AirlineName;
  private String OriginCity;
  private String DestinationCity;
  private int FlightNumber;
  
//Constructor
  public Flight(String name, String Origin, String Destination, int flightNumber)
  {
	AirlineName=name;
	OriginCity=Origin;
	DestinationCity=Destination;
	FlightNumber=flightNumber;
  }

//getAirlineName method
  public String getAirlineName ()
  {
	return AirlineName;  
  }

//getOriginCity method
  public String getOriginCity ()
  {
	return OriginCity;
  }
  
//getDestinationCity method
  public String getDestinationCity ()
  {
    return DestinationCity;
  }

//getFlightNumber method
  public int getFlightNumber ()
  {
    return FlightNumber;
  }
  
//setAirlineName method
  public String setAirlineName (String newName)
  {
	AirlineName=newName;
	return AirlineName;
  }
//setOriginCity
  public String setOriginCity (String newCity)
  {
	OriginCity=newCity;
	return OriginCity;
  }
  
//setDestinationCity method  
  public String setDestinationCity (String newCity)
  {
    DestinationCity=newCity;
    return DestinationCity;
  }
  
//setFlightNumber method
  public int setFlightNumber (int newFlight)
  {
	FlightNumber=newFlight;
	return FlightNumber;
  }
 
//toString method
  public String toString()
  {
	String description;
	description="Airline: "+AirlineName+", Flight number: "+FlightNumber+" from "+OriginCity+" to "+DestinationCity;
	return description;
  }
}


