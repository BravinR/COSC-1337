/*Bravin Rutto
 * COSC 1337 001
 * 11/26/2021
 * Purpose: To test the trains and passenger classes (Program5Trains)
 */
package trainsDemo;

import java.text.NumberFormat;

/**Testing class to test both Passenger and Train*/
public class Program5Trains {

	/**entry point for the program. Tests Passenger and Train
	 * 
	 * @param args Not Used. Ignore.
	 */
	public static void main(String[] args) {
		Passenger[] passengers = new Passenger[6];
		NumberFormat percent = NumberFormat.getPercentInstance();
		 NumberFormat currency = NumberFormat.getCurrencyInstance();
		//create 5 passengers
		passengers[0] = new Passenger("David Alger",true);
		passengers[1] = new Passenger("Bob Marley", true);
		passengers[2] = new Passenger("Albert Einstein", false);
		passengers[3] = new Passenger("Harry Truman", false);
		passengers[4] = new Passenger("A whole family", true);
		passengers[5] = new Passenger("A new passenger", true);
		
		//print out these passengers
		System.out.println("Your complete list of passengers is: ");
		String testString = "";
		for (Passenger passenger:passengers) {
			testString+=passenger+"\t on board!\n";
		}
		System.out.println(testString);
		
		//create a new Train named "Zelda 550" and add your list of passengers to it, reporting the
		//size after each addition	
		Train zelda = new Train("Zelda 550");
		for (Passenger passenger:passengers)
			System.out.println(zelda.addPassenger(passenger));
		System.out.println();
		
		//create a new Train named "Link 200" and add Bob Marley and a new Passenger to it
		Train link = new Train("Link 200");
		link.addPassenger(passengers[1]);
		link.addPassenger(new Passenger("Bozo the Clown", false));
		link.addPassenger(new Passenger("Doctor Suess", false));
		//print out both Trains along with their percentage in first class
		System.out.println(zelda+"\t"+percent.format(zelda.getPercentInFirstClass())+"\n\t"+currency.format(zelda.getTrainRevenue(15.85, 7.10))+"\n");
		System.out.println(link+"\t"+percent.format(link.getPercentInFirstClass())+"\n\t"+currency.format(link.getTrainRevenue(7.82, 5))+"\n");
		
		//check for passengers
		if(zelda.isPassengerOnTrain("Bob Marley")){
			System.out.println("Bob Marley is on Zelda 550");	
		}
		else {
			System.out.println("Bob Marley is not on Zelda 550");
		}
		System.out.println("Bozo the clown is "+(link.isPassengerOnTrain("Bozo the Clown")?"":"not ")+"on Link 200");
		System.out.println("Bozo the clown is "+(zelda.isPassengerOnTrain("Bozo the Clown")?"":"not ")+"on Zelda 550");
		System.out.println("David Alger is "+(link.isPassengerOnTrain("David Alger")?"":"not ")+"on Link 200");
		System.out.println();
	}

}
