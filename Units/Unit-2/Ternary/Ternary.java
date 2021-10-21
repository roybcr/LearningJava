/*
* This program demonstrates the usage in the Ternary Operator 
* @author (Roy Bachar)
* @version (0.0.1)
*/

import java.util.Scanner;

public class Ternary {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Please Enter an Integer of your Choice: ");
        
        int num = scan.nextInt();
        scan.close();

        String numStatus = num < 10 ? "small" : num < 100 ? "middle" : num < 1000 ? "big" : "very big";
        System.out.println(numStatus);
    }

}
