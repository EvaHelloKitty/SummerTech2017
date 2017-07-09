import st.Prompt;


public class TicTacToe {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		char [][] a = new char [3][3];

		for (int b=0; b<3; b++){
			for (int c=0; c<3;c++){
				a[b][c]=' ';	
			}
		}
		x(a);

		while (d(a)==2){

			while (true){
				int k=Prompt.getInt("Player X please enter your first coordinate (rows)");
				int l= Prompt.getInt("Great, Player X, please enter your second coordinate (collums)");
				if (a[k][l]==' '){
					a[k][l]='x';
					x(a);
					if (d(a)==0){
						System.out.println("Player X Wins!!!");
						System.exit(0);
					}
					if (d(a)==3){
						System.out.println("It's a tie!");
					}
					break;
				}
			}

			while (true){
				int m=Prompt.getInt("Player O please enter your first coordinate (rows)");
				int n= Prompt.getInt("Great, Player O, please enter your second coordinate (collums)");
				if (a[m][n]==' '){
					a[m][n]='o';
					x(a);
					if (d(a)==1){
						System.out.println("Player O Wins!!!");
					}
					break;
				}
			}
		}


		}


		public static void x (char [][] c){

			System.out.println(c[0][0]+"|"+ c[0][1]+"|"+c[0][2]);
			System.out.println("-----");
			System.out.println(c[1][0]+"|"+ c[1][1]+"|"+c[1][2]);
			System.out.println("-----");
			System.out.println(c[2][0]+"|"+ c[2][1]+"|"+c[2][2]+"\n");


		}

		public static int d (char [][] a){

			for (int e=0; e<3; e++){
				if (a[0][e]=='x' && a[1][e]=='x' && a[2][e]=='x'){
					return 0;
				}

				if (a[e][0]=='x' && a[e][1]=='x' && a [e][2]=='x'){
					return 0;
				}

				if (a[0][e]=='o' && a[1][e]=='o' && a[2][e]=='o'){
					return 1;
				}

				if (a[e][0]=='o' && a[e][1]=='o' && a [e][2]=='o'){
					return 1;
				}
			}

			//Diagonals
			if (a[0][0]=='x' && a[1][1]=='x' && a[2][2]=='x'){
				return 0;
			}
			if (a[0][2]=='x' && a[1][1]=='x' && a[2][0]=='x'){
				return 0;
			}

			if (a[0][0]=='o' && a[1][1]=='o' && a[2][2]=='o'){
				return 1;
			}
			if (a[0][2]=='o' && a[1][1]=='o' && a[2][0]=='o'){
				return 1;
			}

			for (int f=0;f<3;f++){
				for (int g=0; g<3;g++){
					if (a[f][g]==' '){
						return 2;
					}
				}
			}
			return 3;
		}

	}
