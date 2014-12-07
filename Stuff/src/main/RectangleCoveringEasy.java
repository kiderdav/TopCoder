package main;

public class RectangleCoveringEasy {

	public static void main(String[] args) {
		int holeH = 1;
		int holeW = 1;		
		int boardH = 1;
		int boardW = 1;
		RectangleCoveringEasy r = new RectangleCoveringEasy();
		int covered = r.solve(holeH, holeW, boardH, boardW);
		System.out.println("Result: " + covered);
	}

	public int solve(int holeH, int holeW, int boardH, int boardW) {
		if (boardH >= holeH && boardW > holeW) {
			System.out.println("Works regular");
			return 1;
		}
		if (boardW >= holeH && boardH > holeW) {
			System.out.println("Works rotated");
			return 1;
		}
		return -1;
	}

}
