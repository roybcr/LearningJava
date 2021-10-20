
/**
 * This program calculates the net salary of an employee based on his/her age.
 * @author (Roy Bachar)
 * @version (0.0.1)
 */

import java.util.Scanner;

public class NetSalary {
    public static void main(String[] args) {
        final int ADULT = 18, SENIOR = 67;
        final int BONUS = 200, HEALTH_TAX = 100;
        
        int age;
        double salary;
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter your age :");
        age = scanner.nextInt();
        
        System.out.println("Enter your salary :");
        salary = scanner.nextDouble();

        scanner.close();

        if (age >= ADULT && age <= SENIOR) {
            salary -= HEALTH_TAX;
            System.out.println("a " + HEALTH_TAX
                    + "$ Health tax was deducted from your salary. \n\r Your new salary is now: " + "$" + salary);
        } else {
            salary += BONUS;
            System.out.println(
                    "a " + BONUS + "$ Bonus was added to your salary. \n\r Your new salary is now: " + "$" + salary);
        }

    }
}
