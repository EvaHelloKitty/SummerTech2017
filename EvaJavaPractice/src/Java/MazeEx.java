package Java;
import java.util.*;

public class MazeEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner (System.in);

		String maze[][]= new String[3][3];
		for (int i = 0; i < maze[0].length; i++) {
			for (int j = 0; j < maze.length; j++) {
				maze[j][i]="[ ]";
			}
		}
		maze[0][0]="[*]"; int x=0,y=0;
		maze[maze.length-1][maze.length-1]="[F]";
		//maze[0][1]="[-]";
		maze[1][1]="[-]";
		for (int i = 0; i < maze[0].length; i++) {
			for (int j = 0; j < maze.length; j++) {
				System.out.print(maze[j][i]);
			}
			System.out.println();
		}
		while(true){
			System.out.println("Enter direction");
			String dir = scan.nextLine();
			if (dir.equals("right")){
				if(dir.equals("right")&&x<maze.length-1&&maze[x+1][y].equals("[ ]")){
					maze[x][y]="[ ]";
					x++;
					maze[x][y]="[*]";
					if (maze[x][y]==("[F]")){
						System.out.println("You have reached the end!");

					}
				}
			}
			else if (dir.equals("left")){
				if(dir.equals("left")&&x>0&&maze[x-1][y].equals("[ ]")){
					maze[x][y]="[ ]";
					x--;
					maze[x][y]="[*]";	
				}
				else if (maze[x][y]==("[F]")){
					System.out.println("You have reached the end!");

				}
			}
			else if (dir.equals("down")){
				if(dir.equals("down")&&y<maze[0].length-1&&maze[x][y+1].equals("[ ]")){
					maze[x][y]="[ ]";
					y++;
					maze[x][y]="[*]";	
				}
				else if (dir.equals("down")&&maze[x][y+1]==("[F]")){
					maze[x][y]="[ ]";
					y++;
					maze[x][y]="[*]";
					for (int i = 0; i < maze[0].length; i++) {
						for (int j = 0; j < maze.length; j++) {
							System.out.print(maze[j][i]);
						}
						System.out.println();
					}
					System.out.println("You have reached the end!\nYAY!!!!");
					return;

				}
			}

			else if (dir.equals("up")){
				if(dir.equals("up")&&y>0&&maze[x][y-1].equals("[ ]")){
					maze[x][y]="[ ]";
					y--;
					maze[x][y]="[*]";	

				}
				else if (dir.equals("up")&&maze[x][y]==("[F]")){
					System.out.println("You have reached the end!");

				}
			}



			for (int i = 0; i < maze[0].length; i++) {
				for (int j = 0; j < maze.length; j++) {
					System.out.print(maze[j][i]);
				}
				System.out.println();
			}
		}

		//		}
	}
}

