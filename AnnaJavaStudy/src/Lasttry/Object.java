package Lasttry;


import java.util.Scanner;

public class Object {

	public static void main(String[] args){

		Scanner scan=new Scanner(System.in);
		//System.out.print(addition(3,4));
		arrays();
		boolean adder= true;
		while (adder==true){
			System.out.println("Please input your first number.");
			int firstnumber= scan.nextInt();
			System.out.println("Now input your second number.");
			int secondnumber= scan.nextInt();
			System.out.println(addition(firstnumber,secondnumber));
			System.out.println("Would you like to calculate more sums?");
			String again= scan.next();
			if (again.equals("Yes")){
				adder=true;
			}
			if (again.equals("No")){
				adder=false;
			}
		}

	}
	public static int addition (int number, int number2){
		return number + number2;
	}
	public static void arrays(){
		Scanner petScanner= new Scanner(System.in);
		String array[]= new String[2];
		array[0]="dog";
		System.out.println("Please input an animal.");
		String animal= petScanner.nextLine();
		array[1]=animal;
		for (int x=0;x<2;x++){
			System.out.println(array[x]);
		}

		char box[][]= new char[4][4];
		for (int x=0;x<4;x++){
			for (int w=0;w<4;w++){
				box[x][w]='*';
				System.out.print(box[x][w]);
			}
			System.out.println();
		}
	}

}
