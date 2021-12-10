/**
 * Given a Matrix, calculate the average of the sum 
 * of all members in the bottom left quarter quarter.
 * 
 * For example:
 * In a matrix of size [3][6] ->
 * 
 * the quarter will start at [1, 0] and end at [2, 2].
 * -------------------------
 * | o | o | o | o | o | o |
 * -------------------------
 * | x | x | x | o | o | o |
 * -------------------------
 * | x | x | x | o | o | o |
 * -------------------------
 * 
 * @Author Roy Bachar
 * @Version (09/12/21)
 */
 
 
public class AvgQuarter {
    
    public static double avg(int[][] m) {
        final int QR = m.length / 2, QC = m[0].length / 2;
        double sum = 0, items = 0;
        
        for(int i = QR; i < m.length; i ++)
            for(int j = 0; j < QC; j++) {
                sum += m[i][j];
                items++;
            }
            
        return sum / items;
    }
}