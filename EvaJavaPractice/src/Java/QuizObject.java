package Java;

public class QuizObject {

	private int points;
	
	public QuizObject(){
		this.points= points;
		points=0;
		
	}
		
		public int getPoints(){
			return points;
		}
		public void win(){
			points+=200;
			System.out.println("----------------------------------");
			System.out.println("You Earned Points! :)");
			System.out.println("You now have " + points + " points");
			System.out.println("----------------------------------");
		}
		public void lose(){
			points-=50; 
			System.out.println("----------------------------------");
			System.out.println("You Lost Points! :(");
			System.out.println("You now have " + points + " points");
			System.out.println("----------------------------------");
		}
		
		
	
	
	
	
}
