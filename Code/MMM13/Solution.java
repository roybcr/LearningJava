class Solution {
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