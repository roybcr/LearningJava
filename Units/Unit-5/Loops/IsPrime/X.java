/**
 * Program that prints the Multiplication table.
 * 
 * @author Roy Bachar
 * @version 1.0
 */

public class X {
    public static void main(String[] args) {
        for (int i = 1; i < 10; i++) {
            System.out.print("\t\n");
            for (int j = 1; j < 10; j++) {
                System.out.print(i * j + "\t");
            }
        }
    }
}
