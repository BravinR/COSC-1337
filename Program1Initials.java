/*Bravin Rutto
 * COSC 1337 001
 * 9/17/2021
 * Purpose: To practice working with class Random and String
 * Insight: The argument for Random.nextInt is an integer. 
 * Since it refers to the index of the string it has to be with the bounds of the length of the string
 * or else it will throw an error.
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
            
            System.out.println("Your first name is " + firstName+ " with a length of " + firstName.length());
            System.out.println("Your middle name is " + middleName+ " with a length of " + middleName.length());
            System.out.println("Your last name is " + lastName+ " with a length of " + lastName.length());
            System.out.println("Your initials are " + firstName.charAt(0)+middleName.charAt(0)+lastName.charAt(0)+ ". The length of your entire name is " + currentName.length());

            
            
            //index of random letters
            Random random = new Random();
            System.out.print("A random sequence of five letters in your name is: \"");
            for(int j = 0; j<5; j++){
                int randomIndex = random.nextInt(currentName.length());
                System.out.print(currentName.charAt(randomIndex));
            }
            System.out.println("\".\n\n");
            
        }
    }
}