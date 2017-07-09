import java.util.Scanner;


public class MysteryTown {

	public MysteryTown() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		char player='*';
		char currentLocationX = [5][];
		int
		town[curentlocationX]='*';
		char[][] town = createTown(player);
		printTown(town);
		
		System.out.println("Sheriff: Welcome to Bakersville, the friendliest town you'll ever know.\nLately it hasn't been so friendly, though...\nin fact, a murder has just been commited!\n");
		System.out.println("That's why you are here, ain't it? You're a detective?");
		
		System.out.print("Units Up: ");
		int up = scan.nextInt();
		if (up==0){
			[x-up]
		}
		System.out.print("Units Down: ");
		int down = scan.nextInt();
		
		
	}
	
	public static char[][] createTown(char player){
		char [][] town = new char [6][6];
		for (int x=0; x<6; x++){
			for (int y=0; y<6; y++){
				town [x][y]='-';
				town [0][0]='H';
				town [2][0]='G';
				town [4][0]='L';
				town [0][5]='T';
				town [2][5]='C';
				town [4][5]='J';
				town [5][0]=player;
			}
		}
		
		return town;
		
	}
	
	public static void printTown(char[][] town){
		for (int x=0; x<6; x++){
			for (int y=0; y<6; y++){
				System.out.print(town[x][y]);
			}
			System.out.println();
		}
	}
	
	public static char movePlayer(char[][] town, int x, int y, char u){
		town[x][y]=u;
		
	}
	
	//public static void placePiece(char [][] board, int x, int y, char u){
	//	board[x][y]=u;
	//}

}
