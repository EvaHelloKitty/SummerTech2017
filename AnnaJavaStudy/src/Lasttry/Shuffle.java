package Lasttry;


import java.util.Random;

public class Shuffle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] deck= {1,2,3,4,5,6,7,8,9,10};

		Random rand= new Random();
		int[] otherArray = new int [10];
		//System.out.println(rand.nextInt(10));
		for (int z=0;z<10;z++){
			boolean x=false;
			int w=0;
			while (!x){
				w=rand.nextInt(10);
				x=true;
				for(int t=0;t<10;t++){
					if (otherArray[t]==deck[w]){
						x=false;
					}
					
				}
				
			}
			otherArray[z]=deck[w];
		}
		for (int z=0;z<10;z++){
			System.out.println(otherArray[z]);
		}
	}
}


