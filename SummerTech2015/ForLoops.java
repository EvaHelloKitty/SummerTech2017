import java.util.Scanner;
public class ForLoops {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
Scanner scan=new Scanner(System.in);
int whatever=scan.nextInt();
for (int i=0;i<whatever+1;i++){
	
	for (int u=0;u<i;u++){
		System.out.print("* ");
	}
	System.out.println();
}
	}

}
