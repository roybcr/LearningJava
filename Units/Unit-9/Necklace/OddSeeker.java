
public class OddSeeker extends Thread {
    private byte _funcToTest;

    public OddSeeker() {
        this((byte) 0);
    }

    public OddSeeker(byte funcToTest) {
        _funcToTest = funcToTest;
    }

    public static int odd(int n) {
        if (n < 10)
            return n % 2 == 0 ? 0 : 1;
        return odd(n % 10) + odd(n / 10);
    }

    public static int betterOdd(int n) {
        if (n < 10)
            return n % 2; // 1 IF ODD, 0 IF EVEN.
        return (n % 10 % 2) + odd(n / 10);
    }

    @Override
    public void run() {

        if (_funcToTest == 0) {
            for (int i = 0; i < 50; i++) {
                long start = System.nanoTime();
                System.out.println("BetterOdd: Startin interation no." + i);
                betterOdd(99999999);
                betterOdd(37481235);
                betterOdd(38542950);
                betterOdd(22043480);
                betterOdd(122221);
                betterOdd(243763);
                betterOdd(14354);
                betterOdd(1000);
                betterOdd(9759);
                betterOdd(4353);
                betterOdd(1235);
                betterOdd(8763);
                betterOdd(123);
                long end = System.nanoTime();
                System.out.println("#" + i + " Benchmarking Better:" + (end - start) + " nanoseconds.");
            }
        } else {
            for (int i = 0; i < 50; i++) {
                long start = System.nanoTime();
                System.out.println("Odd: Startin interation no." + i);
                odd(99999999);
                odd(37481235);
                odd(38542950);
                odd(22043480);
                odd(122221);
                odd(243763);
                odd(14354);
                odd(1000);
                odd(9759);
                odd(4353);
                odd(1235);
                odd(8763);
                odd(123);
                long end = System.nanoTime();
                System.out.println("#" + i + " Benchmarking odd:" + (end - start) + " nanoseconds.");
            }
        }

    }

}