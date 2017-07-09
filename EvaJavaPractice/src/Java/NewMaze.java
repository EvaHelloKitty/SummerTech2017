package Java;

import java.util.Scanner;

public class NewMaze {

	public static void walls(String newMaze[][]){
		//These statements control where the walls and player appear
		newMaze[0][0]="[*]";
		newMaze[3][2]="[F]";
		newMaze[9][9]="[S]";
		newMaze[0][1]="[@]";
		newMaze[1][1]="[@]";
		newMaze[2][1]="[@]";
		newMaze[3][1]="[@]";
		newMaze[4][1]="[@]";
		newMaze[4][2]="[@]";
		newMaze[4][3]="[@]";
		newMaze[4][4]="[@]";
		newMaze[4][5]="[@]";
		newMaze[4][6]="[@]";
		newMaze[4][7]="[@]";
		newMaze[7][1]="[@]";
		newMaze[8][1]="[@]";
		newMaze[9][1]="[@]";
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scan = new Scanner (System.in);

		String newMaze[][]= new String [10][10];
		int x=0, y=0;

		//This for loop sets up the maze
		for (int i = 0; i < newMaze[0].length; i++) {
			for (int j = 0; j < newMaze.length; j++) {
				newMaze[j][i]="[ ]";
			}
		}
		//This method is called to put the walls/player in the maze
		walls(newMaze);

		//This for loop prints out the maze
		for (int i = 0; i < newMaze[0].length; i++) {
			for (int j = 0; j < newMaze.length; j++) {
				System.out.print(newMaze[j][i]);
			}
			System.out.println();
		}


		while(true){
			System.out.println("Enter direction { r,l,d,u }");
			String dir = scan.nextLine();

			//Right
			if (dir.equals("r")){
				if(dir.equals("r")&&x<newMaze.length-1&&newMaze[x+1][y].equals("[ ]")){
					newMaze[x][y]="[ ]";
					x++;
					newMaze[x][y]="[*]";
				}
					if (newMaze[x][y]==("[F]")){
						System.out.println("You have reached the end!");

					}
					else if (newMaze[x][y]==("[S]")){
						System.out.println("You have fallen in the snake pit.\nFAIL.");
						continue;
					}
				
			}

			//Left
			else if (dir.equals("l")){
				if(dir.equals("l")&&x>0&&newMaze[x-1][y].equals("[ ]")){
					newMaze[x][y]="[ ]";
					x--;
					newMaze[x][y]="[*]";
				}
				if (newMaze[x][y]==("[F]")){
					System.out.println("You have reached the end!");

				}
			}
			
			//Down
			else if (dir.equals("d")){
				if (dir.equals("d")&&y<newMaze[0].length-1&&newMaze[x][y+1].equals("[ ]")){
				newMaze[x][y]="[ ]";
				y++;
				newMaze[x][y]="[*]";
				}
				if (newMaze[x][y]==("[F]")){
					System.out.println("You have reached the end!");

				}
			}
			
			//Up
			else if (dir.equals("u")){
				if (dir.equals("u")&&y>0&&newMaze[x][y-1].equals("[ ]")){
				newMaze[x][y]="[ ]";
				y--;
				newMaze[x][y]="[*]";
				}
				else if (dir.equals("u")&&newMaze[x][y-1]==("[F]")){
					System.out.println("You have reached the end!");
					return;

				}
			}
		
			else{
				System.out.println("Invalid Direction.");
			}

		for (int i = 0; i < newMaze[0].length; i++) {
			for (int j = 0; j < newMaze.length; j++) {
				System.out.print(newMaze[j][i]);
			}
			System.out.println();
		}


		}

	}




}


