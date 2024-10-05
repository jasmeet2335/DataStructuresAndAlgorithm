package Greedy;
import java.util.*;

public class MinAbsoluteDifference {
	/*
	 * Minimum Absolute Difference Given two arrays A and B of equal length n. Pair
	 * each element of array A to an element in array B, such that sum S of absolute
	 * differences of all the pairs is minimum. Example for such can be where A =
	 * [1, 2, 3] B =[2,1,3] then answer will be 0;
	 */

	public static int MinAbsDifference(int a[], int b[]) {
		int result = 0;
		Arrays.sort(a);
		Arrays.sort(b);

		for (int i = 0; i < a.length; i++) {
			result += Math.abs(a[i] - b[i]);
		}

		return result;
	}

	public static void main(String args[]) {
		int a[] = { 1, 2, 3 };
		int b[] = { 2, 1, 3 };

		int result = MinAbsDifference(a, b);
		System.out.println(result);
	}

	/*
	 * The time complexity for this function will be O(n log n)
	 */
}
