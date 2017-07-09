import java.util.Scanner;


public class AnnaFun {

	public AnnaFun() {
		// TODO Auto-generated constructor stub
	}
	public static void main(String[] args) {
		System.out.println("HELLO WORLD! HAHAHAHAHAHAHHAHAHA!!!!!");
		boolean ready=true;
		while (ready==true){
			System.out.println("Are you ready for this?");
			Scanner scan=new Scanner(System.in);
			String response=scan.next();
			if (response.equals("YES!")){
				System.out.println("LET'S DO IT!");
				ready=false;
			}
			else{
				System.out.println(":P");
			}
		}
	}
}
