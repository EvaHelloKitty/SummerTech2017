package Java;

import java.util.Scanner;

public class WhileLoop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner (System.in);
		boolean SummerTech = true;
		while (SummerTech){
			System.out.println("Say HELLO (to stop the program)!");
			String input = scan.nextLine();
			if (input.equals("HELLO")){
				SummerTech=false;
			}
			else{
				continue;
			}
		}
		
		
		
	}

}
