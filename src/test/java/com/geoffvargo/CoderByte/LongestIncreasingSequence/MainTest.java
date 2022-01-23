package com.geoffvargo.CoderByte.LongestIncreasingSequence;

import static org.junit.jupiter.api.Assertions.*;

class MainTest {
	
	@org.junit.jupiter.api.Test
	void longestIncreasingSequence_TEST1() {
		int[] arr = {10, 12, 4, 6, 100, 2, 56, 34, 79};
		assertEquals(4, Main.longestIncreasingSequence(arr));
	}
	
	@org.junit.jupiter.api.Test
	void longestIncreasingSequence_TEST2() {
		int[] arr = {10, 12, 4, 6, 100, 2, 56, 34, 79, 45, 33, 12, 45, 67, 89};
		assertEquals(6, Main.longestIncreasingSequence(arr));
	}
	
	@org.junit.jupiter.api.Test
	void longestIncreasingSequence_TEST3() {
		int[] arr = {9, 9, 4, 2};
		assertEquals(1, Main.longestIncreasingSequence(arr));
	}
	
	@org.junit.jupiter.api.Test
	void longestIncreasingSequence_TEST4() {
		int[] arr = {4, 3, 5, 1, 6};
		assertEquals(3, Main.longestIncreasingSequence(arr));
	}
	
	@org.junit.jupiter.api.Test
	void longestIncreasingSequence_TEST5() {
		int[] arr = {10, 22, 9, 33, 21, 50, 41, 60, 22, 68, 90};
		assertEquals(7, Main.longestIncreasingSequence(arr));
	}
}