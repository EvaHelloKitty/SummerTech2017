import java.util.Scanner;


public class ConnectFourPractice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		char board [][]= new char[6][8];
		fillBoard(board);
		printBoard(board);
		System.out.println("Welcome to Connect Four!");
		Scanner input= new Scanner (System.in);
		char player= 'X';
		boolean game=true;
		while (game==true){
			System.out.println(player+" please input your collum.");
			int collum=input.nextInt();
			placePiece(board, collum, player);
			printBoard(board);
			checkWins(board);
			if (checkWins(board)==player){
				System.out.println(player+" wins!");
				game=false;
			}
			if (checkWins(board)=='T'){
				System.out.println("It's a tie!");
				game=false;
			}
			if (player=='X'){
				player='O';
			}
			if (player=='O'){
				player='X';
			}
			if (game==false){
				System.out.println("Do you want to play again?");
				String playAgain=input.next();
				if (playAgain=="Yes"){
					fillBoard(board);
					game=true;
				}
				if (playAgain=="No"){
					game=false;
				}
			}
		}

	}
	public static char[][] fillBoard(char[][]board){
		for (int w=0;w<6;w++){
			for (int x=0; x<8;x++){
				board [w][x]='-';
			}
		}
		return board;
	}
	public static void printBoard (char[][]board){
		for (int w=5;w>=0;w--){
			for (int x=0; x<8;x++){
				System.out.print(board[w][x]+ " ");
			}
			System.out.println();
		}
	}
	public static char[][] placePiece (char[][]board, int collum, char player){
		for (int w=0;w<6;w++){
			if (board[w][collum]=='-'){
				board[w][collum]=player;
				return board;
			}
		}
		return board;
	}
	public static char checkWins (char[][]board){
		for (int w=0;w<6;w++){
			for (int x=0;x<4;x++){
				if (board[w][x]=='X'&&board[w+1][x]=='X'&&board[w+2][x]=='X'&&board[w+3][x]=='X'){
					return 'X';
				}
				if (board[w][x]=='O'&&board[w+1][x]=='O'&&board[w+2][x]=='O'&&board[w+3][x]=='O'){
					return 'O';
				}
				if (board[w][x]=='X'&&board[w][x+1]=='X'&&board[w][x+2]=='X'&&board[w][x+3]=='X'){
					return 'X';
				}
				if (board[w][x]=='O'&&board[w][x+1]=='O'&&board[w][x+2]=='O'&&board[w][x+3]=='O'){
					return 'O';
				}
			}
		}
		for (int w=3;w<6;w++){
			for (int x=0;x<4;x++){
				if (board[w][x]=='X'&&board[w+1][x+1]=='X'&&board[w+2][x+2]=='X'&&board[w+3][w+3]=='X'){
					return 'X';
				}
				if (board[w][x]=='O'&&board[w+1][x+1]=='O'&&board[w+2][x+2]=='O'&&board[w+3][w+3]=='O'){
					return 'O';
				}
			}
		}
		for (int w=0;w<3;w++){
			for (int x=0;x<3;x++){
				if (board[w][x]=='X'&&board[w-1][x+1]=='X'&&board[w-2][x+2]=='X'&&board[w-3][w+3]=='X'){
					return 'X';
				}
				if (board[w][x]=='O'&&board[w-1][x+1]=='O'&&board[w-2][x+2]=='O'&&board[w-3][w+3]=='O'){
					return 'O';
				}
			}
		}
		boolean tie=true;
		for (int w=0;w<6;w++){
			for (int x=0;x<8;x++){
				if (board[w][x]=='-'){
					tie=false;
				}
			}
		}
		if (tie==true){
			return 'T';
		}
		return'-';
	}
}
