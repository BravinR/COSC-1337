/*Bravin Rutto
 * COSC 1337 001
 * 11/1/2021
 * Purpose: To encapsulate the idea of a music store (Lab10L2)
 */
package typesOfStores;

/**Encapsulates a Music Store. Extends Store.
 * @author Bravin
 *
 */
public class MusicStore extends Store {
	/**The name of the visiting artist. "" represents no artist*/
	private String visitingArtist = "";

	
	/**Creates a new Music Store with the input parameters
	 * 
	 * @param name the name of the store
	 * @param address the address of the store
	 * @param visitingArtist the name of the visiting artist
	 */
	public MusicStore(String name, String address, String visingArtist) {
		super(name, address);
		setVisitingArtist(visitingArtist);
	}
	

	/**Gets the artist currently visiting the store
	 * @return the visitingArtist
	 */
	public String getVisitingArtist() {
		return visitingArtist;
	}

	/**Sets the artist currently visiting the store
	 * @param visitingArtist the visitingArtist to set
	 */
	public void setVisitingArtist(String visitingArtist) {
		this.visitingArtist = visitingArtist;
	}
	
	/**returns a user-friendly String version of the Music Store
	 * 
	 * @return the String
	 */
	//returns the super string followed by a new line and tab,
	//then "Visiting Artist: " followed by the visiting artist
	@Override
	public String toString() {
		return super.toString()+"\n\tVising Artist: "+ getVisitingArtist();
	}

}
