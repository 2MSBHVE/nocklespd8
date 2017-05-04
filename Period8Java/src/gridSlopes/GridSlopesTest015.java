package gridSlopes;

import java.util.ArrayList;

import javax.sound.midi.InvalidMidiDataException;
import javax.sound.midi.MidiUnavailableException;

public class GridSlopesTest015 {

	public static void main(String[] args) throws MidiUnavailableException, InterruptedException, InvalidMidiDataException {
		int size = 3;
		int tries = 0;
		Boolean solved = false;
		boolean useLaunchpadInput = MaxLaunchpad.main(null); 
		System.out.print("\n");
		while(!solved && tries < 50) {
			Thread.sleep(50);
				tries++;
				//			System.out.println();
				//			System.out.println();
				//			System.out.println();
				boolean[][] grid = new boolean[size][size];

				for (int i = 0; i < grid.length; i++) {
					int rand = (int) (Math.random() * size);
					grid[i][rand] = true;
				}
				
				
				
				if (useLaunchpadInput) {
//					Launchpad.main(null);
//					MaxLaunchpad.clearPads(MaxLaunchpad.launchpad, 0, 0);
					for (int i = 0; i < grid.length; i++) {
						for (int j = 0; j < grid[i].length; j++) {
							int[] pxl = new int[] {j,i};
							if (grid[i][j]) {
								MaxLaunchpad.display(MaxLaunchpad.launchpad, pxl, 5, "solid");
							}
							else {
								MaxLaunchpad.display(MaxLaunchpad.launchpad, pxl, 3, "solid");
							}
						}
					}
				}
				
				
				
				double[][] points = new double[size][2];
				
				for (int x = 0; x < size; x++) {
					for (int y = 0; y < size; y++) {
//						System.out.println(grid[x][0]);
					}
				}
				
				

				ArrayList<Double> slopes = new ArrayList<Double>();

//				boolean rowWith3 = false;
				for (int i = 0; i < grid.length; i++) {
					for (int j = 0; j < grid[i].length; j++) {
						if (grid[i][j]) {
							points[i][1] = (double) i;
							points[i][0] = (double) j;
							//						System.out.println(i + " " + j);
							break;
						}
//					}
					}//				}

				boolean matchFound = false;
				A: for (int i1 = 0; i1 < points.length - 1; i1++) {
					for (int j1 = i1 + 1; j1 < points.length; j1++) {
						double slope = ((points[j1][0] - points[i1][0]) / j1-i1);
//											System.out.println(slope);
						slopes.add(slope);
					}
					for (int p = 0; p < slopes.size() - 1; p++) {
						double n = slopes.get(p);
						//					System.out.println(n);
						for (int q = p; q < slopes.size(); q++) {
							if (slopes.get(q) == n){
								System.out.println("match" + tries);
								matchFound = true;
								break A;
							}
						}
					}
				}


				if(!matchFound){
					solved = true;
					System.out.println("done" + tries);
					System.exit(0);
//				}

			}
		}
	}
}

}