package Java;

import java.util.Scanner;

public class idk {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for (int h=0; h<9; h++){
				for (int j=9-h; j>0; j--){
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
		//System.out.println("HI");
		for (int k=0;k<9;k++){
			for (int l=-1; l<k; l++){
				System.out.print(" ");
			}
			for (int m=9-k; m>0; m--){
				System.out.print("*");
			}
			for (int m=9-k; m>1; m--){
				System.out.print("*");
			}
			System.out.println();
		}
	}

}
