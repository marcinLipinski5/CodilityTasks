package Lesson3.FrogJmp;

public class Solution {

	public int solution(int X, int Y, int D) {

		double modulo = (Y - X) % D;

		if (modulo == 0) {
			return (Y - X) / D;
		} else {
			return ((Y - X) / D) + 1;
		}
	}
}
