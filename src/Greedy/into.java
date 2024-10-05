package Greedy;
import java.util.*;

public class into {

	/************************************
	 * Introduction to Greedy Approach ************************ o -> we will break
	 * our problem into smaller parts. Then make a GREEDY CHOICE. o o o o o -Final
	 * Solution
	 * 
	 * Some points to consider in this are: we can achieve this by optimizing min
	 * and max, sorting the thing, there is no fixed rule.
	 * 
	 * Definition: Greedy algorithm is a problem solving technique where we make a
	 * locally optimum choice at each stage and help to achieve a global optimum.
	 * Pros - Simple and easy, good enough time complexity Cons - A number of times
	 * global optimum is not achieved.
	 * 
	 */

	/*************************************
	 * Problem 1 ********************************************************* Activity
	 * Selection - You are given n activities with their start and end times. Select
	 * the maximum number of activities that can be performed by a single person,
	 * assuming that a person can only work on a single activity at a time.
	 * Activities are sorted according to end time.
	 * 
	 * Example if start = [10, 12, 20] end = [20, 25, 30] Then answer = 2(A0 and A2)
	 * 
	 * There are other problems similar to this such as Disjoint Set and Max
	 * meetings in a room. Some of the questions will be sorted according to the end
	 * time, while some won't be. Our first approach will be to sort the activities
	 * according to the endTime, as we want to be greedy and get the most number of
	 * work done in the amount of time that we have.
	 * 
	 */
	public static int activitySelect(int start[], int end[]) {
		int count = 1;
		ArrayList<Integer> ans = new ArrayList<>();
		ans.add(0);
		int lastEnd = end[0];
		for (int i = 1; i < end.length; i++) {
			if (start[i] >= lastEnd) { // non-overlapping (Disjoint Set)
				count++;
				ans.add(i);
				lastEnd = end[i];
			}
		}
		return count;
	}

	public static void main(String args[]) {
		int start[] = { 1, 3, 0, 5, 8, 5 };
		int end[] = { 2, 4, 6, 7, 9, 9 }; // end time basis sorted

		int count = activitySelect(start, end);
		System.out.println(count);
	}

	/*
	 * Sorting the start and end time
	 * 
	 * int activities[][] = new int[start.length][3]; for(int i = 0; i <
	 * start.length ; i++) { activities[i][0] = i; activities[i][1] = start[i];
	 * activities[i][2] = end[i]; }
	 * 
	 * //Lambda Functions -> In Java comparator is an interface for sorting java
	 * object. Arrays.sort(activities, Comparator.comparingDouble(o -> o[2])); // we
	 * are pointing to ending column
	 */
}
