/* Bravin Rutto
 * COSC 1337 001
 * 9/22/2021
 * Purpose: To practice simple selection (Lab5L1)
 * Insight: 1) It would not change the execution of the program 
 * at all since the line after break ends the switch.
 * 2) It is wise to include the default case as the final case
 * because unlike other cases, it deals with several different inputs.
 */
package lab5L1;

import java.util.Scanner;

public class Lab5L1 {

	public static void main(String[] args) {
		// establish some variable
		String userID = "correctID";
		String password = new String("correctPassword");
		
		//get input from the user
		Scanner scanner = new Scanner(System.in);
		System.out.print("Please enter your user ID and password, separated by a new line: ");
		String userIDAttempt = scanner.next();
		String passwordAttempt = scanner.next();
		scanner.hasNextLine();
		
		//get the results of the log in
		if(userID.contentEquals(userIDAttempt)) {
			if (password.equals(passwordAttempt))
				System.out.println("Welcome!");
			else
				System.out.println("Incorrect Password :(");
		}
		else if (password.equals(passwordAttempt))
			System.out.println("Incorrect User ID :(");
		else
			System.out.println("Incorrect User ID :(AND password :)");
		
		//use a switch
		System.out.print("Please enter 1, 6, or 7:");
		switch (scanner.nextInt()) {
		case 1:
			System.out.println("You entered one.");
			break;
		case 7:
			System.out.println("You entered seven.");
			break;
		default:
			System.out.println("You entered something other than 1, 7 and 6.");
			break;
		case 6:
			System.out.println("You entered six.");
			break;
		}
		scanner.close();

	}

}
