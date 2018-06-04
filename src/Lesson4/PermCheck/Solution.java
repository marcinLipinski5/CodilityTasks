package Lesson4.PermCheck;

import java.util.*;

public class Solution {
	
	public int solution(int[] A) {
		
		Set<Integer> sortedA =  new HashSet<Integer>();
		
		
		
		for(int i = 0; i < A.length; i++) {
			if(!sortedA.contains(A[i])) {
				sortedA.add(A[i]);
			}else {
				return 0;
			}
		}
	
		for(int i = 1; i <= sortedA.size(); i++) {
			if(!sortedA.contains(i)) {
				return 0;
			}
		}	
		return 1;
	}
}
