/* Bravin Rutto
 * COSC 1337 001
 * 10/31/2021
 * Purpose: To encapsulate information about a cube (Program 4)
 */

package threeDimensional;

public class B extends A {

 private char service;

	public B() {

			 super();

			 System.out.print("B() called ");

 }

 public void foo1() {

			 System.out.println("B version of foo1 called ");

 }

 protected int foo2() {

			 int n = super.foo2();

			 System.out.print("B version of foo2 called ");

			 return (n+5);

 }

 public String foo3() {

			 String temp = super.foo3();

			 System.out.print("B version of foo3 called ");

			 return (temp+" foo3");

 }

}