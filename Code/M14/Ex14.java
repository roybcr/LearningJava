/**
 * Assignment 14 - Algorithm Complexity & Recursion.
 * 
 * @author Roy Bachar
 * @version 1.0
 */

public class Ex14  {
    
  public static void main(String[] args) {
     System.out.println("(:");
  }
       
       
    /**
     * 
     * 1. Find Min Diff
     * 
     * This algorithm finds the minimal distance between x, y in the given array.
     * if neither x nor y exists in the array, the algorithm returns Integer.MAX_VALUE;
     *
     * Time Complexity:
     * In the worst case, the algorithm will have to iterate through the given array - from start to end.
     * The complexity is growing in a direct proportion to the size of the input given,
     * and thus, the time complexity of the algorithm is linear: O(n). 
     * 
     * Space Complexity:
     * A constant number of variables is declared and used, 
     * regardless of the input size.
     * 
     * The space complexity of the algorithm is constant: O(1).
     * 
     * @param a An integer array to find the minimum distance between x and y in.
     * @param x The first number to search for in the array.
     * @param y The second number to search for in the array.
     * 
     * @return  The minimal difference between x and y. 
     *          If one number is missing or both,
     *          returns the maximal value for an Integer.
     *
     */
    
    public static int findMinDiff(int[] a, int x, int y) {

        int minDiff = Integer.MAX_VALUE;

        /* If a[] contains one or zero values, or,
           If a[] contains 2 values and one of the values is neither x nor y, then exit early. */

        if (a.length <= 2) {
            if ((a.length <= 1) || (a[0] != x && a[1] != x) || (a[0] != y && a[1] != y)) 
                return minDiff;
            return 1;
        }

        /* temp holds the last position where x or y were seen. */
        int temp = -1;
        for (int i = 0; i < a.length; i++) {

            if (a[i] == x || a[i] == y) {

                /* If temp has already been updated (we already saw at least one x or y),
                and the value in a[temp] is different from the current value at a[i]. */
                if (temp > -1 && a[temp] != a[i]) {

                    /* Update minDiff only if the new distance is smaller. */
                    minDiff = Math.min(minDiff, (i - temp));
                    if (minDiff == 1)
                        return 1;
                }

                /* Update temp to hold the new position of the last seen x or y. */
                temp = i;
            }
        }

        return minDiff;
    }



    /**
     * 
     * 2. Circular Matrix
     * 
     * This algorithm searches for a given number (num) inside a circular matrix, 
     * and returns true if it was found.
     *
     * Time Complexity:
     * This algorithm has a logarithmic time complexity.
     * On each iteration the algorithm selects 1 Sub square to search in, 
     * focusing on 1/4 of the input.
     * Time complexity: O(log n).
     * 
     * Space Complexity:
     * A constant number of variables is declared and used,
     * regardless of the input size.
     * 
     * The space complexity of the algorithm is constant: O(1).
     * 
     * @param mat The Circular Matrix to search num in.
     * @param num The number to search in the given matrix. 
     * 
     * @return    True if num was found in the matrix.
     *
     */

    public static boolean search(int[][] mat, int num) {

        /* If there is only one value return whether it equals to num. */
        if (mat.length == 1) 
            return mat[0][0] == num;
        
        /* Check the case where the smallest value in the matrix is bigger than num,
        and the case where the largest value in the matrix is smaller than num. */
        if (mat[0][0] > num || mat[mat.length - 1][0] < num) 
            return false;
        
        
       /** 
        * squareNumber - The currently selected Sub-Square.
        * The Square number is based on the location of a square inside a bigger square.
        *
        * Top Left Square     = 1
        * Top Right Square    = 2
        * Bottom Right Square = 3
        * Bottom Left Square  = 4 
        */        
        
        int squareNumber;
        int currRow = 0;
        int currCol = 0;
        int squareLength = mat.length / 2;

        
        while (squareLength >= 1) {
            
            /**
             * 
             * Each iteration starts at Sub-Square 1 of the 
             * previously selected square at position: mat[currRow][currCol].
             * 
             * In each iteration a new square is selected inside the current square,
             * so 3/4 of the input is eliminated on each iteration. 
             * 
             * CurrRow & CurrCol - The positions in the initial given matrix.
             * Both being updated according to the relative position we're currently in,
             * along with squareLength, which limits the movement inside the bigger array 
             * in order to fit to the scale of the Square we're searching in.
             *  
             * Relative positions from mat[currRow][currCol]:
             * 
             * Square 1:
             * 
             *  - SubSquare 1: mat[currRow][currCol]
             *  - SubSquare 4: mat[currRow + squareLength - 1][currCol]
             * 
             * Square 2:
             * 
             *  - SubSquare 1: mat[currRow][currCol + squareLength]
             *  - SubSquare 4: mat[currRow + squareLength - 1][currCol + squareLength]
             * 
             * Square 3:
             * 
             *  - SubSquare 1: mat[currRow + squareLength][currCol + squareLength]
             *  - SubSquare 4: mat[currRow + (squareLength * 2) - 1][currCol + squareLength]
             * 
             * Square 4:
             * 
             *  - SubSquare 1: mat[currRow + squareLength][currCol]
             *  - SubSquare 4: mat[currRow + (squareLength * 2) - 1][currCol]
             * 
             */


            if(mat[currRow + squareLength - 1][currCol + squareLength] < num) {

                squareNumber = 
                (mat[currRow + (squareLength * 2) - 1][currCol + squareLength] < num) ? 4 : 3;

            } else {
                
                squareNumber = 
                (mat[currRow + squareLength - 1][currCol] < num) ? 2 : 1;

            }

            switch (squareNumber) {
                
                case 1:
                    
                    /* Exit if num is smaller than the smallest value of Square 1.*/
                    if(num < mat[currRow][currCol])
                        return false;

                    break;

                case 2:
                    
                    /* Navigate from Square 1 to Square 2. */
                    currCol += squareLength;
                    break;
                
                case 3:

                    /* Navigate from Square 1 to Square 3 */
                    currCol += squareLength;
                    currRow += squareLength;
                    break;
                
                case 4:

                    /* Exit if num is bigger than the biggest value of Square 4. */
                    if(num > mat[currRow + (squareLength * 2) - 1][currCol])    
                        return false;
                
                    /* Navigate from Square 1 to Square 4. */
                    currRow += squareLength;    
                    break;
                    
                default:
                    break;
            }

            /* If we happen to get to a position where num is */
            if (mat[currRow][currCol] == num) {
                return true;
            }

            /* "Enter" the sub-square by limiting the movement can be made inside the array,
            The new square length is the size of the side length of the new subsquare. */
            squareLength /= 2;
        }

        return false;
    }



