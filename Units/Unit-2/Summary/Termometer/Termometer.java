
import java.util.Scanner;

public class Termometer {
 public static void main(String[] args) {

  final byte HOT_DAY = 30, COLD_DAY = 5;
  byte countHot = 0, countCold = 0;

  Scanner scan = new Scanner(System.in);

  System.out.println("Enter Tommorow's Temperature: ");
  int n1 = scan.nextInt();

  System.out.println("Enter The Day After Tomorrow Temperature: ");
  int n2 = scan.nextInt();

  System.out.println("Enter The Temperature in Three Days: ");
  int n3 = scan.nextInt();

  System.out.println("Enter The Temperature in Four Days: ");
  int n4 = scan.nextInt();

  scan.close();

  countHot += n1 > HOT_DAY ? 1 : 0;
  countHot += n2 > HOT_DAY ? 1 : 0;
  countHot += n3 > HOT_DAY ? 1 : 0;
  countHot += n4 > HOT_DAY ? 1 : 0;

  countCold += n1 < COLD_DAY ? 1 : 0;
  countCold += n2 < COLD_DAY ? 1 : 0;
  countCold += n3 < COLD_DAY ? 1 : 0;
  countCold += n4 < COLD_DAY ? 1 : 0;

  if ((countHot >= 1 && countHot <= 2) || (countCold == 1))
   System.out.println("Usual Weather");

  else if (countHot >= 3 || countCold >= 2)
   System.out.println("Extreme Weather");

  else
   System.out.println("Other");

 }

}
