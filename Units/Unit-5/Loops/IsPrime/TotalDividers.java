
/**
 * Program that counts the total dividers of numbers from 1-1000,
 * then prints out the amount of numbers with n dividers.
 * Sample output: 
 * {32=1, 1=1, 2=168, 3=11, 4=292, 5=3, 6=110, 7=2, 8=180, 9=8, 10=22, 12=97, 14=5, 15=4, 16=48, 18=17, 20=11, 21=1, 24=16, 27=1, 28=1, 30=1}
 * 
 * Explanation:
 * Only 1 number has 32 dividers (in the range 1-1000)
 * 168 numbers have 2 dividers (these are the primes in the range 1-1000), etc.
 * 
 * @author Roy Bachar
 * @version 0.0.1
 */

import java.util.*;

public class TotalDividers {

    public static void totalDividers() {

        final int START = 1, END = 1000;
        Set<Integer> set = new HashSet<Integer>();
        Map<Integer, Integer> map = new HashMap<Integer, Integer>();

        for (int num = START; num <= END; num++) {
            int total = 0;

            for (int i = 1; i <= num; i++) {
                if (num % i == 0) {
                    total++;
                }
            }

            if (!set.contains(total)) {
                set.add(total);
                map.put(total, 1);
            } else {
                int t = map.get(total);
                map.put(total, t + 1);
            }
        }

        System.out.println(map);
    }
}
