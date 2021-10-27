
import java.util.Scanner;

public class Coins {
 public static void main(String[] args) {
  final byte TEN_COIN = 10, FIVE_COIN = 5, ONE_COIN = 1;
  int amount;
  Scanner scan = new Scanner(System.in);

  amount = scan.nextInt();
  scan.close();

  int amountLeft = amount;

  int tenAmount = amount / TEN_COIN;
  amountLeft -= tenAmount * TEN_COIN;

  int fiveAmount = amountLeft / FIVE_COIN;
  amountLeft -= fiveAmount * FIVE_COIN;

  int oneAmount = amountLeft / ONE_COIN;

  System.out.println("We need " + (tenAmount) + " coins of " + TEN_COIN 
  + " usd" + "\n\r" + "We need " + fiveAmount + " coins of " + FIVE_COIN 
  + " usd" + "\n\r" + "We need " + oneAmount + " coins of " + ONE_COIN 
  + " usd");

 }
}
