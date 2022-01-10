/**
 * An implementation of the merge sort algorithm with recursion.
 *
 * @author (Roy Bachar)
 * @version (10/01/22)
 */

public class MergeSort {

	public static void main(String[] args) {
		int[] arr = { 4, 2, 3, 1, 0, -1, 10, 9, 20, 7 };
		MergeSort.mergeSort(arr, 0, arr.length - 1);
	}

	public static void mergeSort(int[] arr, int start, int end) {
		/* 		if (arr.length == 0 || start >= end || (end - start + 1) > arr.length) return; */
		MergeSort.toString(arr);
		if (start < end) {
			int mid = (start + end) / 2;
			mergeSort(arr, start, mid);
			mergeSort(arr, mid + 1, end);
		}
		/* int[] leftSubsetArr = MergeSort.copySubsetArray(arr, start, mid);
		MergeSort.toString(leftSubsetArr);
		int[] rightSubsetArr = MergeSort.copySubsetArray(arr, mid + 1, end);
		MergeSort.toString(rightSubsetArr);
		int right = rightSubsetArr.length, left = leftSubsetArr.length; */
		/* 
		if (right == left) {
			if (right == 1) {
				int r = rightSubsetArr[0], l = leftSubsetArr[0];
				int[] temp = { Math.min(r, l), Math.max(r, l) };
				MergeSort.mergeSort(temp, 0, 1);
			}
		} */
	}

	/* 
	private static int[] copySubsetArray(int[] arr, int start, int end) {
		int j = 0, newlength = end - start + 1;
		int[] newarr = new int[newlength];
		for (int i = start; i <= end; i++) newarr[j++] = arr[i];
		return newarr;
	}
 */
	private static void toString(int[] arr) {
		String stringArr = "[ ";
		for (int i = 0; i < arr.length; i++) stringArr +=
			i == arr.length - 1 ? ((arr[i]) + " ]") : ((arr[i]) + ", ");
		System.out.println(stringArr);
	}
}
