
/**
 * Implementation of Fibonacci using loops exclusively
 *
 * @author Roy Bachar
 * @version 0.0.1
 */
public class Fibonnaci {

    public static void fibonacci() {

    }

    public static boolean isEven(int num) {
        return num % 2 == 0;
    }

    public static boolean isDivisibleByThree(int num) {
        return num % 3 == 0;
    }

    public static boolean isDivisibleByFour(int num) {
        return num % 4 == 0;
    }

    public static boolean isLastDigitFiveOrZero(int num) {
        return num > 9 ? ((num / 10 % 10 == 0) || (num / 10 % 10 == 5)) : num == 5;
    }

    public static boolean isPrime(int num) {
        if (!isEven(num) && !isDivisibleByThree(num) && !isDivisibleByFour(num) && !isLastDigitFiveOrZero(num)) {
            return true;
        } else {
            return false;
        }
    }

    public static void main(String[] args) {
        for (int i = 1; i <= 100; i++) {
            System.out.println(i + " is " + (isPrime(i) ? " prime number" : " not prime number"));
        }
    }

}
