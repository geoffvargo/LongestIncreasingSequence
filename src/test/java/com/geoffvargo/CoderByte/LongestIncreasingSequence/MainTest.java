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
}