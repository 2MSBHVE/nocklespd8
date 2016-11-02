package caveExplorer;

import java.util.Arrays;
import java.util.Iterator;

public class TwoDArraysIntro {

	public static void main(String[] args) {
		
		boolean[][] mines = new boolean[6][6];
		plantMines(mines);
		
		String[][] field = createField(mines);
		printPic(field);
		
	}

	private static void plantMines(boolean[][] mines) {
		int numMines = 10;
		while (numMines > 0) {
			int row = (int)(Math.random() * mines.length);
			int col = (int)(Math.random() * mines[0].length);
			
//			prevents selection of existing mine
			if (!mines[row][col]) {
				mines[row][col] = true;
				numMines--;
			}
		}
	}
	
	private static String[][] createField(boolean[][] mines) {
		String[][] field = new String[mines.length][mines[0].length];
		
		
		
		
		return field;
	}
	
	private static String countNearby(boolean[][] mines, int row, int col){
		
		for (int r = 0; r < mines.length; r++) {
			for (int c = 0; c < mines.length; c++) {
				if (r >= 0 && r < mines.length && c >= 0 && c < mines.length) {
					
				}
			}
		}
		
		
		return null;
	}

	public static void printPic(String[][] pic) {
		for (String[] row : pic) {
			for (String col : row){
				System.out.print(col);
			}
			System.out.print("\n");
		}
	}
	
	public static void origStuff() {
//		String[] xox = {"x","o","x","o","x"};
//		System.out.println(Arrays.toString(xox));
	
//		String[][] arr2D = new String[5][4];
	
//		for (int row = 0; row < arr2D.length; row++) {
//			for (int col = 0; col < arr2D[row].length; col++) {
//				arr2D[row][col] = "(" + row + ", " + col + ")";
//			}
//		}
		
////		every element in a 2D array is itself an array
//		for (String[] row : arr2D) {
//			System.out.println(Arrays.toString(row));
//		}
		
		
		String[][] pic = new String[8][8];
		
		for (int row = 0; row < pic.length; row++) {
			for (int col = 0; col < pic[row].length; col++) {
				pic[row][col] = " ";
			}
		}
		
		for (int row = 7; row < pic.length; row++) {
			for (int col = 0; col < pic[row].length; col++) {
				pic[row][col] = "w";
			}
		}
		pic[0][0] = "_";
		pic[0][1] = "_";
		pic[0][2] = "_";
		pic[0][3] = "_";
		pic[0][4] = "_";
		pic[0][5] = "_";
		pic[0][6] = "_";
		pic[0][7] = "_";
		
		
		pic[1][2] = "v";
		pic[1][5] = "v";
		pic[2][6] = "v";

		pic[2][2] = "\\";
		pic[2][3] = "|";
		pic[2][4] = "/";
		pic[3][1] = "-";
		pic[3][2] = "-";
		pic[3][3] = "O";
		pic[3][4] = "-";
		pic[3][5] = "-";
		pic[4][4] = "\\";
		pic[4][3] = "|";
		pic[4][2] = "/";
		
		pic[1][0] = "|";
		pic[2][0] = "|";
		pic[3][0] = "|";
		pic[4][0] = "|";
		pic[5][0] = "|";
		pic[6][0] = "|";
		
		pic[1][7] = "|";
		pic[2][7] = "|";
		pic[3][7] = "|";
		pic[4][7] = "|";
		pic[5][7] = "|";
		pic[6][7] = "|";
		
		
		pic[7][0] = "|";
		pic[7][1] = "_";
		pic[7][2] = "_";
		pic[7][3] = "_";
		pic[7][4] = "_";
		pic[7][5] = "_";
		pic[7][6] = "_";
		pic[7][7] = "|";
		
		
		for (String[] row : pic) {
			for (String col : row){
				System.out.print(col);
			}
			System.out.print("\n");
		}
		
		
		
	}
	
}
