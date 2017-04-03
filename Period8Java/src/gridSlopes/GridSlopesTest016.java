package gridSlopes;

import java.util.ArrayList;

import javax.sound.midi.InvalidMidiDataException;
import javax.sound.midi.MidiUnavailableException;

public class GridSlopesTest016 {

	public static void main(String[] args) throws MidiUnavailableException, InterruptedException, InvalidMidiDataException {
		int size = 6;
		int tries = 0;
		Boolean solved = false;
		boolean useLaunchpadInput = MaxLaunchpad.main(null); 
		if (useLaunchpadInput) {
								MaxLaunchpad.clearPads(MaxLaunchpad.launchpad, 0, 0);
		}
		System.out.print("\n");
		while(!solved && tries < 20000) {
			Thread.sleep(10);
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



			ArrayList<Double> slopes = new ArrayList<Double>();

			
			for (int i = 0; i < grid.length; i++) {
				for (int j = 0; j < grid[i].length; j++) {
					if (grid[i][j]) {
						points[i][1] = (double) i;
						points[i][0] = (double) j;
						break;
					}
				}
			}
			for (int j = 0; j < points.length - 1; j++) {
				for (int j2 = j+1; j2 < points.length; j2++) {
					double rise = points[j2][0] - points[j][0];
					double run  = points[j2][1] - points[j][1];
					double slope = rise / run;
					slopes.add(slope);

					System.out.println(rise + " / " + run + " = " + slope);
				}
			}	


			boolean matchFound = false;
			A: for (int nSlope = 0; nSlope < slopes.size() - 1; nSlope++) {
				for (int k = nSlope + 1; k < slopes.size(); k++) {
					System.out.println(slopes.get(k) + " " + slopes.get(nSlope));
					System.out.println(slopes.get(k).equals(slopes.get(nSlope)));
					if (slopes.get(k).equals(slopes.get(nSlope))) {
						matchFound = true;
						break A;
					}
				}
			}


			if(!matchFound){
				solved = true;
				System.out.println("done" + tries);
				
				if (useLaunchpadInput) {
//					//					Launchpad.main(null);
//					//					MaxLaunchpad.clearPads(MaxLaunchpad.launchpad, 0, 0);
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
				
				System.exit(0);
				//				}

			}

		}
	}

}