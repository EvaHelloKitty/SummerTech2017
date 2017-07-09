package Java;

import java.util.Random;
import java.util.Scanner;

public class TestingOutSomeSolutions {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		Random rand = new Random();
		
		boolean FightScene=true;
		while (FightScene){
			int z = rand.nextInt(10);	
			int a = rand.nextInt(100);
			int b = rand.nextInt(100);
			int e = a+b;
			final int maxHealth = 2000 + e;
			final int EnemyMaxHealth = 500;
		//System.out.println(maxHealth);
		
		System.out.println("Press '.' to throw a punch!");
		String f = scan.nextLine();
		if (f.equals(".")){
			}
		
			
			
				
				
				
				int EnemyHealth = EnemyMaxHealth - e;
				int health = maxHealth - e;
				
				boolean keep = true;
				while (keep){
					
					if (z>5){
					
						System.out.println("Your opponent takes " + e + " damage");
					
					
					
					
						int y = EnemyHealth - e;
						System.out.println(y);
						if (y==0||y<0){
							System.out.println("You have defeated your opponent.");
							
						}
						else{
							break;
						}
					
									
					
						if (z<5){
							System.out.println("You take " + e + " damage");
							int x = health - e;
							System.out.println(x);
							if (x==0||x<0){
								System.out.println("You have died :( .");
							}
							else{
								break;
							}
						}
						
						
						//if (health==0||health<0){
					    //	System.out.println("You have died. ;( )
						//	break;
				}
			}
			
		}
		}
		
		
		
	}


