package com.geoffvargo.CoderByte.LongestIncreasingSequence;

import java.util.*;
import java.util.stream.*;

/**
 * Have the function LongestIncreasingSequence(arr) take the array of positive integers stored in arr and return the length
 * of the longest increasing subsequence (LIS). A LIS is a subset of the original list where the numbers are in sorted order,
 * from lowest to highest, and are in increasing order. The sequence does not need to be contiguous or unique, and there can
 * be several different subsequences. For example: if arr is [4, 3, 5, 1, 6] then a possible LIS is [3, 5, 6], and another is [1, 6].
 * For this input, your program should return 3 because that is the length of the longest increasing subsequence.
 */
class Main {
	
	//	private static ArrayList<Integer> curr = new ArrayList<>();
	private static List<List<Integer>> curr = new ArrayList<>();
	
	public static void main(String[] args) {
		// keep this function call here
		Scanner s  = new Scanner(System.in);
		String  s1 = s.nextLine();
		
		System.out.print(longestIncreasingSequence(Arrays.stream(s1.split("\\D+")).mapToInt(Integer::parseInt).toArray()));
	}
	
	public static int longestIncreasingSequence(int[] arr) {
		// code goes here
		
		int size = 0;
		
		return longestIncreasingSequenceHLPR(arr, size, curr);
	}
	
	private static int longestIncreasingSequenceHLPR(int[] arr, int size, List<List<Integer>> current) {
		int left, right;
		if (arr.length <= 1) {
			return 0;
		}
		if (arr.length == 2) {
			if (arr[0] < arr[1]) {
				curr.add(IntStream.of(arr).boxed().collect(Collectors.toList()));
				return 1;
			} else {
				return 0;
			}
		}
		
		size += (arr[0] < arr[1]) ? 1 : 0;
//		curr.add(Arrays.asList(arr[0], arr[1]));
		
		size += longestIncreasingSequenceHLPR(Arrays.copyOfRange(arr, 1, arr.length), size, current);
//		left = longestIncreasingSequenceHLPR(Arrays.copyOfRange(arr, 1, arr.length), size, current)
		
		return size;
	}
	
}