    /**
     * 
     * 3. Equal Split
     * 
     * This method takes an array of integers and checks 
     * if it can be splitted into two groups of the same size, 
     * so that both groups have equal sum.
     * Handles the initial call to a recursive helper method.  
     * 
     * @param arr The array to check.
     * @return    True if the given array can be Equally Splitted.
     *
     */

    public static boolean equalSplit(int[] arr) {
        
        /* If less than two elements, or of odd number of elements, 
        can't be splitted into two equal groups. */
        if (arr.length < 2 || arr.length % 2 != 0)
            return false;

        if (arr.length == 2) 
            return arr[0] == arr[1];

        /* Pre calculating the total sum of the elements in the array. */
        int sum = sum(arr, 0);

        /* Odd sum cannot be splitted equally. */
        if (sum % 2 != 0) 
            return false;

        
        return equalSplit(arr, 0, arr.length / 2, sum / 2);
    }

     /**
     *
     * This private helper method is an overloading of the public equalSplit(), 
     * This method handles the recursive calls and the actual logic.
     * 
     * @param arr            The array to check.
     * @param i              The index of the current element.
     * @param availableSlots The amount of members to add to the current group so both groups equal in size.
     * @param sum            The sum for each "Split" to reach.
     * 
     * @return               True if the given array can be Equally Splitted.
     *
     */

    private static boolean equalSplit(int[] arr, int i, int availableSlots, int sum) {

        if (availableSlots <= 0) 
            return sum == 0;

        /* If there are only n elements left to check and exact n available slots, 
        all following members have to join the current group. */
        
        if (availableSlots == (arr.length - i))
            return equalSplit(arr, i + 1, availableSlots - 1, sum - arr[i]);

        
        /* Return one of two scenarios: 
        1. The current element is added to the current group, takes an available slot and updates the sum.
        2. The current element shouldn't be in the group and passes on the calls with only incrementing i. */
        if(equalSplit(arr, i + 1, availableSlots - 1, sum - arr[i]))
            return true;
        return equalSplit(arr, i + 1, availableSlots, sum);
    }


    /**
     * A private Helper method to calculate the sum of an array recursively.
     * 
     * @param a The array to calculate the sum of.
     * @param i The current index to add to the sum.
     * @return  The calculated sum of the array.
     */

    private static int sum(int a[], int i) {
        return i == a.length - 1 ? (a[i]) : (a[i] + sum(a, i + 1));
    }



   /**
    * 
    * 4. Is-Special
    * 
    * A recursive method that checks if a given integer is special.
    * An integer is considered to be "special" by making it through the following process:
    *
    * 1. Start with Steps = 2.
    * 2. For all integers from 1 up to |n|: 1,2,3,4,5,6,...,n:
    * 3. Delete all numbers in positions that are divisible by Steps.
    * 4. Unless n is deleted, increment Steps by 1 then repeat step 3.
    * 5. The process is over if n is deleted (not special), or if Steps > n (special).
    *
    * @param n An Integer to find out if special or not.
    * @return  True or False indicating whether or not the checked number is special.
    * 
    */

    public static boolean isSpecial(int n) {
        
        /* In case n is less than 0 */
        int num = n < 0 ? (n * -1) - 1 : n;
        
        if (num % 2 == 0 || num % 5 == 0 || num % 4 == 0) 
            return false;
        
        /* Starting straight from the second round, with a new position of n,
        equals to the initial position, minus all the even numbers before it. */
        int newPosition = (num + 1) / 2;

        /* Jumps of 3 now since we've already eliminated all even numbers. */
        int jumpSteps = 3;
        return isSpecial(newPosition, jumpSteps);
    }

    private static boolean isSpecial(int n, int jumpSteps) {

        /* If current position is divisible by jumpSteps,
        our number is not special and is going to be eliminated in the current round. */
        if (n % jumpSteps == 0) 
            return false;
        
        /* If steps are bigger than the current position,
        our number will never be eliminated and thus, special. */
        if (n < jumpSteps) 
            return true;

        /* Promote n to its new position by eliminating all unspecial numbers before it.
        Increase jumpSteps by one. */
        
        return isSpecial((n - (n / jumpSteps)), jumpSteps + 1);
    }
}
