/* Bravin Rutto
 * COSC 1337 001
 * 10/18/2021
 * Purpose: To create a program that takes a number in some 
 * other number system and convert it to decimal(Program 3)
 */

package numberSystem;

import java.util.Scanner;

public class Program3NumberConversion {

	public static int parseNumber (char letter){
		switch (letter) {
			case '0':  
							return 0;
			case '1':  
							return 1;
			case '2':  
							return 2;
			case '3':  
							return 3;
			case '4':  
							return 4;
			case '5':  
							return 5;
			case '6':  
							return 6;
			case '7':  
							return 7;
			case '8':  
							return 8;
			case '9':  
							return 9;
			case 'A': 
							return 10;
			case 'a': 
							return 10;
			case 'B': 
							return 11;
			case 'b': 
							return 11;
			case 'C': 
							return 12;
			case 'c': 
							return 12;
			case 'D': 
							return 13;
			case 'd': 
							return 13;
			case 'E': 
							return 14;
			case 'e': 
							return 14;
			case 'F': 
							return 15;
			case 'f': 
							return 15;
			default: 
							return 16;
		}
	}

	public static int valueOfDigit(int place, int radix, int number){
			int result = (int) (number * (Math.pow(radix, place)));
			return result;
	}

public static void main(String[] args) {
	Scanner scanner = new Scanner(System.in);
	String response = "";

	do {
		int sum = 0;
		System.out.print("Enter a base number (0 upto 16): ");
		int radix = scanner.nextInt();
		System.out.print("Enter a number to be evaluated: ");
		String inputNumber= scanner.next();

		int k=0;
		for(int i = inputNumber.length(); i > 0; i--){
    	char currentChar= inputNumber.charAt(i-1);
			int currentDigit= parseNumber(currentChar);
			int value = valueOfDigit(k,radix, currentDigit);
			k++;
			sum +=value;
		}
		System.out.println("Your entered: " + inputNumber+" in base "+radix+" converts to "+sum+" in base 10.");
		System.out.print("Please enter 'y' to convert another number with a base 10:");
		response = scanner.next();

	}
	while (response.equalsIgnoreCase("y"));

	scanner.close();
	}
}
