/* Bravin Rutto
 * COSC 1337 001
 * 10/31/2021
 * Purpose: To encapsulate information about a Sphere (Program 04)
 */

package threeDimentional;

/** A class that encapsulates information about a Sphere;
 * radius, surface area, and volume.
 * @author Bravin
 *
 */
public class Sphere {
	/** The length of the radius of the Sphere*/
	private int radius;
	
	//constructors
	/** Creates a Sphere with a radius of 1.
	 * 
	 */
	public Sphere() {
		radius = 1;
	}
	
	/** Create a Sphere with input parameters
	 * 
	 * @param radius the radius of the Sphere
	 */
	public Sphere(int radius) {
		this.radius = radius;
	}

	//Getters
	/** Returns the radius of the Sphere
	 * 
	 * @return the radius of the Sphere
	 */
	public int getRadius() {
		return radius;
	}

	//Setters
	/** Sets the radius of the Sphere
	 * 
	 * @param radius the new radius of the Sphere
	 */
	public void setRadius(int radius) {
		this.radius = radius;
	}


	//toString
	/** Returns a user- friendly String version of the sphere
	 * 
	 * @return the String Sphere followed by the radius of the sphere
	 */
	public String toString() {
		return "Sphere: "+radius;
	}
	
	/** Returns the surface area of the Sphere.The formula for getting the surface area of the Sphere is 4pi * r^2.
	 * 	
	 * @return the surface area of the Sphere.
	 */
	public int getSurfaceArea() {
		int surfaceArea = (int) (4 * Math.PI * Math.pow(radius, 2));
		return surfaceArea;
	}
	

	/** Returns the volume of the Sphere. The formula for getting the volume of the Sphere is 4/3pi * r^3.
	 * 
	 * @return the volume of the Sphere.
	 */
	public int getVolume() {
		int volume = (int) ((4/3) * Math.PI * Math.pow(radius, 3));
		return volume;
	}
}
