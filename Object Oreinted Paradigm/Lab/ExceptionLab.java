/* Maxwell Ugbebor
 * COSC 1337 002
 * 4/15/2020
 * Purpose: To test try-catch (Lab11)
 */
package exceptionLab;

/**
 * @author ugbeb
 *
 */
import java.util.Scanner;
import java.io.File;
import java.util.NoSuchElementException;
import java.io.FileNotFoundException;

public class ExceptionLab {
	/**
	 * @param args NOT USED	
	 */
	public static void main(String[] args) {
		
		// Open File
		try (Scanner file = new Scanner(new File("grades.txt")))
		{
			// Initialize accumulator
			int sum = 0;
			// Initialize grade counter
			int grades = 0;
			int curGrade;
			// While there is still data in the file 
			while (file.hasNextInt())
			{	
				// Read grade
				curGrade = file.nextInt();
				// Increment accumulator
				sum += curGrade;
				// Increment grade counter
				grades++;
			}
			// Avg = accumulator / grade counter
			double avg = (double) sum / grades;
			// Display Avg
			System.out.println("Average grade = " + avg);
			// Close file
			file.close();
		}
		catch (FileNotFoundException fnfe)
		{
			System.out.println("Could not find grades.txt");
		}
		catch (NoSuchElementException nsee)
		{
			nsee.printStackTrace();
		}

	}

}
