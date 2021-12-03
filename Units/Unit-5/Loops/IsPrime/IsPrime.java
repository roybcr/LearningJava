
/**
 * Program to print all prime numbers between 2 and 1000.
 *
 * @author Roy Bachar
 * @version 1.0
 */

public class IsPrime {

     public static void main(String[] args) {

        TotalDividers.totalDividers();

          final int START = 2, END = 1000;

          for (int num = START; num <= END; num++) {
               boolean isPrime = true;
          
               for (int i = 2; i <= Math.sqrt(num) && isPrime == true; i++) {
                    if (num % i == 0) {
                         isPrime = false;
                    }
               }
          
               System.out.println(num + ": " + isPrime);
          }
     }
}
