/* Bravin Rutto
 * COSC 1337 001
 * 10/6/2021
 * Purpose: The test class for 7L2 - creates Airplanes and Cars until the user exits, prints them out using
 * their toStrings and compares them using the == and their .equals methods (Lab7L2)
 */
package workingWithInheritedMethods;

import java.util.Scanner;

import automobile.Airplane;
import automobile.Car;

public class Lab7L2 {

	public static void main(String arg[]) {

		// create a new scanner and initialize switchCondition, oldPlane, and oldCar.
		Scanner in = new Scanner(System.in);
		char switchCondition = 'A';
		Airplane oldPlane = new Airplane("Cesna 172", 110, 7);
		Car oldCar = new Car("KIA Forte", 2000, 65);

		// create a while loop that continues while switchCondition is not x or X

		while (switchCondition != 'x' && switchCondition != 'X') {
			// prompt and read in which type of automobile they wish to add
			System.out.print("Add an (A)irplane, (C)ar, or e(X)it: ");
			switchCondition = in.next().charAt(0);
			// throw away any extra whitespace
			in.nextLine();
			// if you are not exiting
			if (switchCondition != 'x' && switchCondition != 'X') {
				switch (switchCondition) {
					case 'A':
					case 'a':
						// input data for an Airplane
						System.out.print("Enter the model name: ");
						String model = in.nextLine();
						System.out.print("Enter the number of miles: ");
						int miles = in.nextInt();
						System.out.print("Enter the amount of fuel used: ");
						double fuelUsed = in.nextDouble();

						// create and output the Airplane
						Airplane newPlane = new Airplane(model, miles, fuelUsed);
						System.out.println(newPlane);

						// Compare this plane to the old plane
						if (oldPlane == newPlane)
							System.out.println("The planes are the same object.");
						else
							System.out.println("The planes are not the same object.");
						if (oldPlane.equals(newPlane))
							System.out.println("The planes have the same data.");
						else
							System.out.println("The planes do not have the same data.");

						// store the newPlane as oldPlane and break
						oldPlane = newPlane;
						break;
					case 'C':
					case 'c':
						// input data for an Car
						System.out.print("Enter the model name: ");
						model = in.nextLine();
						System.out.print("Enter the number of miles: ");
						miles = in.nextInt();
						System.out.print("Enter the amount of fuel used: ");
						fuelUsed = in.nextDouble();

						// create and output the Car
						Car newCar = new Car(model, miles, fuelUsed);
						System.out.println(newCar);

						// Compare this car to the old car
						if (oldCar == newCar)
							System.out.println("The cars are the same object.");
						else
							System.out.println("The cars are not the same object.");
						if (oldCar.equals(newCar))
							System.out.println("The cars have the same data.");
						else
							System.out.println("The cars do not have the same data.");

						// store the newCar as oldCar and break
						oldCar = newCar;
						break;
				}// end switch
				System.out.println("\n");
			} // end if !=x

		} // end while loop

		in.close();

	}

}
