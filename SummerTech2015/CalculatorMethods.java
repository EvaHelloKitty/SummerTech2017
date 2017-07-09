import java.util.Scanner;

public class CalculatorMethods {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner input=new Scanner (System.in);
		System.out.println("Welcome to the Calculator! Please input your first number?");
		int firstNumberInput=input.nextInt();

		System.out.println("Now, enter your second number.");
		int secondNumberInput=input.nextInt();

		System.out.println("Which opperation would you like to perform?");
		String opperation=input.next();

		if (opperation.equals("+")){
			System.out.println(add(firstNumberInput, secondNumberInput));
		}
		else if (opperation.equals("-")){
			System.out.println(subtract(firstNumberInput, secondNumberInput));
		}
		else if (opperation.equals("*")){
			System.out.println(multiply(firstNumberInput, secondNumberInput));
		}
		else if (opperation.equals("/")){
			System.out.println(divide(firstNumberInput, secondNumberInput));
		}
	}
	public static int add(int firstnumber, int secondnumber){
		return firstnumber+secondnumber;
	}
	public static int subtract(int firstnumber, int secondnumber){
		return firstnumber-secondnumber;
	}
	public static int multiply(int firstnumber, int secondnumber){
		return firstnumber*secondnumber;
	}
	public static int divide(int firstnumber, int secondnumber){
		return firstnumber/secondnumber;
	}

}
