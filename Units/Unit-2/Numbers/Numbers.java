
import java.util.Scanner;

public class Numbers {
 public static void main(String[] args) {
  int num1, num2;
  Scanner scanner = new Scanner(System.in);

  num1 = scanner.nextInt();
  num2 = scanner.nextInt();
  scanner.close();

  System.out.println(num1 + " + " + num2 + " = " + (num1 + num2));
  System.out.println(num1 + " - " + num2 + " = " + (num1 - num2));

 }

}
