import java.util.Scanner;

public class TicTacToe {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		char board[][]= new char[3][3];
		System.out.println("Welcome to Tic Tac Toe!");
		fillBoard(board);
		printBoard(board);
		Scanner scan=new Scanner(System.in);
		char player= 'X';
		boolean game=true;
		while (game){
			System.out.println(player+" input your first coordinate.");
			int firstcoordinate=scan.nextInt();
			System.out.println("Now input your second coordinate.");
			int secondcoordinate=scan.nextInt();
			placePiece(board,player,firstcoordinate,secondcoordinate);
			printBoard(board);
			if (board[firstcoordinate][secondcoordinate]==player){
				if (checkWins(board)=='X'){
					System.out.println("X wins!");
					game=false;
				}
				if(checkWins(board)=='O'){
					System.out.println("O wins!");
					game=false;
				}
				if (player=='X'){
					player='O';
				}
				else {
					player='X';
				}
			}
			else{
			}
		}


	}
	public static char[][] fillBoard(char[][] board){
		for (int x=0;x<3;x++){
			for (int y=0;y<3;y++){
				board[x][y]='-';
			}
			System.out.println();
		}
		return board;
	}
	public static char[][] printBoard(char[][]board){
		for (int x=0;x<3;x++){
			for (int y=0;y<3;y++){
				System.out.print(board[x][y]);
			}
			System.out.println();
		}
		return board;
	}
	public static void placePiece(char[][]board, char player, int coordinate1, int coordinate2){
		if (board[coordinate1][coordinate2]=='X'||board[coordinate1][coordinate2]=='O'){
			System.out.println("Sorry, that space is taken.");

		}
		else{
			board[coordinate1][coordinate2]=player;
		}
	}
	public static char checkWins(char[][]board){
		for (int x=0;x<3;x++){
			for (int w=0;w<3;w++){
				//System.out.println(x);
				if (board[x][0]=='X'&&board[x][1]=='X'&&board[x][2]=='X'){
					return'X';
				}
				if (board[x][0]=='O'&&board[x][1]=='O'&&board[x][2]=='O'){
					return'O';
				}
				if (board[0][w]=='X'&&board[1][w]=='X'&&board[2][w]=='X'){
					return'X';
				}
				if (board[0][w]=='O'&&board[1][w]=='O'&&board[2][w]=='O'){
					return'O';
				}
			}
		}
		if (board[0][0]=='X'&&board[1][1]=='X'&&board[2][2]=='X'){
			return 'X';
		}
		if (board[0][0]=='O'&&board[1][1]=='O'&&board[2][2]=='O'){
			return 'O';
		}
		if (board[2][0]=='X'&&board[1][1]=='X'&&board[0][2]=='X'){
			return 'X';
		}
		if (board[2][0]=='O'&&board[1][1]=='O'&&board[0][2]=='O'){
			return 'O';
		}
		return ' ';
	}
}


