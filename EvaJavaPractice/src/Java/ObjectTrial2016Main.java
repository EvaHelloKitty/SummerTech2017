package Java;

import java.util.Scanner;

public class ObjectTrial2016Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		Scanner scan2 = new Scanner (System.in);
		
		String a = scan.nextLine();
		int b = scan2.nextInt();
		
		EvaObject char1 = new EvaObject(a); 
		
		char1.charAge(b);
		char1.printCharacter();
		
		//int s = scan2.nextInt();
		//for (int t=0; t<s+1; t++){
		//	String newchar[]=new String[s];
		//}
		
		
	}

}
