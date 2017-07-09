import java.util.Scanner;
public class RPG {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scan=new Scanner(System.in);
		boolean supernaturals=true;
		while(supernaturals){

			System.out.println("Welcome to the Super Naturals RPG!\nPlease enter your name.");
			String name=scan.nextLine();

			System.out.println("Hello "+name+".");
			System.out.println("You are enjoying your day. After a long day of working, you are ready to relax, eat some snacks, and watch a movie. Which movie would you like to watch?");
			String movie=scan.nextLine();
			
//			System.out.println("Please enter your gender.\nIf you a a girl, say 'she'. If you are a boy, say 'he'.");
//			String gender=scan.next();
//			if (gender.equals("she")){
//				String gender2=("her");
//			}
//			
//			else if (gender.equals("he")){
//				String gender2=("him");
//			}
			
			System.out.println("You take "+movie+" out of its case and put it into your DVD player. You eat popcorn as you enjoy your movie. You are just getting to your favorite scene, when the door bursts open behind you.\nYour first reaction is:");
			System.out.println("A. It's probably my mom coming back from work.\nB. *GASP*\nC. Shhh! This is my favorite part!!!\nC. They found me! I've gotta hide!\nD. zzzzzz...\nE. AAAAAHHHH!");
			String reaction=scan.next();

			System.out.println("A girl has burst through the door. Her eletric blue eyes say it all...Actually, no. You have no idea what's going on.");
			System.out.println("Rim:I've finally found you!\nShe says between breaths. Before you can say anyhing, she grabs you and drags you out the door.\nYou manage to break out of her grip.\nYou say:");
			
			System.out.println("A. Wait a second, who are you?\nB. Yay! I love adventures!\nWhere are we going?\nC. I DON'T HAVE THE DIAMONDS, OFFICER! I HAVEN'T STOLEN ANYTHING!");
			String confusion=scan.next();
			
			//A
			if (confusion.equals("A")){
				System.out.println(name+":Wait a second, who are you?");
				System.out.println("Rim: My name is Rim. I've been looking for you. In short, your life is in danger and everything is about to change.");
			}
			
			//B
			else if (confusion.equals("B")){
				System.out.println(name+": Yay! I love adventures! Where are we going?");
				System.out.println("Rim: Adventures?! Kid, this is going to change your whole life. My name is Rim. I'm taking you somewhere were you'll be safe.");
			}
			
			//C
			else if (confusion.equals("C")){
				System.out.println(name+": I DON'T HAVE THE DIAMONDS, OFFICER! I HAVEN'T STOLEN ANYTHING!");
				System.out.println("Rim: Diamonds?! Stolen?! Nevermind, I don't want to know. I'm not one of the police!\nMy name is Rim, I'm taking you to a safe where you'll be safe.");
			}
			
			System.out.println("Rim pulls you into a car and gets into the front seat. A small girl with brown hair is sitting in the shotgun seat.\nRim:Alma, keep them calm and quiet please.");
			System.out.println("The little girl turns to look at you.\nAlma:It's not personal.\nHer face creases with concentration and you feel yourself becoming very tired. As your heavy eyelids close, Rim turns to look at you.\nRim:You're not who you think you are.");
			
			System.out.println("Would you like to coninue?");
			String continuegame=scan.next();
			
			if (continuegame.equals("Yes")){
				supernaturals=true;
			}
			else if (continuegame.equals("No")){
				supernaturals=false;
			}
			
			
			//System.out.println("Welcome to the Supernaturals RPG!\nWho would you like to play as?");
			//System.out.println("A. Blake: The awesome Ultra Natural. Careful, he may randomly fly off.\nB. Tara: The awesome AND powerful Ultra Natural. Don't get her upset, you may need an umbrella!\nC. Allen: The man of steel (Well, at least in his upper body)! The wall of muscle! The (unsuccessful) breaker of doors!");
			//String character=scan.next();
			//
			////BLAKE (A)
			//if (character.equals("A")){
			//	
			//	System.out.println("");
			//}
			
			
			
			}
		
			
		}
	}

	

