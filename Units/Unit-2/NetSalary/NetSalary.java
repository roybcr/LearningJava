
/**
 * This program calculates the net salary of an employee based on his/her age.
 * @author (Roy Bachar)
 * @version (0.0.1)
 */

import java.util.Scanner;

public class NetSalary {
    public static void main(String[] args) {
        int salary, age;
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Enter your age :");
        age = scanner.nextInt();
        
        System.out.println("Enter your salary :");
        salary = scanner.nextInt();
    
        scanner.close();
        
        if(age < 67 && age > 18)
            System.out.println("a 100$ Health tax was deducted from your salary. \n\r Your new salary is now: " + (salary - 100));
        else System.out.println("a 200$ Bonus was added to your salary. \n\r Your new salary is now: " + (salary + 200));
        
        
    }
}
