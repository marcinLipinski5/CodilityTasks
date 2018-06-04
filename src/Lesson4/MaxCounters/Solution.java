package Lesson4.MaxCounters;

import java.util.Arrays;

public class Solution {
	
	public int[] solution(int N, int[] A) {
		int [] counters = new int[N];
		int max = 0;
		
		Arrays.fill(counters, 0);	
		
		for(int i = 0; i < A.length; i++) {
			if(A[i] <= N) {
				counters[A[i]-1]++;
				if(counters[A[i] - 1] > max) {
					max = counters[A[i] - 1];
				}
			}else {
				Arrays.fill(counters, max);
			}
		}	
		return counters;
	}
}
