package caveExplorer;

import java.util.Arrays;
import java.util.Iterator;

public class TwoDArraysIntro {

	public static void main(String[] args) {
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
		
		pic[0][2] = "v";
		pic[0][5] = "v";
		pic[1][6] = "v";
		
		pic[1][2] = "\\";
		pic[1][3] = "|";
		pic[1][4] = "/";
		pic[2][1] = "-";
		pic[2][2] = "-";
		pic[2][3] = "O";
		pic[2][4] = "-";
		pic[2][5] = "-";
		pic[3][4] = "\\";
		pic[3][3] = "|";
		pic[3][2] = "/";
		
		
		for (String[] row : pic) {
			for (String col : row){
				System.out.print(col);
			}
			System.out.print("\n");
		}
		
	}
	
}
