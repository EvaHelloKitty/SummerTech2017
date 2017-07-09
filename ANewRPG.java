import java.util.Scanner;


public class ANewRPG {

	//Delay
	public static void delay (){
		try {
			Thread.sleep(1000);                 //1000 milliseconds is one second.
		} catch(InterruptedException ex) {
			Thread.currentThread().interrupt();

		}
	}

	
	//Level-1
	public static void level1(CharacterStats Cinder){
		Scanner scan=new Scanner(System.in);
		

		System.out.println("\nSENDING TRANSMISSION - port 9945\nSENT - 19:00\nRECIEVER - Anonymous\nContact IP 1093745\n");
		delay();
		System.out.println(".................");
		delay();
		System.out.println("Prieview Sent Content? [y]");
		String access = scan.next();
		if (access.equals("y")){
			System.out.println("Conecting...");
			System.out.println("Please Wait");
			System.out.println("User 1: Cinder. It's Cress. We lost your transmission for a second.\nAre you there? [y]");
			String ihere = scan.next();
			if (ihere.equals("y")){
				System.out.println();
				delay();
				System.out.println("\nUser 1: Thank goodness! We lost track of you after\nthat big meteor shower. Are you hurt?\n\n\nCheck your stats now by typing [HEALTH]");
				String healthOne = scan.next();
				if (healthOne.equals("HEALTH")){
					getHealth(Cinder);
					System.out.println("Your current health: " + Cinder.getHealth());
				}
			}
		}
	}


	private static void getHealth(CharacterStats cinder) {
		// TODO Auto-generated method stub
		
	}


	public static void main(String[] args){
		boolean lunar=true;
		while (lunar){
			CharacterStats Cinder = new CharacterStats(100);
			Scanner scan=new Scanner(System.in);
			System.out.println("Welcome to the World of the Lunar Chronicles!\nType [START] to begin.");
			String go = scan.next(); 
			if (go.equals ("START")){

				System.out.println("GAME MENU\n-----------\n\n[1] Level 1: Crash\n\n\nSelect Your Level");
				String levelselect = scan.next();
				if (levelselect.equals("1")){
					level1 (Cinder);
				}


			}

		}

	}


}