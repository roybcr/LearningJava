/*
 * This program demonstrates the usage in Switch Case Statement 
 * @author (Roy Bachar)
 * @version (0.0.1)
 */

import java.util.Scanner;

public class Switch {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("This program demonstrates the usage in Switch Case Statement.");
        System.out.println("Please enter an integer of your choice");
        int num = scan.nextInt();

        scan.close();

        switch (num) {
        case 1:
        case 2:
            System.out.println(++num);
            break;
        case 3:
        case 4:
        case 5:
            System.out.println(--num);
            break;
        case 6:
            System.out.println(num * 2);
            break;
        default:
            System.out.println(num * 3);
        }
    }
}