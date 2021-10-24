
/**
 * 3 digits in Triangle
 * @author Roy Bachar
 * @version 0.0.1
 */

import java.util.Scanner;

public class Tri {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        int alpha = scan.nextInt();
        int beta = scan.nextInt();
        int gamma = scan.nextInt();

        scan.close();
        System.out.println(alpha + beta + gamma == 180);
    }

}
