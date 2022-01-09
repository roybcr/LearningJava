public class Necklace {

    /**
     * Necklace - A function for finding the amount of possibilities for
     * creating unique necklaces of (n) centimeters, made of gold beads (1cm) &
     * silver (2cm).
     */

    public static int necklace(int n) {
        if (n <= 2)
            return n;
        return necklace(n - 1) + necklace(n - 2);
    }
}
