package arrays;

import java.util.Scanner;



public class Print2DBooleanArray {

	private static boolean[][] grid;
	public static Scanner in;
	
	public static void main (String[] args) {
	
		in = new Scanner(System.in);
		
		grid = new boolean[5][5];
		
		randomizeGrid(grid, 1);
		
		String[][] field = createField(grid);
		printField(field);
		System.out.println("--------------------");
		
		while(true){
			String input = in.nextLine();
			if (isValidSpace(grid, toGridSpace(input))) {
				int[] enteredSpace = toGridSpace(input);
				buttonClick(enteredSpace[0], enteredSpace[1]);
			}
			printField(createField(grid));
			if (checkIfAll(grid, false)) {
				System.out.println("You won.");
				System.exit(0);
			}
		}
//		buttonClick(3,3);
	}

	private static void randomizeGrid(boolean[][] grid, int num) {
		for (int i = 0; i < num; i++) {

			int row = (int)(Math.random() * grid.length);
			int col = (int)(Math.random() * grid[0].length);
			
			buttonClick(row, col);

		}
	}
	
	public static boolean checkIfAll(boolean[][] grid, boolean condition) {
		for (int i = 0; i < grid.length; i++) {
			for (int j = 0; j < grid[i].length; j++) {
				if (grid[i][j] != condition) {
					return false;
				}
			}
		}
		return true;
	}

	public static void buttonClick(int r, int c) {
		if (r >= 0 && r < grid.length) {
			switchRow(grid[r], c);
		}
		switchCol(grid, r, c);
	}
	
	private static void switchRow(boolean[] row, int x) {
		for (int i = -1; i < 2; i++) {
			if (x + i >= 0 && x + i < row.length) {
				row[x+i] = !row[x+i];
			}
		}
	}

	private static void switchCol(boolean[][] grid, int r, int c) {
		for (int i = -1; i < 2; i += 2) {
			if (r + i >= 0 && r + i < grid.length) {
				grid[r+i][c] = !grid[r+i][c];
			}
		}
	}

	static String[][] createField(boolean[][] arr) {
		String[][] field = new String[arr.length][arr[0].length];
		for (int row = 0; row < field.length; row++) {
			for (int col = 0; col < field[row].length; col ++) {
				if (arr[row][col]) {
					field[row][col] = "O";
				}
				else {
					field[row][col] = "X";
				}
			}
		}
		
		return field;
	}

	public static void printField(String[][] pic) {
		System.out.print("    ");
		for (int i = 0; i < pic[0].length; i++) {
			System.out.print(i+1 + " ");
			if (i<9) {
				System.out.print(" ");
			}
		}
		System.out.print("\n   ");
		for (int i = 0; i < pic[0].length; i++) {
			System.out.print("---");
		}
		System.out.print("\n");
		for (int i = 0; i < pic.length; i++) {
//			System.out.print(((char)(65 + i) + " | ").toString());
			System.out.print((toLtr(i) + " | ").toString());
			for (String col : pic[i]){
				System.out.print(col + "  ");
			}
			System.out.print("\n");
		}
	}
	
	public static char toLtr(int mC) {
		return (char) (65+mC);
	}
	
	public static int[] toGridSpace(String input) {
		char rowLtr = 0;
		input = input.toUpperCase();
		int count = 0;
		for (int i = 0; i < input.length(); i++) {
			if (((int)(input.charAt(i)) >= 65) && ((int)(input.charAt(i)) <= 90)) {
				rowLtr = input.charAt(i);
				break;
			}
		}
		
//		int numStart;
		int numStartIdx = -1;
		
		for (int i = 0; i < input.length(); i++) {
			if (((int)(input.charAt(i)) >= 49) && ((int)(input.charAt(i)) <= 57)) {
//				numStart = (int)(input.charAt(i));
				numStartIdx = i;
				break;
			}
		}
//		int numEnd;
		int numEndIdx = numStartIdx;
		for (int i = numStartIdx + 1; i < input.length(); i++) {
			if (!(((int)(input.charAt(i)) >= 48) && ((int)(input.charAt(i)) <= 57))) {
				break;
			}
			else {
				numEndIdx++;
			}
		}
		

		int rowNum = 0;
		if (rowLtr != 0) {
			rowNum = (int)(rowLtr - 65);
		}
		else {
			rowNum = -1;
		}
		
		int colNum = 0;
		if (numStartIdx != -1) {
			String colNumStr = input.substring(numStartIdx, numEndIdx + 1);
			colNum = Integer.parseInt(colNumStr);
		}
		else {
			colNum = -1;
		}
		
		return new int[] {rowNum, colNum - 1};
		
//		return ((rowLtr != 0) && (numStartIdx != -1));
//		return true;
		
	}
	
	static boolean isValidSpace(boolean[][] arr2D, int[] inArr) {
		int r = inArr[0];
		int c = inArr[1];
		
		if ((0 <= r) && (r < arr2D.length)) {
			if ((0 <= c) && (c < arr2D[0].length)) {
				return true;
			}
		}
		return false;
	}
	
}
