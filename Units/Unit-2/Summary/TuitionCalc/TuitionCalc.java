
import java.util.Scanner;

public class TuitionCalc {
  public static void main(String[] args) {
    final short BASE_TUITION = 2079, 
    BASE_TUITION_SENIOR = 1539, 
    WITH_INSTRUCTION = 301, 
    SUMMER_SEMESTER = 286,
    SECURITY_RATE = 59;
    
    final double AMOUNT_OFF_JOB = 0.1, 
    AMOUNT_OFF_COMBAT = 0.5;

    int tuition = 0;

    Scanner scanner = new Scanner(System.in);

    System.out.println("Please enter: \r\n 1 if you have 18 or more credits \r\n 2 otherwise");
    
    tuition += scanner.nextByte() == 1 ? 
    BASE_TUITION_SENIOR : 
    BASE_TUITION;

    System.out.println("Please enter: \r\n" + "1 if you're serving or have served in a combat unit, \r\n"
        + "2 if you're serving or have served in a non-combat unit,\r\n" + "3 otherwise");

    tuition -= scanner.nextByte() == 1 ? 
    (tuition * AMOUNT_OFF_COMBAT) : 
    scanner.nextByte() == 2 ? 
    (tuition * AMOUNT_OFF_JOB) : 
    0;

    System.out.println("Please enter: \r\n 1 to add guidance, \r\n 2 otherwise");
    tuition += scanner.nextByte() == 1 ? WITH_INSTRUCTION : 0;

    System.out.println("Please enter: \r\n 1 to for regular semester, \r\n 2 for summer semester");
    tuition += scanner.nextByte() == 1 ? 0 : SUMMER_SEMESTER;

    tuition += SECURITY_RATE;
    scanner.close();

    System.out.println("Your Calculated tuition is $" + tuition + " USD.");

  }
}
