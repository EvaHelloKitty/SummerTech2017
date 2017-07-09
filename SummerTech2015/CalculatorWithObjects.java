import java.util.Scanner;

public class CalculatorWithObjects {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scan= new Scanner(System.in);
		System.out.println("Welcome to the Calculator! Please input your first number.");
		int firstNumber=scan.nextInt();
		
		System.out.println("Please input your second number.");
		int secondNumber=scan.nextInt();
		
		System.out.println("Please enter your opperation.");
		String opperation=scan.next();
		
		if (opperation.equals("+")){
			System.out.println(FunctionsForCalculator.add(firstNumber, secondNumber));
		}
		if (opperation.equals("-")){
			System.out.println(FunctionsForCalculator.subtract(firstNumber,secondNumber));
		}
		if (opperation.equals("*")){
			System.out.println(FunctionsForCalculator.multiply(firstNumber,secondNumber));
		}
		if (opperation.equals("/")){
			System.out.println(FunctionsForCalculator.divide(firstNumber, secondNumber));
		}
	}

}
