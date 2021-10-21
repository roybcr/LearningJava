/*
* This program determines whether an Integer is Positive and Even or not.
* @author (Roy Bachar)
* @version (0.0.1)
*/

import java.util.Scanner;

public class NegativeOdd {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Please Enter an Integer of your Choice: ");

        int num = scan.nextInt();
        scan.close();

        String negativeOdd = num < 0 ? "Wrong number" : num % 2 == 0 ? "Even!" : "Odd...";
        System.out.println(negativeOdd);
    }

}
