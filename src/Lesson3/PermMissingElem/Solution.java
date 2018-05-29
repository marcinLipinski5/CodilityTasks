/*
 * An array A consisting of N different integers is given. The array contains integers in the range [1..(N + 1)], which means that exactly one element is missing.

Your goal is to find that missing element.

Write a function:

class Solution { public int solution(int[] A); }

that, given an array A, returns the value of the missing element.

For example, given array A such that:

  A[0] = 2
  A[1] = 3
  A[2] = 1
  A[3] = 5
the function should return 4, as it is the missing element.

Assume that:

N is an integer within the range [0..100,000];
the elements of A are all distinct;
each element of array A is an integer within the range [1..(N + 1)].
Complexity:

expected worst-case time complexity is O(N);
expected worst-case space complexity is O(1) (not counting the storage required for input arguments).
 */
package Lesson3.PermMissingElem;

import java.util.Arrays;

public class Solution {

	public int solution(int[] A) {

		Arrays.sort(A);

		if (A.length == 0) {
			return 1;
		}

		if (A[0] != 1) {
			return 1;
		}

		for (int j = 0; j < A.length; j++) {
			try {
				if (A[j] + 1 != A[j + 1]) {
					return A[j] + 1;
				}
			} catch (IndexOutOfBoundsException ex) {
				return A[j] + 1;
			}
		}
		return 0;
	}

}
