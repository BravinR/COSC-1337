/*Bravin Rutto
 * COSC 1337 001
 * 9/10/2021
 * Purpose:To practice working with strings and random integers (LabL32)
 * Insight: The parentheses around the two variables caused them to be added b`efore the result is appended 
 * to the String. Without the parentheses, the variables are simply appended one at a time.
 */
package initial;

import java.util.Random;

public class Program1Initials {

	public static void main(String[] args) {
				String[] strings = {"David Lee Alger", "Kate Garry Hudson", "Tina Stamatina Fey", "Hugh Mungo Grant", "Uma Karuna Thurman"};

        for (int i=0;i<strings.length;i++){
            
            String currentName = new String(strings[i]);
            int space = currentName.indexOf( ' ' );
            int lastSpace = currentName.lastIndexOf( ' ' );
            
            String firstName = currentName.substring(0, space);
            String middleName = currentName.substring(space +1, lastSpace);
            String lastName = currentName.substring(lastSpace +1 );
            
            System.out.println(firstName);
            System.out.println(middleName);
            System.out.println(lastName);

        }
		
	}

}
