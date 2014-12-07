package main;

public class MountainRanges {

	public static void main(String[] args) {
		int[] heights = {1, 2, 3, 2, 1};
		MountainRanges mr = new MountainRanges();
		int peaks = mr.countPeaks(heights);
		System.out.println("Peaks: " + peaks);
	}
	
	public int countPeaks(int[] heights) {
		int[] heightsWithPadding = padStartAndEnd(heights);
		printArray(heightsWithPadding);
		
		int peaks = 0;		
		for (int pos = 1; pos < heightsWithPadding.length - 1; pos++) {
			System.out.println("Height: " + heightsWithPadding[pos] + " prev: " + heightsWithPadding[pos-1] + " next: " + heightsWithPadding[pos+1]);
			if (heightsWithPadding[pos] > heightsWithPadding[pos-1] && heightsWithPadding[pos] > heightsWithPadding[pos+1]) {
				System.out.println("Peak!");
				peaks++;
			}
		}
		
		return peaks;
	}
	
	private int[] padStartAndEnd(int[] heights) {
		int[] heightsWithEnds = new int[heights.length + 2];
		heightsWithEnds[0] = 0;
		for (int x = 0; x < heights.length; x++) {
			heightsWithEnds[x + 1] = heights[x];
		}
		heightsWithEnds[heightsWithEnds.length - 1] = 0;
		return heightsWithEnds;
	}
	
	private void printArray(int[] x) {
		for (int y = 0; y < x.length; y++) {
			System.out.print(x[y] + " ");
		}
		System.out.println();
	}

}
