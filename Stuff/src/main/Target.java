package main;

public class Target {

	public static void main(String[] args) {
		int size = 9;
		System.out.println("Begin for " + size);
		Target t = new Target();
		String[] results = t.draw(size);
		for (String x : results) {
			System.out.println(x);
		}
		System.out.println("End");
	}
	
	public String[] draw(int size) {
		String[] results = new String[size];
		for (int x = 0; x < size; x++) {
			StringBuilder current = new StringBuilder();
			current.append(drawSide(size, x, false));
			current.append(drawCenter(size, x));
			current.append(drawSide(size, x, true));
			results[x] = current.toString();
		}
		return results;
	}
	
	private String drawSide(int length, int iteration, boolean reverse) {
		int spots = 0;
		if (iteration <= length/2) {
			spots = iteration;
		} else {
			spots = length - iteration - 1;
		}
		StringBuilder current = new StringBuilder();
		for (int y = 0; y < spots; y++) {
			boolean even = (y % 2 == 0);
			String use = " ";
			if (even) {
				use = "#";
			}
			current.append(use);
		}
		if (reverse) {
			current = current.reverse();
		}
		return current.toString();
	}
	
	private String drawCenter(int length, int iteration) {
		boolean even = (iteration % 2 == 0);
		String use = " ";
		if (even) {
			use = "#";
		}
		
		int spots = length - (2 * iteration);
		if (spots < 0) {
			spots = (iteration * 2) - length + 2;
		}		
		StringBuilder current = new StringBuilder();
		for (int y = 0; y < spots; y++) {				
			current.append(use);
		}
		return current.toString();
	}

}
