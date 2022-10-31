/*Bravin Rutto
 * COSC 1337 001
 * 11/3/2021
 * Purpose: To test a GroceryStore, MusicStore, and WebStore classes in a polymorphic way (Lab10L2)
 * Insight:1) Because they have an "is-a" relationship with store
 * 2) It always tries to call the method from the most specific class it can find. 
 */
package someOtherStuff;

import java.util.ArrayList;
import java.util.Scanner;

import typesOfStores.GroceryStore;
import typesOfStores.MusicStore;
import typesOfStores.Store;
import typesOfStores.WebStore;

/**
 * Tests the Grocery, MusicStore, and WebStore classes in a polymorphic way.
 * 
 * @author BRutto
 */
public class Lab10L2 {

	/**
	 * The entry point for the program that runs the test
	 * 
	 * @param args NOT USED
	 */
	public static void main(String[] args) {
		ArrayList<Store> stores = new ArrayList<>();
		Scanner scanner = new Scanner(System.in);
		String switchCondition = "";
		Store tempStore = null;

		do {
			System.out.println("Would you like to add a (M)usic, (W)eb, or (G)rocery Store?" + " Or you may e(X)it: ");
			switchCondition = scanner.nextLine();
			if (!switchCondition.equals("x") && !switchCondition.equals("X")) {
				System.out.print("Please enter the name of the store: ");
				String name = scanner.nextLine();
				System.out.print("Please enter the address of the store on one line: ");
				String address = scanner.nextLine();
				switch (switchCondition) {
				case "m":
				case "M":
					System.out.print("Please enter the name of the visiting artist: ");
					String visitingArtist = scanner.nextLine();

					tempStore = new MusicStore(name, address, visitingArtist);
					break;
				case "w":
				case "W":
					System.out.print("Please enter the URL of the site: ");
					String url = scanner.nextLine();
					System.out.print("Please enter the programming language of the site: ");
					String programmingLanguage = scanner.nextLine();

					tempStore = new WebStore(name, address, url, programmingLanguage);
				case "g":
				case "G":
					System.out.print("Please enter the annual revenue for the store: ");
					Double revenue = scanner.nextDouble();
					System.out.print("Please enter \"true\" if the store is part of a chain and false otherwise: ");
					boolean isChain = scanner.nextBoolean();

					// throw away whitespace
					scanner.nextLine();

					tempStore = new GroceryStore(name, address, revenue, isChain);
					break;

				}// end switch
				stores.add(tempStore);
				for (Store store : stores)
					System.out.println(store);
			} // end if
		} while (!switchCondition.equals("x") && !switchCondition.equals("X"));

		scanner.close();

	}

}
