package Java;

import java.util.Scanner;

public class ShopppingList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String [] list= new String[3];
		int x=3;
		Scanner hi = new Scanner (System.in);
		while (x==3){
			System.out.println("Please add a item to your list.");
			String newItem =hi.next();
			for (int y=0;y<3;y++){
				if (list[y]==null){
					list[y]= newItem;
					break;
				}
			}
			if (list[2]!=null){
				x=5;
			}
		}
		for (int y=0;y<3;y++){
			System.out.println(list[y]);
		}
	}

}
