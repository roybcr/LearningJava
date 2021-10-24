
import java.util.Scanner;

public class BinarySearch {

    static public int search(int[] nums) {

        int pivot, left = 0, right = nums.length - 1;
        Scanner scan = new Scanner(System.in);

        int target = scan.nextInt();
        scan.close();

        while (left <= right) {
            pivot = left + (right - left) / 2;
            if (nums[pivot] == target) {
                System.out.println(pivot);
                return pivot;
            }
            if (target < nums[pivot]) {
                right = pivot - 1;
            } else {
                left = pivot + 1;
            }
        }

        System.out.println(-1);
        return -1;
    }
}
