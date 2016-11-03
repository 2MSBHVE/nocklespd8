package twoDArraysDraft;
import java.nio.file.attribute.UserPrincipalLookupService;
import java.util.Scanner;

public class Connect4 {
	
static String[] playerPieces = {"O", "X"};
static Scanner playerIn = new Scanner(System.in);
	
public static void main(String[] args) {
		String[][] board;
		board = createBoard(6,8);
		printPic(createBoard(6,8));
		
		while (true) {
			int userInput = -1;
			while (userInput < 0 || board[0].length < userInput) {
				userInput = playerIn.nextInt();
			}
			addPiece(board, userInput, 0);
		}
	}
private static String[][] createBoard(int rows, int cols){
	int width = 2*cols - 1;
	int height = rows;
	
	String[][] newBoard = new String[height][width];
//	for (int i = 0; i < width; i++) {
//		newBoard[i][0] = "|";
//	}
	
	for (int i = 0; i < newBoard.length; i++) {
		for (int j = 0; j < newBoard[i].length; j++) {
			newBoard[i][j] = " ";
		}
	}
	
	for (int i = 0; i < cols; i++) {
		int x = 1+2*i;
		for (int j = 0; j < rows; j++) {
			if(x < width){
				newBoard[j][x] = "|";
			}
		}
		
	}
	return newBoard;
}
	private static int columnAmt(String[][] board, int i) {
		String [] col = new String[board.length];
		for (int j = 0; j < board.length; j++) {
			col[j] = board[i][j];
		}
		int count = 0;
		for (int j = 0; j < col.length; j++) {
			if(col[j] !=" "){
				count++;
				
			}
			
		}
		return count;
	}
	
	private static void addPiece(String [][] board, int col, int player){
		if (columnAmt(board, col) != board.length) {
			board[col][columnAmt(board, col)] = playerPieces[player];
		}else{
			System.out.println("Column full.");
		}
	}
	public static void printPic(String[][] pic) {
		for (String[] row : pic) {
			for (String col : row){
				System.out.print(col);
			}
			System.out.print("\n");
		}
	}

	
	
}
