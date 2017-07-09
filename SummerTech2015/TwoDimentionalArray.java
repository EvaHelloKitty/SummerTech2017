
public class TwoDimentionalArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		int[][] array=new int[3][2];
		
		
		for (int w=0;w<3;w++){
			for (int x=0;x<2;x++){
				array[w][x]=0;
				
			}
		}
		for (int w=0;w<3;w++){
			for (int x=0;x<2;x++){
				System.out.print(array[w][x]);
			}
			System.out.println();
		}
		

	}

}
