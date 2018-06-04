package Lesson3.TapeEquilibrium;


public class Solution {

	public int solution(int[] A) {

		int sumL = 0;
		int sumR = 0;
		int abs = 0;
		
		if(A.length == 2) {
			abs = Math.abs(A[0] - A[1]);
			System.out.println(abs);
		}

		for (int i = 0; i < A.length; i++) {
			sumR = sumR + A[i];
		}
	
	
		
		for (int i = 0; i < A.length-1; i++) {
			sumL = sumL + A[i];
			System.out.println("SumL: " + sumL);
			sumR = sumR - A[i];
			System.out.println("SumR: " + sumR);
			System.out.println("Abs: " + Math.abs(sumL - sumR));
			System.out.println("------------");
			if(i == 0) {
				abs = Math.abs(sumL - sumR);
			}
			if (Math.abs(sumL - sumR) < abs) {
				abs = Math.abs(sumL - sumR);
			}
		}
		return abs;
	}
}
