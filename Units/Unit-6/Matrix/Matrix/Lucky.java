
/**
 * LeetCode 1394. 
 * Find Lucky Integer in an Array.
 * 
 * A lucky integer is an integer which has 
 * a frequency in the array equal to its value. 
 * 
 * Return the largest lucky integer in the array. 
 * If there is no lucky integer return -1. 
 *
 * @author (Roy Bachar)
 * @version (08/12/21)
 */

public class Lucky {
    public int findLucky(int[] arr) {
        int[] b = new int[arr.length + 1];
        int m = -1;
        
        for (int i = 0; i < arr.length; i++) {
            int x = arr[i];
            if (x <= arr.length) {
                b[x]++;    
            }
        }
            
        for (int j = 1; j < b.length; j++) {
            if (b[j] == j && m < j) {
                    m = j;    
            }       
        }
        return m;
    }
}