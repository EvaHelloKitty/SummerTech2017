package Java;

public class Player {
	
	private int health;
	private int exp;
	private int healthinessLevel;
	private int maxHealth;
	private int level;
	
	public Player(int health){
		this.health = health; 
		maxHealth = health;
		exp= 0;
		level=1;
	}
	
	public int getExp(){
		return exp;
	}
	public int getHealth(){
		return health;
	}
	public void win(){
		exp+=200/level;
		if (exp>=500){
			System.out.println("You leveled up! Congrats!");
			level++;
			exp=0;
			maxHealth+=2;
			health=maxHealth;
			System.out.println("You are now level " + level);
		}
		
		System.out.println("You gained expierience points!");
		
	}
	 public void lose(){
		 exp-=50/level;
		 if (exp<0){
			 exp=0;
		 }
		 System.out.println("You lose expierience points.");
	 }
	

}
