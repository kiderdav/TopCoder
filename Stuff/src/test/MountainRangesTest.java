package test;

import static org.junit.Assert.assertEquals;
import main.MountainRanges;

import org.junit.Test;

public class MountainRangesTest {

	@Test
	public void test5624() {
		int[] heights = {1, 2, 3, 2, 1};
		MountainRanges mr = new MountainRanges();
		int peaks = mr.countPeaks(heights);
		assertEquals(peaks, 1);
	}
	
	@Test
	public void test1111111() {
		int[] heights = {1, 1, 1, 1, 1, 1, 1};
		MountainRanges mr = new MountainRanges();
		int peaks = mr.countPeaks(heights);
		assertEquals(peaks, 0);
	}
	
	@Test
	public void test21() {
		int[] heights = {2, 1};
		MountainRanges mr = new MountainRanges();
		int peaks = mr.countPeaks(heights);
		assertEquals(peaks, 1);
	}	

	@Test
	public void test253728131() {
		int[] heights = {2,5,3,7,2,8,1,3,1};
		MountainRanges mr = new MountainRanges();
		int peaks = mr.countPeaks(heights);
		assertEquals(peaks, 4);
	}	
	
	@Test
	public void test1() {
		int[] heights = {1};
		MountainRanges mr = new MountainRanges();
		int peaks = mr.countPeaks(heights);
		assertEquals(peaks, 1);
	}

	@Test
	public void test12344321() {
		int[] heights = {1,2,3,4,4,3,2,1};
		MountainRanges mr = new MountainRanges();
		int peaks = mr.countPeaks(heights);
		assertEquals(peaks, 0);
	}
	
}
