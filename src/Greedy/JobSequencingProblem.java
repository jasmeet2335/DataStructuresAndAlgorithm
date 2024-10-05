package Greedy;
import java.util.*;

public class JobSequencingProblem {
	/*
	 * Jobs Sequencing Problem Given an array of jobs where job has a deadline and
	 * profit if the job is finished before the deadline. It is also given that
	 * every job takes a single unit of time, so the minimum possible deadline for
	 * any job is 1. Maximize the total profit if only one job can be scheduled at a
	 * time.
	 * 
	 * Example: Job A = 4, 20 Job B = 1, 10; Job C = 1, 40; Job D = 1, 30; Then the
	 * answer will be C, A;
	 */
	static class Job {
		int deadline;
		int profit;
		int id = 0;

		public Job(int i, int d, int p) {
			id = i;
			deadline = d;
			profit = p;
		}
	}

	public static void main(String args[]) {
		int jobInfo[][] = { { 4, 20 }, { 1, 10 }, { 1, 40 }, { 1, 30 } };
		ArrayList<Job> jobs = new ArrayList<>();

		for (int i = 0; i < jobInfo.length; i++) {
			jobs.add(new Job(i, jobInfo[i][0], jobInfo[i][1]));
		}

		Collections.sort(jobs, (a, b) -> b.profit - a.profit); // Descending order of profit by using lambda function

		ArrayList<Integer> seq = new ArrayList<>();
		int time = 0;
		for (int i = 0; i < jobs.size(); i++) {
			Job curr = jobs.get(i);
			if (curr.deadline > time) {
				seq.add(curr.id);
				time++;
			}
		}

		// To print the seq
		for (int i = 0; i < seq.size(); i++) {
			System.out.println(seq.get(i) + " ");
		}
	}
}
