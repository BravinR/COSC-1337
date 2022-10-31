/* Bravin Rutto
 * COSC 1337 001
 * 10/31/2021
 * Purpose: To encapsulate information about a cube (Program 04)
 */

package threeDimentional;

/** A class that encapsulates information about a Cube including the
 *length of sides, surface area, and volume.
 * @author Bravin
 *
 */
public class Cube {
	/** The length of the side's Cube*/
	private int lengthOfSide;
	
	//constructors
	/** Creates a new Cube with lengthOfSide at 1
	 * 
	 */
	public Cube() {
		lengthOfSide = 1;
	}
	
	/** Creates a new Cube with input parameters
	 * 
	 * @param lengthOfSide the length of the side of the Cube
	 */
	public Cube(int lengthOfSide) {
		setLengthOfSide(lengthOfSide);
	}

	//Getter 
	/** Returns the length of the side of the Cube
	 * 
	 * @return the length of the side of the Cube
	 */
	public int getLengthOfSide() {
		return lengthOfSide;
	}

	//Setter
	/** Sets the length of the side of the Cube
	 * 
	 * @param lengthOfSide the length of the side of the Cube to set
	 */
	public void setLengthOfSide(int lengthOfSide) {
		this.lengthOfSide = lengthOfSide;
	}

	//toString
	/** Returns a user- friendly String version of the Cube
	 * 
	 * @return the String Cube followed by the length of the side of the Cube
	 */
	public String toString() {
		return "Cube: "+lengthOfSide;
	}
	
	/** Returns the surface area of the Cube.
	 * 
	 * @return the surface area of the Cube.
	 */
	public int getSurfaceArea() {
		int surfaceArea = 6 * getLengthOfSide()*getLengthOfSide();
		return surfaceArea;
	}
	
	/** Returns the volume of the Cube.
	 * 
	 * @return the volume of the Cube.
	 */
	public int getVolume() {
		int volume = (int)Math.pow(getLengthOfSide(), 3);
		return volume;
	}
}
