public class Strings {

    /**
     * Given a number (n), return how many strings of length n,
     * contain only letters between "a" -> "d".
     */

    public static int strings(int n) {
        return strings(n, "");
    }

    private static int strings(int n, String s) {
        if (n == 0)
            return 1;
        return strings(n - 1, "a") + strings(n - 1, "b") + strings(n - 1, "c") + strings(n - 1, "d");

    }
}
