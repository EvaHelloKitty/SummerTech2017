import java.util.Scanner;

public class ConnectFour {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		char[][] board = new char[6][8];


		Scanner input=new Scanner (System.in);
		board= fillBoard (board);
		printBoard(board);
		char player='X';
		System.out.println("Welcome to Connect Four!");
		boolean game=true;
		while (game==true){
			System.out.println(player+", please input your column.");
			int column= input.nextInt();
			board = placePiece(board, player, column);
			printBoard(board);
			checkWins(board);
			if (checkWins(board)==player){
				System.out.println(player+" Wins!");
				game=false;
			}
			if (checkWins(board)=='T'){
				System.out.println("It's a tie!");
				game=false;
			}
			if (player=='X'){
				player='O';
			}
			else if (player=='O'){
				player='X';
			}
			if (game==false){
				System.out.println("Would you like to play again?");
				String playAgain=input.next();
				if (playAgain.equals("Yes")){
					board=fillBoard(board);
					game=true;
					
				}
				else{
					game=false;
				}
			}
		}
	}

	public static void printBoard (char[][] board){

		for (int w=5;w>=0;w--){
			for (int x=0;x<8;x++){
				System.out.print(board[w][x]+" ");
			}
			System.out.println();
		}
	}

	public static char[][] placePiece (char[][]board, char player, int column){

		for (int x=0;x<6;x++){
			if (board[x][column]=='-'){
				board[x][column]=player;
				return board;
			}
		}
		return board;
	}

	public static char[][] fillBoard(char[][]board){
		for (int w=0;w<6;w++){
			for (int x=0;x<8;x++){
				board [w][x]=('-');
			}
		}
		return board;
	}
	public static char checkWins(char[][]board){
		for (int x=0;x<6;x++){
			for (int w=0;w<4;w++){
				if (board[x][w]=='X'&&board[x][w+1]=='X'&&board[x][w+2]=='X'&&board[x][w+3]=='X'){
					return 'X';
				}
				if (board[x][w]=='O'&&board[x][w+1]=='O'&&board[x][w+2]=='O'&&board[x][w+3]=='O'){
					return 'O';
				}
			}
		}
		for (int x=0;x<3;x++){
			for (int w=0;w<8;w++){
				if (board [x][w]=='X'&&board[x+1][w]=='X'&&board[x+2][w]=='X'&&board[x+3][w]=='X'){
					return 'X';
				}
				if (board [x][w]=='O'&&board[x+1][w]=='O'&&board[x+2][w]=='O'&&board[x+3][w]=='O'){
					return 'O';
				}
			}

		}
		for (int x=0;x<3;x++){
			for (int w=0;w<4;w++){
				if (board[x][w]=='X'&&board[w+1][x+1]=='X'&&board[w+2][x+2]=='X'&&board[w+3][x+3]=='X'){
					return 'X';
				}
				if (board[x][w]=='O'&&board[w+1][x+1]=='O'&&board[w+2][x+2]=='O'&&board[w+3][x+3]=='O'){
					return 'O';
				}
			}
		}
		for (int x=0;x<6;x++){
			for (int w=3;w<8;w++){
				if (board[x][w]=='X'&&board[x+1][w-1]=='X'&&board[x+2][w-2]=='X'&&board[x+3][w-3]=='X'){
					return 'X';
				}
				if (board[x][w]=='O'&&board[x+1][w-1]=='O'&&board[x+2][w-2]=='O'&&board[x+3][w-3]=='O'){
					return 'O';
				}
			}
		}
		boolean tie=true;
		for (int x=0;x<6;x++){
			for (int w=0;w<8;w++){
				if (board[x][w]=='-'){
					tie=false;
				}
			}
		}
		if (tie==true){
			return 'T';
		}

		return '-';
	}
}
