package Lasttry;

import java.util.Scanner;

public class ifStatementPractice {
	
	public static void main (String[]args){
		Scanner scan = new Scanner(System.in);
		String input= scan.next();
		if (input.equals("Hi")||input.equals("hi")){
			System.out.println("What EVEN?");
		}
		String cookie= scan.next();
		if (cookie.equals("COOKIE")&&input.equals("Hi")){
			System.out.println("O_o");
		}
		System.out.println("Please input your first number.");
		int first= scan.nextInt();
		System.out.println("Please input your second number.");
		int second= scan.nextInt();
		System.out.println("What function would you like to perform?");
		String function =scan.next();
		if (function.equals("add")||function.equals("+")){
			int answer= first+second;
			System.out.println("Answer: "+answer);
		
		String [] ummm= new String[5];
		for (int x=0;x<5;x++){
			ummm[x]="Yay!";
			System.out.println(ummm[x]);
		}
		String [] fun = new String[5];
		fun[2]= "COOKIE";
		for (int x=0;x<5;x++){
		System.out.println(fun[x]);
		}
	}

}
}
