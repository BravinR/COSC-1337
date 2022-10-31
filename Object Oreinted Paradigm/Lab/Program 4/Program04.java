/* Bravin Rutto
 * COSC 1337 001
 * 10/31/2021
 * Purpose: To test the surface area and volume of Sphere and Cube (Program04)
 */

package threeDimentional;

import java.util.Scanner;

/** The test class that creates a Cube and Sphere
 * and prints out the surface area and volume.
 * 
 * @author Bravin
 *
 */
public class Program04 {

	/** The entry point of the program that prompts for length of
	 * the first Cube and radius of the first Sphere.
	 * 
	 * @param args NOT USED
	 */
	public static void main(String[] args) {
	
		//creating a scanner
		Scanner scanner = new Scanner(System.in);
		
		//creating a cube 
		Cube firstCube = new Cube();
		System.out.println("First Cube: "+firstCube);
		
		//prompting user to enter length of side secondCube
		System.out.print("Please enter the length of the side for secondCube: ");
		int secondSide = scanner.nextInt();
		secondCube.setLengthOfSide(secondSide);
		
		//creating Cube with Cube class
		Cube thirdCube = new Cube(3);
		
		//creating int that will store getter value of firstCube
		int accessorValue = firstCube.getLengthOfSide();
		
		
		//outputting cube lengths area and volume and the respective cubes
		System.out.println("First Cube side length: "+accessorValue);
		System.out.println("Second Cube: "+secondCube);
		System.out.println("Second Cube surface area: "+secondCube.getSurfaceArea());
		System.out.println("Third: "+thirdCube);
		System.out.println("Third Cube volume: "+thirdCube.getVolume());
		System.out.println(" ");
		
		//creating firstSphere with Sphere class
		Sphere firstSphere = new Sphere();
		System.out.println("First Sphere:"+firstSphere);
		
		//prompting user to enter radius of firstSphere
		System.out.print("Please enter the radius of the first sphere: ");
		int secondRadius = scanner.nextInt();
		secondSphere.setRadius(secondRadius);
		
		//creating a Sphere with the Sphere class
		Sphere thirdSphere = new Sphere(3);
		
		//creating int named accessorValue storing getter value of firstCube
		int accessorSphereRadius = firstSphere.getRadius();
		
		
		//outputting cube lengths area and volume and the respective cubes
		System.out.println("First Sphere radius: "+accessorSphereRadius);
		System.out.println("Second:"+secondSphere);
		System.out.println("Second Sphere surface area: "+secondSphere.getSurfaceArea());
		System.out.println("Third:"+thirdSphere);
		System.out.println("Third Sphere volume: "+thirdSphere.getVolume());
		System.out.println(" ");

		//close scanner
		scanner.close();
	}

}
