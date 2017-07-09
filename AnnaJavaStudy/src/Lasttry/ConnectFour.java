package Lasttry;

import java.util.Scanner;

public class ConnectFour {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		char[][] board = new char[6][7];
		fillBoard(board);
		boolean game=true;
		char player='X';
		Scanner scan= new Scanner (System.in);
		while (game){
			printBoard(board);
			System.out.println(player+ ", please input your column.");
			int column =scan.nextInt();
			placePiece(board,player,column);
			if (checkWins(board, player)==player){
				System.out.println(player+" wins!");
				game=false;
			}
			if (checkWins(board,player)=='T'){
				System.out.println("It's a tie!!!!!");
				game=false;
			}
			if (player=='X'){
				player='O';
			}
			else if (player=='O'){
				player='X';
			}
		}
	}
	public static char[][] fillBoard (char board[][]){
		for (int x=0;x<6;x++){
			for (int y=0;y<7;y++){
				board[x][y]='-';
			}
		}
		return board;
	}
	public static void printBoard (char board[][]){
		for (int x=0;x<6;x++){
			for (int y=0;y<7;y++){
				System.out.print(board[x][y]);
			}
			System.out.println();
		}
		
	}
	public static char[][] placePiece (char board[][], char player, int column){
		for (int x=5;x>=0;x--){
			if (board[x][column]=='-'){
				board[x][column]=player;
				break;
			}
		}
		return board;
	}
	public static char checkWins (char board[][], char player){
		//verticals
		for (int w=0;w<3;w++){
			for (int y=0;y<7;y++){
				if (board[w][y]==player&&board[w+1][y]==player&&board[w+2][y]==player&&board[w+3][y]==player){
					return player;
				}
			}
		}
		//horizontal
		for (int a=0;a<6;a++){
			for (int n=0;n<4;n++){
				if (board[a][n]==player){
					
				}
			}
		}
		//diagonals como asi \
		for (int w=0;w<3;w++){
			for (int x=0;x<4;x++){
				if (board[w][x]==player&&board[w+1][x+1]==player&&board[w+2][x+2]==player&&board[w+3][x+3]==player){
					return player;
				}
			}
		}
		//diagonals como asi /
		for (int e=2;e<6;e++){
			for (int r=3; r<7;r++){
				//if (board[e][r]==player&&board[e-1][r-1]==player&&board[e-2][r-2]==player&&board[e-3[r-3]==player){
					//return player;
				//}
			}
		}
	
		for (int w=5;w>=2;w--){
			for (int v=6;v>=3;v--){
				if (board[w][v]==player&&board[w-1][v-1]==player&&board[w-2][v-2]==player&&board[w-3][v-3]==player){
					return player;
				}
				if (board[w][v]==player&&board[w][v-1]==player&&board[w][v-2]==player&&board[w][v-3]==player){
					return player;
				}
				if (board[w][v]==player&&board[w-1][v]==player&&board[w-2][v]==player&&board[w-3][v]==player){
					return player;
				}
			}
		}
		int tie=0;
		for (int e=0;e<6;e++){
			for (int i=0;i<7;i++){
				if (board[e][i]!='-'){
					tie++;
				}
			}
		}
		if (tie==42){
			return 'T';
		}
		return ' ';
	}
}
