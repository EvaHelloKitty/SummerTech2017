package Java;

import java.util.Scanner;

public class ForLoopClassWork {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner (System.in);
		int max = scan.nextInt();
		for (int h=0; h<max+1; h++){
				for (int j=max-h; j>0; j--){
					System.out.print(" ");
				}
				for (int i=0; i<h; i++){
					System.out.print("*");
				}
				for (int i=-1; i<h; i++){
					System.out.print("*");
				}
				
				System.out.println();
		
		}
		
		
		
		for (int k=0;k<max+1;k++){
			for (int l=0; l<k; l++){
				System.out.print(" ");
			}
			for (int m=max-k; m>0; m--){
				System.out.print("*");
			}
			for (int m=max-k; m>-1; m--){
				System.out.print("*");
			}
			System.out.println();
		}
		
		
	}
	
}
