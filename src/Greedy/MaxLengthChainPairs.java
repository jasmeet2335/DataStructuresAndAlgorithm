import java.util.*;

public class MaxLengthChainPairs {
	/*
	 * MAX LENGTH CHAIN OF PAIRS You are given n pairs of numbers. In every pair,
	 * the first number is always smaller than the second number. A pair(c,d) can
	 * come after pair (a,b) if b< c. Find the longest chain which can be formed
	 * from a given set of pairs.
	 * 
	 * pair = { (5, 24) (39, 60), (5, 28), (27, 40), (50, 90) } then answer will be
	 * 3
	 * 
	 * In this problem we have a<b, the same case can be observed when we are
	 * dealing with time.
	 */

	public static int maxLenChainPairs(int p[][]) {
		int result = 1;
		Arrays.sort(p, Comparator.comparingDouble(o -> o[1]));

		int lastPair = p[0][1];
		for (int i = 1; i < p.length; i++) {
			if (p[i][0] >= lastPair) {
				result++;
				lastPair = p[i][1];
			}
		}
		return result;
	}

	public static void main(String args[]) {
		int pair[][] = { { 5, 24 }, { 39, 60 }, { 5, 28 }, { 27, 40 }, { 50, 90 } };

		int result = maxLenChainPairs(pair);
		System.out.print(result);
	}
}
