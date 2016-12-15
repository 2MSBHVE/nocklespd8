package arrays;

public class ArrayAccess {

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

}
