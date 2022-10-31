/*Bravin Rutto
* COSC 1337 001 
* 10/04/2021 
* Purpose: To encapsulate information about a Car, including the model, the 
* number of miles driven and the amount of gas used (Lab7L1) 
* Insight: The data would become inconsistent if the derived data was stored 
* instead of being derived then some of the data that it was based on could change*/

package creditCard;

import java.util.Random;
import java.util.Scanner;

public class Program2CCValidation {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        boolean validCreditCard = false;

        while (!validCreditCard){
            System.out.print("Please enter a potential credit card number: ");
            String potentialCCN = scanner.nextLine();

            //Luhn Algorithm
            int lastDigit = Integer.parseInt(potentialCCN.substring(potentialCCN.length() -1, potentialCCN.length()));
            
            //drop the last digit
            potentialCCN = potentialCCN.substring(0, potentialCCN.length() -1);
            //System.out.println(potentialCCN);

            //Reverse the numbers
            String reversedCCN = new String();
            for (int i = potentialCCN.length() - 1; i >= 0 ; i--) {
                reversedCCN = reversedCCN + potentialCCN.charAt(i);
                //System.out.println(reversedCCN);
            }
            
            //Multiply the digits in odd positions by 2 and subtract 9 to all any result higher than 9

            boolean isOddDigit = false;
            int currentDigit = 0;
            int sum = 0;
            for (int i = 0; i < reversedCCN.length(); i++) {
                currentDigit = Integer.parseInt(reversedCCN.substring(i, i + 1));
                //System.out.println(currentDigit);

                isOddDigit = !isOddDigit;
                if (isOddDigit) {
                    currentDigit = currentDigit * 2;
                    if (currentDigit > 9)
                        currentDigit = currentDigit - 9;
                    //System.out.println(currentDigit);
                }
                /* Test output string
                 * System.out.print(currentDigit);
                 * if (i >= reversedCCN.length() - 1)
                 *		System.out.println();
                 * 	else
                 *		System.out.print(" + ");
                 *	end of segment
                 */

                //adding sum to currentDigit and storing as sum
                sum = sum + currentDigit;
            }
            //System.out.println("sum: " +sum);
            
            //final validation of credit card
            if ((lastDigit + sum) % 10 == 0) 
                validCreditCard = true;
            if (validCreditCard == false)
                System.out.println("Invalid Credit Card Number. Try again.\n");
        } //End of reversing CCN string
        scanner.close(); // closing scanner
        
        //creating random PIN number generator
        Random random = new Random();
        int low = 1111;
        int high = 9999;
        int randomPin = random.nextInt(high-low) + low;
        System.out.println("Generated PIN number is: " +randomPin);
        
    }
}
