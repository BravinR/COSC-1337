/*Bravin Rutto
 * COSC 1337 001
 * 10/29/2021
 * Purpose: To encapsulate information for a web-based store (Lab10L1)
 */
package typesOfStores;

/**Encapsulates information for a WebStore. Extends Store.<hr>.Contains both a url and a programming language.
 * @author DAlger
 */
public class WebStore extends Store {
	/**the url of the website where this store is located*/
	private String url = "";
	
	/**The programming language which this site is written in*/
	private String programmingLanguage = "";
	
	
	/**Creates a new WebStore with the input information
	 * 
	 * @param name the name of the store
	 * @param address the address of the store
	 * @param url the url of the website at which this store is located
	 * @param programmingLanguage the programming language in which this store is created
	 */
	public WebStore(String name, String address, String url, String programmingLanguage) {
		super(name, address);
		setUrl(url);setProgrammingLanguage(programmingLanguage);

	}

	/**Gets the url of the website
	 * @return the url
	 */
	public String getUrl() {
		return url;
	}

	/**Sets the url of the website
	 * @param url the url to set
	 */
	public void setUrl(String url) {
		this.url = url;
	}

	/**Gets the programming language in which this site is written
	 * @return the programmingLanguage
	 */
	public String getProgrammingLanguage() {
		return programmingLanguage;
	}

	/**Sets the programming language is which this site is written
	 * @param programmingLanguage the programmingLanguage to set
	 */
	public void setProgrammingLanguage(String programmingLanguage) {
		this.programmingLanguage = programmingLanguage;
	}
	
	/**Returns a user-friendly String version of this WebStore
	 * 
	 * @return the String
	 */
	@Override
	public String toString() {
		return super.toString()+"\n\tURL: "+getUrl()+"\n\tProgramming Language "+getProgrammingLanguage();
	}
}
