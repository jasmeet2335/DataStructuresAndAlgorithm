import java.util.*;

public class FractionalNapsack {
	/*
	 * Given the weight and value of N items, put these items in a knapsack of
	 * capacity W to get the maximum total value of the knapsack. value = [60, 100,
	 * 120]; weight = [10, 20, 30]; If the weight of our knapsack is 50 then answer
	 * will be 240.
	 * 
	 * Steps that We can follow to answer this question We can find the ratio for
	 * all of the value weight pair. Then we will sort the array based on the ratio.
	 * We can start adding the weight to our knapsack starting from the beginning.
	 * In this we will have two cases Case 1: where capacity >= weight[i]: we will
	 * simple add the value and subtract the weight. Case 2: where capacity
	 * <=weight[i]: Here we will adjust the weight according to the capacity:
	 * finding the ratio of capacity and weight to be added.
	 * 
	 */
	public static int fractionalKnapsack(int value[], int weight[], int totalWeight) {
		int result = 0;
		int ratio[] = new int[value.length];
		for (int i = 0; i < value.length; i++) {
			ratio[i] = (value[i] / weight[i]);
		}

		int ratioSort[][] = new int[value.length][4];
		for (int i = 0; i < value.length; i++) {
			ratioSort[i][0] = i;
			ratioSort[i][1] = value[i];
			ratioSort[i][2] = weight[i];
			ratioSort[i][3] = ratio[i];
		}

		Arrays.sort(ratioSort, Comparator.comparingDouble(o -> o[2]));

		int capacity = totalWeight;
		int i = 0;
		while (capacity != 0 && i < ratioSort.length) {
			if (ratioSort[i][2] <= capacity) {
				result += ratioSort[i][1];
				capacity -= ratioSort[i][2];
			} else {
				if (ratioSort[i][2] - capacity > 0) {
					result += capacity * ratioSort[i][3];
					capacity = 0;
				}
			}
			i++;
		}
		return result;
	}

	public static void main(String args[]) {
		int value[] = { 60, 100, 120 };
		int weight[] = { 10, 20, 30 };
		int w = 50;
		int result = fractionalKnapsack(value, weight, w);
		System.out.println(result);
	}

	/**
	 * Some improvements in the code can be: We can make the ratio capacity double
	 * and we can reduce the double array to just index of 2 by having just index
	 * and ratio values and then sorting it.
	 */
}
