/*Bravin Rutto
* COSC 1337 - 001
* 11/28/2021
* Purpose: To determine the factorial of n using both recursion and iteration (Lab13L1)
*/
 package lab13L1;

 public class Lab13L1{
  public static void main(String[] args) {
    for (int i =1;i<=10;i++){
      System.out.println("Factorial of "+i+": "+ recursiveFactorial(i));
      System.out.println("Factorial of "+i+": "+ iterativeFactorial(i)+"\n\n");
    }
   }
  public static int recursiveFactorial(int n){
    if (n==0)
      return 1;
    else
      return n*recursiveFactorial(n-1);
  }
  public static int iterativeFactorial(int n){
    int total = 1;
    while (n>1){
      total*=n;
      n -=1;
    }
    return total;
  }
 }