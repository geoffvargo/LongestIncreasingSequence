package com.geoffvargo.CoderByte.LongestIncreasingSequence;

import java.util.*;

/**
 * Have the function LongestIncreasingSequence(arr) take the array of positive integers stored in arr and return the length
 * of the longest increasing subsequence (LIS). A LIS is a subset of the original list where the numbers are in sorted order,
 * from lowest to highest, and are in increasing order. The sequence does not need to be contiguous or unique, and there can
 * be several different subsequences. For example: if arr is [4, 3, 5, 1, 6] then a possible LIS is [3, 5, 6], and another is [1, 6].
 * For this input, your program should return 3 because that is the length of the longest increasing subsequence.
 */
class Main {
	
	public static void main(String[] args) {
		// keep this function call here
		Scanner s  = new Scanner(System.in);
		String  s1 = s.nextLine();
		
		System.out.print(LongestIncreasingSequence(Arrays.stream(s1.split("\\D+")).mapToInt(Integer::parseInt).toArray()));
	}
	
	public static int LongestIncreasingSequence(int[] arr) {
		// code goes here
		int size = 0;
		for (int i = 0; i < arr.length; i++) {
			int temp     = arr[i];
			int currSize = 1;
			for (int j = i + 1; j < arr.length; j++) {
				if (arr[j-1] < arr[j]) {
					currSize++;
				}
			}
			size = Math.max(size, currSize);
		}
		
		return size;
	}
	
}
