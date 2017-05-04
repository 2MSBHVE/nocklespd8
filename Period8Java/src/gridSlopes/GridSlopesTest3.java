package gridSlopes;

import java.util.ArrayList;

public class GridSlopesTest3 {

	public static void main(String[] args) {
		int size = 8;
		int tries = 0;
		Boolean solved = false;
		double[][][] grids = new double[(int) (size*size)][size][2];
		
		double[] yVals = new double[size];
		for (int gridNum = 0; gridNum < grids.length; gridNum++) {		
			if (!solved) {
				
				
				System.out.println();
				System.out.println();
				System.out.println();
				System.out.println();
				tries++;
				//			System.out.println();
				//			System.out.println();
				//			System.out.println();
				double[][] grid = grids[gridNum];

				double[][] points = new double[size][2];
				

				ArrayList<Double> slopes = new ArrayList<Double>();

//				boolean rowWith3 = false;
//				for (int i = 0; i < grid.length; i++) {
//					for (int j = 0; j < grid[i].length; j++) {
//						if (grid[i][j]) {
//							points[i][1] = (double) i;
//							points[i][0] = (double) j;
//							//						System.out.println(i + " " + j);
//							break;
//						}
//					}
//				}

//				boolean matchFound = false;
//				A: for (int i = 0; i < points.length - 1; i++) {
//					for (int j = i + 1; j < points.length; j++) {
//						double slope = ((points[j][0] - points[i][0]) / j-i);
//						//					System.out.println(slope);
//						slopes.add(slope);
//					}
//					for (int p = 0; p < slopes.size() - 1; p++) {
//						double n = slopes.get(p);
//						//					System.out.println(n);
//						for (int q = p; q < slopes.size(); q++) {
//							if (slopes.get(q) == n){
//								System.out.println("match" + tries);
//								matchFound = true;
//								break A;
//							}
//						}
//					}
//				}
//
//
//				if(!matchFound){
//					solved = true;
//					System.out.println("done" + tries);
//				}

			}
		}
	}
}
