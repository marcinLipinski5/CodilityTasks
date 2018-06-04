package Lesson4.MissingInteger;

import java.util.*;

public class Solution {

	public int solution(int[] A) {
		
		Set<Integer> sortedA = new HashSet<Integer>();
		
		for(int i = 0; i < A.length; i++) {
			if (A[i] > 0) {
				sortedA.add(A[i]);
			}
		}
		
		for(int i = 1; i < Integer.MAX_VALUE; i++) {
			if(!sortedA.contains(i)) {
				return i;
			}
		}
			
		return 1;
	}	
}
