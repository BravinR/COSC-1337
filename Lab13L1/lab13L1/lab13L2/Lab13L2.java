/*Bravin Rutto
* COSC 1337 - 001
* 11/28/2021
* Purpose: To practice 3 more recursion problems (Lab13L2)
*/
package lab13L2;

/**A class that implements 3 recursion methods (mod3, fibonacci and isDivisibleBy)
 * 
 * @author Bravin
 *
 */
public class Lab13L2 {

    /**Entry point for the program. Tests mod3, fibonacci and isDivisibleBy
	 * 
	 * @param args Not Used. Ignore.
	 */
    public static void main(String[] args) {
        
        //tests mod3
        //20mod3 is 2
        System.out.println("10mod3 is "+mod3(10));
        System.out.println("20mod3 is "+mod3(20));
        System.out.println("15mod3 is "+mod3(15));
        System.out.println("1mod3 is "+mod3(1));
        System.out.println("151mod3 is "+mod3(151));

        //tests Fibonacci method
        //Fibonacci number 7 is 13
        for (int i = 1; i<=10;i++)
            System.out.println("Fibonacci number "+i+" is "+ fibonacci(i));

        //tests the isDivisibleBy method
        //Factors of 24: 1, 2, 3, 4, 6, 8, 12,
        for (int i = 2; i<=50;i++){
            System.out.print("Factors of "+i+": ");
            for (int j = 1; j<i;j++)
                if(isDivisibleBy(i, j))
                    System.out.print(j+", ");
            System.out.println();
        }
    }
    /** Returns the reminder of a given number divided by 3
    * 
    * @param n the number to be divided by 3
    */
    public static int mod3(int n){
        if (n<3)
            return n;
        else
            return mod3(n-3);
    }

    /** Returns the fibonacci of a given number
    * 
    * @param n the number at which to determine fibonacci at that point
    */
    public static int fibonacci(int n){
        if (n==1||n==2)
            return 1;
        return fibonacci(n-1) + fibonacci(n-2);
    }

    /** Returns true of false if a given candidate is divisible by the base
    * 
    * @param candidate the number to be determined if it is divisible by the base
    * @param base the number to divide the candidate with
    */
    public static boolean isDivisibleBy(int candidate, int base){
        if (candidate < base)
            return candidate == 0;
        else
            return isDivisibleBy(candidate-base, base);
    }
  
}
