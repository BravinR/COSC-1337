package threeDimensional;

/** A class that encapsulates information about a Cube including the
 *length of sides, surface area, and volume.
 * @author Bravin
 *
 */
public class A {
    
	private int number;

	protected String name;

	public double price;

	public A() {

			 System.out.print("A() called ");

 }

 private void foo1() {

			 System.out.print("A version of foo1 called ");

 }

 protected int foo2() {

			 System.out.print("A version of foo2 called ");

			 return number;

 }

 public String foo3() {

			 System.out.print("A version of foo3 called ");

			 return "Hi";

 }

}