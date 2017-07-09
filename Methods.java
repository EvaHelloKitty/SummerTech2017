import st.Prompt;


public class Methods
{
	public static void printHouse (){
		for (int e= 0; e < 19; e++){

			for (int a= 0; a < 19; a++){
				if ((a<=9-e||a>=9+e||a==0||a==18||e==18|| 6<a&&a<12&&e>=13|| 2<a&&a<5&&(e==12||e==13)||13<a&&a<16&&(e==12||e==13))){
					System.out.print("* " );	
				}
				else {
					System.out.print("  ");
				}
			}
			System.out.println();
		}
	}
	public static int addNumbers(int a, int b ){
		return a + b; 
	}
	public static boolean equals (int a, int b){
		if (a==b){
			return true;
		}

		return false;
	}
	public static void main(String[] args){
		
		printHouse();

		int numb1 = Prompt.getInt("Insert One Number.");
		int numb2 = Prompt.getInt("Insert Another Number.");

		System.out.println(addNumbers(numb1, numb2));

		if (equals(numb1, numb2)){
			System.out.println("The Numbers are equal!");
		}

		else{
			System.out.println("The numbers are not equal!");
		}








	}
}
