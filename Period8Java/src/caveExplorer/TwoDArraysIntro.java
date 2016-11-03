package caveExplorer;

import java.util.Arrays;
import java.util.Scanner;
import java.util.Iterator;

public class TwoDArraysIntro {

	static String[][] arr2D;
	static int starti;
	static int startj;
	
	static Scanner in = new Scanner(System.in);
	
	public static void main(String[] args) {
		
//		boolean[][] mines = new boolean[20][100];
//		plantMines(mines);
//		
//		String[][] field = createField(mines);
//		
//		String[][] grid = newGrid(4, 5);
		
//		printPic(grid);
		
		 arr2D = new String[5][5];
		 for (int row = 0; row < arr2D.length; row++) {
			for (int col = 0; col < arr2D[row].length; col++) {
				arr2D[row][col] = "(" + row + ", " + col + ")";
			}
		 }
		 
		 starti = 2;
		 startj = 2;
		 
		 startExploring();
		
	}

	private static void startExploring() {
		while(true) {
			System.out.println("You are in room " + arr2D[starti][startj] + ".");
			System.out.println("What do you want to do?");
			
			String input = in.nextLine();
			int[] newCoordinates = interpretInput(input);
			starti = newCoordinates[0];
			startj = newCoordinates[1];
		}
	}

	private static int[] interpretInput(String input) {
		
		return null;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	

	private static String[][] newGrid(int i, int j) {
		int height = 3*i + 1;
		int width = 4*j + 1;
		
		String[][] arr = new String[height][width];
		
		for (int k = 0; k < height; k++) {
			arr[k][0] = "|";
		}
		
		for (int k = 0; k < width; k++) {
			arr[0][k] = "_";
		}
		
		for (int a = 0; a < i; a++) {
			int topLeftY = (3 * a) + 1;
			for (int b = 0; b < j; b++) {
				int topLeftX = (4 * b) + 1;

				arr[topLeftY + 2][topLeftX] = "_";
				arr[topLeftY + 2][topLeftX + 1] = "_";
				arr[topLeftY + 2][topLeftX + 2] = "_";
				
				arr[topLeftY][topLeftX + 2] = "|";
				arr[topLeftY + 1][topLeftX + 2] = "|";
				arr[topLeftY + 2][topLeftX + 2] = "|";
//				arr[topLeftY + 3][topLeftX + 2] = "|";
				
//				arr[topLeftY][topLeftX] = "A";
			}
		}
		
		return arr;
	}

	private static void plantMines(boolean[][] mines) {
		int numMines = 1000;
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
		String[][] field = 
				new String[mines.length][mines[0].length];
		for(int row = 0; row < field.length; row++){
			for(int col = 0; col < field[row].length; col ++){
				if(mines[row][col])field[row][col]="X";
				else{
					field[row][col] = countNearby(mines,row,col);
				}
			}
		}
		
		
		return field;
	}

	
	
	
	
	
	
	
	

	private static String countNearby(boolean[][] mines, int row, int col) {
//		for(int r = row - 1; r <= row +1; r ++){
//			for(int c = col -1; c <= col+1; c++){
//				//check that this element exists
//				if(r >=0 && r < mines.length &&
//						c >=0 && c < mines[0].length){
//					
//				}
//			}
//		}
		
////		THIS METHOD ONLY CONSIDERS ACTUAL ELEMENTS
//		int count = 0;
//		for (int r = 0; r < mines.length; r++) {
//			for (int c = 0; c < mines[r].length; c++) {
//				if (Math.abs(r-row) + Math.abs(c-col) == 1 && mines[r][c]) {
//					count++;
//				}
//			}
//		}
//		return "" + count;
		
		
//		THIS METHOD ALLOWS YOU TO BE MOST SPECIFIC
//		FOR EXAMPLE, IF YOU ONLY WANT NORTH AND EAST
		int count = 0;
		count += isValidAndTrue(mines, row-1, col);
		count += isValidAndTrue(mines, row+1, col);
		count += isValidAndTrue(mines, row, col-1);
		count += isValidAndTrue(mines, row, col+1);
		
		
		
		return ""+count;
	}


	

	private static int isValidAndTrue(boolean[][] mines, int i, int j) {
		if (i >= 0 && i < mines.length && j >= 0 && j < mines[0].length && mines[i][j]) {
			return 1;
		}
		return 0;
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
