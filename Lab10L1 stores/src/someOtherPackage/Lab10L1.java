/*Bravin Rutto
 * COSC 1337 001
 * 10/29/2021
 * Purpose: To test Store and its subclasses (Lab10L1)
 */

package someOtherPackage;

import typesOfStores.MusicStore;
import typesOfStores.Store;
import typesOfStores.WebStore;
/**Tests Store and its subclasses
 * @author BRutto
 *
 */
public class Lab10L1 {

	/**The entry point for the program. Tests store and its subclasses
	 * @param args NOT USED
	 */
	public static void main(String[] args) {
		// Create some shops
		Store myShop = new Store("Daves Awesome Store", "1111 Main St. Tyler, TX 75701");
		MusicStore myMusicShop = new MusicStore("Daves Awesome Music Emporium","1212 Main St. Tyler, TX 75701", "Metallica");
		WebStore myWebStore = new Webstore("Dves Web Store", "11313 Main St. Waynesbore, VA 22980", "www.davestore.com", "Java");
		
		//add some inventory to the shops
		myShop.addToInventory("Rocks");
		myShop.addToInventory("Blocks");
		myMusicShop.addToInventory("Guitars");
		myWebStore.addToInventory("Black Lotus");

		//print out the shops
		System.out.println(myShop);
		System.out.println(myMusicShop);
		System.out.println(myWebStore);
	}

}
