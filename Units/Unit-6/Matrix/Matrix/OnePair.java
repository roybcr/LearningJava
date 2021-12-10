/**
 * Given a matrix, return true if it has at least one pair of numbers
 * that sums to 1.
 * 
 * @Author (Roy Bachar)
 * @Version(09/12/21)
 */

public class OnePair {

    public static boolean pair1(int[][] a) {
        for (int i = 0; i < a.length; i++)
            for (int j = 0; j < a[0].length; j++)
                for (int m = 0; m < a.length; m++)
                    for (int k = 0; k < a[0].length; k++)
                        if (a[m][k] + a[i][j] == 1)
                            return true;

        return false;
    }

}
