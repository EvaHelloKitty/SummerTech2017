
public class Square extends Rectangle{

	public static void main (String[] args){
		Square newSquare= new Square(){
			public int getSides(){
				return 8;
			}
		};
		System.out.println(newSquare.getSides());
	}
	public int getSides (){
		return 7;
	}
	
}
