package Java;

import java.util.Scanner;

public class TrialProblem {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scan = new Scanner(System.in);
		System.out.println("What is Eva's first name?");
		String firstname = scan.nextLine();
		if (firstname.equals("Eva")){
			System.out.println("CORRECT");
		}
		System.out.println("What is Eva's full name?");
		String fullname = scan.nextLine();
		if (fullname.equals("Eva Henderson")){
			System.out.println("CORRECT");
		}
		else{
			System.out.println("INCORRECT");
		}
	}

}
