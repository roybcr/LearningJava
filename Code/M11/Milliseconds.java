/*
 * This program reads an integer which 
 * representes Milliseconds and converts it to days
 * hours, minutes and seconds.
 * 
 * @author (Roy Bachar)
 * @version (0.0.1)
 */

import java.util.Scanner;

public class Milliseconds {
    public static void main(String[] args) {

        final byte SEC_MIN = 60, // Seconds in one minute
                MIN_HOUR = 60, // Minutes in one hour
                HOUR_DAY = 24; // Hours in one day
        Scanner scan = new Scanner(System.in);

        System.out.println("This program reads an integer which " + 
        "representes Milliseconds and converts it to days, "
                + "hours, minutes and seconds. ");

        // Getting user's input
        System.out.println("Please enter the number of Milliseconds");
        long ms = scan.nextLong();
        scan.close();
        
        // Prevent any possible reminders of less than 1000 Milliseconds.
        int unitRunner = (int) (ms / 1000);
        
        
        // In each step, get the reminder from the conversion of the current unit to the next (72 Seconds -> 12 Seconds + 1 Minute)
        byte seconds = (byte) (unitRunner % SEC_MIN);
        unitRunner /= SEC_MIN;

        byte minutes = (byte) (unitRunner % MIN_HOUR);
        // Convert the runner to the next unit and ignore reminders
        unitRunner /= MIN_HOUR;

        byte hours = (byte) (unitRunner % HOUR_DAY);
        unitRunner /= HOUR_DAY;

        int days = unitRunner;

        System.out.println(days + " Days " + hours + ":" + minutes + ":" + seconds + " hours");

    }
}