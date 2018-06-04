package Lesson4.FrogRiverOne;

import java.util.*;

public class Solution {

	public static int solution(int X, int[] A) {

		Set<Integer> sortedA = new HashSet<Integer>();
		for (int i = 0; i < A.length; i++) {
			if (A[i] <= X)
				sortedA.add(A[i]);

			if (sortedA.size() == X)
				return i;
		}

		return -1;
	}
}