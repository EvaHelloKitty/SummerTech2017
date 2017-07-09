import java.util.Scanner;


public class Refresh {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		System.out.println("Hello World");
		System.out.println("Say 'Hello'");
		String hello = scan.next();
		if (hello.equals("Hello")){
			System.out.println("HELLO!");
			System.out.println("Put in a number...");
			double numb1 = scan.nextDouble();
			System.out.println("Put in another number...");
			double numb2 = scan.nextDouble();
			System.out.println("Now I, the computer, will add your numbers!");
			System.out.println(numb1 + numb2);
		}
		else{
			return;
		}
		
	}

}
