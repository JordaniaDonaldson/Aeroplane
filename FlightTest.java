/*
 * Name: Jordania Donaldson
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
import java.util.Scanner;
public class FlightTest 
{
 public static void main (String [] args)
 {
  int selection;
  Scanner scan = new Scanner(System.in);
 //All modifications will be made to this object.
  Flight example = new Flight("JetBlue","Baltimore","New York",5862);
  char ans;

  
  System.out.println("This program allows the user to creates and modifies flight objects");
  System.out.println();
  
  do
 {
 
  System.out.println("Please select one of the following by selecting the corresponding number:\n"+
		  	"1. Create a new Flight\n2. Change airline name\n3. Change flight number\n"+
		    "4. Change Origin City\n5. Change Destination City\n6. Request Flight information");
  selection=scan.nextInt();
  
  
  switch (selection)
  {
  case 1:
  {
	  System.out.println("Please enter the folowing in the order requested seperated by a space: " +
	  		"the airline name, origin city, destination city and flight number.");
	  String airline=scan.next();
	  String origin=scan.next();
	  String destination=scan.next();
	  int flightNum=scan.nextInt();
	   example = new Flight(airline,origin,destination,flightNum);
	  System.out.print(example.toString());
	  
// While this program allows for creation of multiple objects it overrides previous
//	  objects to avoid using up memory
	  
  }
  break;
  case 2:
  {
	  System.out.println("Enter new flight name: ");
	  String newName=scan.next();
	  example.setAirlineName(newName);
	  System.out.println("New Flight name: "+example.getAirlineName());
  }
  break;
  case 3:
  {
	  System.out.println("Enter new Flight number: ");
	  int newFlightNumber=scan.nextInt();
	  example.setFlightNumber(newFlightNumber);
	  System.out.println("New Flight number: "+example.getFlightNumber());
  }
  break;
  case 4:
  {
	  System.out.println("Enter new origin city: ");
	  String newOriginCity=scan.next();
	  example.setOriginCity(newOriginCity);
	  System.out.println("New origin city is: "+example.getOriginCity());
  }
  case 5:
  {
	  System.out.println("Enter new destination city: ");
	  String newDestinationCity=scan.next();
	  example.setDestinationCity(newDestinationCity);
	  System.out.println("New destination city is: "+example.getOriginCity());
  }
  break;
  case 6:
  {
	 System.out.println(example.toString());
  }
  break;
  default:
	  System.out.println("Invalid selection. Please try again");
  }
  System.out.println();
  System.out.println("Do you wish to make another selection? Enter 'y' or 'n'");
  ans=scan.next().charAt(0);
  
 }
//Allows the user to create and modifiy flight objects for as long as they wish  
  while (ans=='y'||ans=='Y');
  System.out.println("This program has ended thank you for your participation");
}
}