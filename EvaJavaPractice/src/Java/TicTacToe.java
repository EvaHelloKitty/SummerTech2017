package Java;
import java.util.Scanner;

public class TicTacToe {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner (System.in);
	
	String array[][] = new String[3][3];
	
	
	
	for (int i = 0; i < array[0].length; i++) {
		
		for (int j = 0; j < array.length; j++) {
			array[j][i]="[ ]";
			
		}
	}
		for (int i = 0; i< array[0].length; i++) {
			for (int j = 0; j < array.length; j++) {
				System.out.print(array[j][i]);
			}
			System.out.println();
		}
		
		System.out.println("Welcome to Tic-Tac-Toe");
		
		boolean gameplay =true;
		while (gameplay){
		System.out.println("Player one, please indicate the place where you want to put an 'x'");
		System.out.print("\nColumn: ");
		int x = scan.nextInt();
		System.out.print("Row: ");
		int y = scan.nextInt();
		System.out.println();
		if (x<array.length&&array[x][y].equals("[ ]")){
			array[x][y]="[X]"; 
		}
		
		for (int i = 0; i< array[0].length; i++) {
			for (int j = 0; j < array.length; j++) {
				System.out.print(array[j][i]);
			}
			System.out.println();
		}
		//Horizontal
		int g = 0;
		for (int k=0;k<array[0].length; k++){
			for (int i=0; i<array.length; i++){
				if (array[i][k].equals("[X]")){
					g++;
				}
				else{
					g=0;
				}
			}
			if (g==3){
				System.out.println("X has won!");
				return;
			}
			g=0;
		}
		//Verticle 
		int e = 0;
		for (int i=0;i<array.length; i++){
			for (int k=0; k<array[0].length; k++){
				if (array[i][k].equals("[X]")){
					e++;
				}
				else{
					e=0;
				}
				
			}
			if (e==3){
				System.out.println("X has won!");
				return;
			}
			e=0;
		}
		
		System.out.println("Player two, please indicate the place where you want to put an 'O'");
		System.out.print("\nColumn: ");
		int q = scan.nextInt();
		System.out.print("Row: ");
		int r = scan.nextInt();
		System.out.println();
		if (q<array.length&&array[q][r].equals("[ ]")){
			array[q][r]="[O]"; 
		}
		
		for (int i = 0; i< array[0].length; i++) {
			for (int j = 0; j < array.length; j++) {
				System.out.print(array[j][i]);
			}
			System.out.println();
		}
		
		
		}
   }
}
