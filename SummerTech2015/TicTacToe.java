import java.util.Scanner;

public class TicTacToe {

	public static void main(String[] args){

		char[][] board= new char[3][3];

		boolean multiplegames=true;
		while (multiplegames==true){

			for (int w=0;w<3;w++){
				for (int x=0;x<3;x++){
					board [w][x]='-';
				}
			}
			for (int w=0;w<3;w++){
				for (int x=0;x<3;x++){
					System.out.print(board[w][x]);
				}
				System.out.println();
			}

			Scanner input =new Scanner (System.in);
			boolean game=true;
			while (game ==true){
				System.out.println("X, input your first coordinate.(row)");
				int firstnumberinput = input.nextInt();

				System.out.println("X, input your second coordinate.(column)");
				int secondnumberinput = input.nextInt();
				if (board[firstnumberinput][secondnumberinput]!=('-')){
					System.out.println("Oops! That spot is already taken!");
				}
				else if (board[firstnumberinput][secondnumberinput]==('-')){

					board [firstnumberinput][secondnumberinput]='X';
					for (int w=0;w<3;w++){
						for (int x=0;x<3;x++){
							System.out.print(board[w][x]);
						}
						System.out.println();
					}
				}
				for (int w=0; w<3;w++){
					if (board[w][0]=='X'&& board[w][1]=='X'&& board[w][2]=='X'){
						System.out.println("X Wins!");
						game=false;
					}
				}
				for (int x=0;x<3;x++){
					if(board[0][x]=='X'&& board [1][x]=='X'&& board[2][x]=='X'){
						System.out.println("X Wins!");
						game=false;
					}
				}
				if (board[0][0]=='X'&& board [1][1]=='X'&& board[2][2]=='X'){
					System.out.println("X Wins!");
					game=false;
				}
				if (board[0][2]=='X'&& board [1][1]=='X'&& board[2][0]=='X'){
					System.out.println("X Wins!");
					game=false;
				}
				boolean tie=true;
				while (tie==true){
					for (int w=0;w<3;w++){
						for (int x=0;x<3;x++){
							if (board[w][x]=='-'){
								tie=false;
							}
						}
					}
					if (tie==true){
						System.out.println("It's a tie!");
						game=false;
						tie=false;
					}
				}

				if (game==true){
					System.out.println("O, input your first coordinate.(row)");
					int firstnumberinputO=input.nextInt();

					System.out.println("O, input your second coordinate.(column)");
					int secondnumberinputO=input.nextInt();
					if (board[firstnumberinputO][secondnumberinputO]!=('-')){
						System.out.println("Oops!That spot is already taken!");
					}
					else if (board[firstnumberinputO][secondnumberinputO]==('-')){
						board[firstnumberinputO][secondnumberinputO]=('O');
						for (int w=0;w<3;w++){
							for (int x=0;x<3;x++){
								System.out.print(board[w][x]);
							}
							System.out.println();
						}
					}
					for (int w=0; w<3;w++){
						if (board [w][0]=='O'&& board[w][1]=='O'&& board [w][2]  =='O'){
							System.out.println("O Wins!");
							game=false;
						}
					}
					for (int x=0;x<3;x++){
						if (board [0][x]=='O'&& board [1][x]=='O'&& board [2][x]=='O'){
							System.out.println("O Wins!");
							game=false;
						}
					}
					if (board[0][0]=='O'&& board [1][1]=='O'&& board[2][2]=='O'){
						System.out.println("O Wins!");
						game=false;
					}
					if (board[0][2]=='O'&& board [1][1]=='O'&& board[2][0]=='O'){
						System.out.println("O Wins!");
						game=false;
					}
					boolean tieO=true;
					while (tieO==true){
						for (int w=0;w<3;w++){
							for (int x=0;x<3;x++){
								if (board[w][x]=='-'){
									tieO=false;
								}
							}
						}
						if (tieO==true){
							System.out.println("It's a tie!");
							game=false;
							tieO=false;
						}
					}
				}

			}
			System.out.println("Would you like to play again?");
			String endgame =input.next();

			if (endgame.equals("Yes")){
				multiplegames=true;
			}
			else if (endgame.equals("No")){
				multiplegames=false;
			}
		}
	}
}