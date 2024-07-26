import java.util.*;

public class IndianCoins {
	/*
	 * Indian Coins We are given an infinite supply of denominations [1, 2, 5, 10,
	 * 20, 50, 100, 500, 2000]. Find the minimum no of coins/Notes to make change
	 * for a value V.
	 * 
	 * Examples: If V= 121 then answer = 3(100+20+1); if V = 590 then answer =
	 * 4(500+50+20+20);
	 * 
	 * This approach will not be working for all the coin systems. The number system
	 * for which we will be able to use the greedy approach are called canonical
	 * coin system
	 */

	public static int IndCoins(int den[], int value) {
		int result = 0;
		Arrays.sort(den);
		ArrayList<Integer> coins = new ArrayList<>();

		int v = value;
		for (int i = den.length - 1; i >= 0 && v != 0; i--) {

			while (den[i] <= v) {
				v -= den[i];
				result++;
				coins.add(den[i]);
			}
		}
		return result;
	}

	public static void main(String args[]) {
		int denomination[] = { 1, 2, 5, 10, 20, 50, 100, 500, 2000 };
		int value = 590;
		int result = IndCoins(denomination, value);
		System.out.println(result);

	}
	/*
	 * We can directly sort the array in descending order by doing
	 * Comparator.reverseOrder()
	 */
}
