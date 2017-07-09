import java.awt.print.Printable;
import java.util.Scanner;

public class RPG_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		Scanner scanLine=new Scanner(System.in);
		boolean supernaturals=true;
		while(supernaturals==true){

			System.out.println("Welcome to the Super Naturals RPG!\nPlease enter your name.");
			String name=scanLine.nextLine();

			System.out.println("Hello "+name+".");
			System.out.println("Please enter your gender.\nIf you a a girl, say 'she'. If you are a boy, say 'he'.");
			String gender=scan.next();
			String gender2;
			if (gender.equals("she")){
				gender2=("her");
			}
			else if (gender.equals("he")){
				gender2=("him");
			}
			else{
				gender2=("");
			}

			System.out.println("Which kind of Super Natural would you like to be?");
			System.out.println("A. Skin Natural: Skin Naturals have to power to become nearly invincible and resist extreme temperatures. Weak offense, strong defense.");
			System.out.println("B. Brain Natural: A class of Head Natural. Brain naturals specialize in intelligence, telepathic communication, physic visioning, telekinesis, and even natural magic. Fair offense, fair defense.");
			System.out.println("C. Chest Natural(strength): Chest Naturals who specialize in strength have enhanced upper body stength. Strong offense, fair defense.");
			System.out.println("D. Heart Natural: A class of Chest Natural. Heart naturals specialize on morphing their outer appearance and using their enemies' feelings and emotions as weaknesses. Strong offense, poor defense.");
			System.out.println("E. Leg Natural(speed): Leg Naturals who specialize in super-speed have the ability to run very fast. Poor offense, fair defense.");
			System.out.println("F. Leg Natural(flexibility): Leg Naturals who specialize in flexibility have the ability to stretch their legs like rubber. Fair offense, fair defense.");
			System.out.println("G. Nose Natural*: A class of Head Natural. Nose naturals can have sonic sneezes and have an acute sense of smell good for tracking down enemies. Strong offense, fair defense.");
			System.out.println("H. Eye Natural*: A class of Head Natural. Eye naturals can have lazer vision, x-ray vision, night vision, enhanced eyesight, and see from far distances. Fair offense, fair defense.");
			System.out.println("I. Ear Natural*: A class of Head Natural. Ear naturals have an enhanced sense of hearing, giving them the ability to hear far-away sounds and quite sounds. Poor offense, poor defense.");
			System.out.println("J. Stomach Natural*: Stomach Naturals are resistant to natural hunger and thirst. They also can have the ability to heal. Poor offense, poor defense.");
			System.out.println("K. Ultra Natural*: Ultra-naturals are extremely powerful. They often have one or more extreme powers. Exceedingly dangerous. Powers can include time control, invisibility, flight, weather control, etc. Strong offense, strond defense.");
			String natural=scan.next();

			System.out.println("During the game, you will be asked to input an answer. Your first letter(or only letter) should always be capital.\nEnjoy the game!\n\n");




			System.out.println("You are enjoying your day. After a long day of working, you are ready to relax, eat some snacks, and watch a movie. Which movie would you like to watch?");
			String movie=scanLine.nextLine();

			System.out.print("You take '"+movie+"' out of its case and put it into your DVD player. You eat popcorn as you enjoy your movie. You are just getting to your favorite scene, when the door bursts open behind you.\nYour first reaction is:");
			System.out.println("A. It's probably my mom coming back from work.\nB. *GASP*\nC. Shhh! This is my favorite part!!!\nC. They found me! I've gotta hide!\nD. zzzzzz...\nE. AAAAAHHHH!");
			String reaction=scan.next();

			System.out.println("A girl has burst through the door. Her eletric blue eyes say it all...Actually, no. You have no idea what's going on.");
			System.out.println("Rim:I've finally found you!\nShe says between breaths. Before you can say anyhing, she grabs you and drags you out the door.\nYou manage to break out of her grip.\nYou say:");

			System.out.println("A. Wait a second, who are you?\nB. Yay! I love adventures!\nWhere are we going?\nC. I DON'T HAVE THE DIAMONDS, OFFICER! I HAVEN'T STOLEN ANYTHING!");
			String confusion=scan.next();

			//A
			if (confusion.equals("A")){
				System.out.println(name+": Wait a second, who are you?");
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

			System.out.println("Rim pulls you into a car and gets into the front seat. A small girl with brown hair is sitting in the shotgun seat.\nRim: Alma, keep "+gender2+" calm and quiet please.");
			System.out.println("The little girl turns to look at you.\nAlma:It's not personal.\nHer face creases with concentration and you feel yourself becoming very tired. As your heavy eyelids close, Rim turns to look at you.\nRim:You're not who you think you are.");

			System.out.println("Would you like to coninue?");
			String continuegame=scan.next();

			if (continuegame.equals("Yes")){
				supernaturals=true;
			}
			else if (continuegame.equals("No")){
				supernaturals=false;
			}

			System.out.println("Terence: Is "+gender+" dead?\nRex: "+gender+"'s moaning, Terence. How could "+gender+" be dead?\nAndromeda: Sh! I think "+gender+"'s waking up!");
			System.out.println("You open your eyes. You realise that you are surrounded by a group of kids. Rim and Alma are among them.\nThey stare at you with mixed emotions. Fear, curosity, concern, content.\nTerence:"+gender+" lives!\nRex: Terence!");
			System.out.println("One boy looks at you with concern and speaks to you calmly.\nBlake: Hello there. My name is Blake. These are my friends: Allen, Rex, Andromeda, Terence, Skylar, and you've already met Rim and Alma. Are you alright?");
			System.out.println("You respond:\nA......\nB. Do I look like I'm okay?\nC. I feel awful\nD. I'm alright, but I'm really confused.");
			String howdoyoufeel=scan.next();
			if (howdoyoufeel.equals("A")){
				System.out.println(name+": ......");
			}
			else if (howdoyoufeel.equals("B")){
				System.out.println(name+": Do I look like I'm okay?");
			}
			else if (howdoyoufeel.equals("C")){
				System.out.println(name+": I feel awful");
			}
			else if (howdoyoufeel.equals("D")){
				System.out.println(name+": I'm alright, but I'm really confused.");
			}

			System.out.println("Blake: I know this is really overwhelming, but we're here to help you. I'll get you some water, and then we'll answer your questions.");
			System.out.println("Blake gets you your water. They are now ready to answer your questions.");

			//QUESTIONS
			boolean questions=true;
			while (questions==true){
				System.out.println("Ask:\nA. Where am I?\nB. Who are you guys?\nC. Can I go home?\nD. What are Super Naturals?\nE. What are Un-Naturals?\nF. What's my power?\nG.Continue");
				String asking=scan.next();

				if (asking.equals("A")){
					System.out.println("Blake: You are in Super Natropolis. This is where we live. You'll be staying here for a little while. Don't worry, it's safe.");
				}
				else if (asking.equals("B")){
					System.out.println("Blake: We're kids just like you who are training to be Super Natural heroes.");
				}
				else if (asking.equals("C")){
					System.out.println("Blake: Sorry, but you're going to have to stay here for a while. We need to train you to use your powers, and the Un-Naturals are looking for you.");
				}
				else if (asking.equals("D")){
					System.out.println("Blake: Super Naturals are people who have excelarated natural abilities, usually in a specific body part or area, that give them hero-like superpowers. For example, Rex is a skin natural. His powers can make him almost invincible");
				}
				else if (asking.equals("E")){
					System.out.println("Blake: The Un-Naturals are our enemies. They are the opposite of Super Naturals, meaning they have less talent than the average person.");
				}
				else if (asking.equals("F")){
					System.out.println("Blake: We don't really know yet. That's why you're here. We're going to test you and figure out your power so that you can learn how to use it to its full potential.");
				}
				else if (asking.equals("G")){
					questions=false;
				}

			}

			System.out.println("After you finish asking questions a man enters the room.\nBlake: Hi, Dad!\nAll: Hi, Armor.\nArmor: Hey guys. Is this the new recruit?\nAllen: We were about to have "+gender2+" tested.");
			System.out.println("Armor: Excellent.\nHe turns to face you.\nArmor: Hello, my name is Knight's Armor, but you can just call me Armor. I'm one of the council members of Super Natropolis. I hope you're not to overwelmed by all of this. I know my Blakey was.\nHe puts an arm around Blake.\nBlake: Dad! You're embarrasing me! I wasn't overwhelmed! I was-\nRim:-overwhelmed.\nBlake: Hey!");
			System.out.println("Armor: Anyway, if there's anything I can do to make you feel more welcome here, just let me know. I'm glad you arrived here safely.");
			System.out.println("A man pokes his head in.\nFlexi-Fast: It's time. Is "+gender+" ready?\nYou say:\nA. Yes! Let's do this!\nB. I think so...\nC. No! Get me out of here!!!\nD. I'm scared, but I want to find out what my power is.");
			String ready=scan.next();

			if (ready==("A")){
				System.out.println(name+": Yes! Let's do this!");
			}
			else if (ready==("B")){
				System.out.println(name+": I think so...");
			}
			else if (ready==("C")){
				System.out.println(name+": No! Get me out of here!!!");
			}
			else if (ready==("D")){
				System.out.println(name+": I'm scared, but I want to find out what my power is.");
			}


			//THE TEST 
			System.out.println("\n\nBefore you know it, you are at the test. The others are taking the test too, to practice their powers. You don't know what your power is yet, but this test will determine which power you have.\nAllen: Alright, is everyone ready to start?\nAll: Yeah!\nAllen raises his fist, and the test begins.");

			ASkinNatural(natural);
			BBrainNatural(natural);
			CChestNatural(natural);
			DHeartNatural(natural);
			//System.out.println("Welcome to the Supernaturals RPG!\nWho would you like to play as?");
			//System.out.println("A. Blake: The awesome Ultra Natural. Careful, he may randomly fly off.\nB. Tara: The awesome AND powerful Ultra Natural. Don't get her upset, you may need an umbrella!\nC. Allen: The man of steel (Well, at least in his upper body)! The wall of muscle! The (unsuccessful) breaker of doors!");
			//String character=scan.next();
			//
			////BLAKE (A)
			//if (character.equals("A")){
			//	
			//	System.out.println("");
			//}
			System.out.println("Would you like to play again?");
			String playAgain=scan.next();

			if (playAgain.equals("Yes")){
				supernaturals=true;
			}
			else if (playAgain.equals("No")){
				supernaturals=false;
			}
		}
	}
	//Skin Natural
	public static void ASkinNatural (String natural){
		Scanner scan=new Scanner(System.in);
		if (natural.equals("A")){
			System.out.println("There is a small crevice where there is a button at the top of the wall. Each person must press the button. Terence scales the wall using his super-speed and presses it. Rim stretches her legs to make her tall and presses the button. Leg Naturals. Then you notice Andromeda change form. She becomes a VERY beautiful girl. Everything about her is perfect and pretty.\nAndromeda: Terence. Could you be a dear go and press the button for me?\nTerence:(entranced)Y...yes, your highness?\nHe runs up the wall again with gusto and presses the button. Andromeda lets her glamour fade.\nAndromeda: Thanks, honey!\nTerence: (turns red) Ew! That's not fair!\nYou attempt to climb to wall.");

			boolean climbingTheWall=true;
			while (climbingTheWall==true){
				System.out.println("You:\nA. Charge toward the wall and hope something happens.\nB.Try to stretch your legs like Rim.\nC. Try to fly\nD.Try to press it using Telekenisis.\nE. Continue.");
				String whatToDo = scan.next();
				if (whatToDo.equals("A")){
					System.out.println("You crash into the wall. You don't have the ability to use super-speed.");
				}
				else if (whatToDo.equals("B")){
					System.out.println("You're legs don't stretch. You're legs aren't super flexible like Rim.");
				}
				else if (whatToDo.equals("C")){
					System.out.println("You fall on your face(ouch!). You don't have to ability to fly.");
				}
				else if (whatToDo.equals("D")){
					System.out.println("The button doesn't press. You don't have the power of telekenisis.");
				}
				else if (whatToDo.equals("E")){
					climbingTheWall=false;
				}
			}
			System.out.println("You were not able to press the button. Neither was Rex or Allen. You are determined to pass the next test. The next test begins. Many metal projectiles start to pummel you and your friends. You must fight back or defend yourself.");
			boolean fightingProjectiles=true;
			while (fightingProjectiles==true){
				System.out.println("You:\nA. Try to fight back by trying to perform a sonic sneeze.\nB. Try to make your skin non puncturable\nC. Try to turn invisible so they can't find you.\nD. Fight back by using super-strength in your arms.\nE.Continue.");
				String doSomething=scan.next();
				if (doSomething.equals("A")){
					System.out.println("You manage to make yourself sneeze, but it is not a sonic sneeze. More projectiles attack you.");
				}
				else if (doSomething.equals("B")){
					System.out.println("You close your eyes and try to ignore the metal hitting and scatching you. You take deep breaths and think of nothing but making your skin non puncturable. When you've convinced yourself that it didn't work, you open your eyes. Much to your surprise, the metal is bouncing off of you. It is no longer scratching or hurting you. You are a Skin Natural!");
					fightingProjectiles=false;
				}
				else if (doSomething.equals("C")){
					System.out.println("You shut your eyes tight and stand still, but the metal doesn't stop hurting you. You open your eyes. You don't have to power to turn invisible.");
				}
				else if (doSomething.equals("D")){
					System.out.println("You punch a metal projectile, and almost break a knuckle. Your hand becomes numb. You are not a Chest/ Arm Natural");
				}
				else if (doSomething.equals("E")){
					fightingProjectiles=false;
				}
			}
		}
		else{
		}
	}
	
	//Brain Natural
	public static void BBrainNatural (String natural){
		Scanner scan=new Scanner(System.in);
		if (natural.equals("B")){
			System.out.println("There is a small crevice where there is a button at the top of the wall. Each person must press the button. Terence scales the wall using his super-speed and presses it. Rim stretches her legs to make her tall and presses the button. Leg Naturals. Then you notice Andromeda change form. She becomes a VERY beautiful girl. Everything about her is perfect and pretty.\nAndromeda: Terence. Could you be a dear go and press the button for me?\nTerence:(entranced)Y...yes, your highness?\nHe runs up the wall again with gusto and presses the button. Andromeda lets her glamour fade.\nAndromeda: Thanks, honey!\nTerence: (turns red) Ew! That's not fair!");

			boolean climbingTheWall=true;
			while (climbingTheWall==true){
				System.out.println("You attempt to climb to wall.\nYou:\nA. Charge toward the wall and hope something happens.\nB.Try to stretch your legs like Rim.\nC. Try to fly\nD.Try to press it using Telekenisis.\nE. Continue.");
				String whatToDo = scan.next();
				if (whatToDo.equals("A")){
					System.out.println("You crash into the wall. You don't have the ability to use super-speed.");
				}
				else if (whatToDo.equals("B")){
					System.out.println("You're legs don't stretch. You're legs aren't super flexible like Rim.");
				}
				else if (whatToDo.equals("C")){
					System.out.println("You fall on your face(ouch!). You don't have to ability to fly.");
				}
				else if (whatToDo.equals("D")){
					System.out.println("You reach out. You are in deep concentration. You try to relax and think of nothing but pressing the button. You are so focused, that you don't hear everyone gasp. You open your eyes. Everyone is staring at you. You're a brain natural! You pressed the button using telekenisis!");
					climbingTheWall=false;
				}
				else if (whatToDo.equals("E")){
					climbingTheWall=false;
				}
			}

		}
	else{
	}
}
	
//Chest Natural(strength)
public static void CChestNatural (String natural){
	Scanner scan=new Scanner(System.in);
	if (natural.equals("C")){
		System.out.println("There is a small crevice where there is a button at the top of the wall. Each person must press the button. Terence scales the wall using his super-speed and presses it. Rim stretches her legs to make her tall and presses the button. Leg Naturals. Then you notice Andromeda change form. She becomes a VERY beautiful girl. Everything about her is perfect and pretty.\nAndromeda: Terence. Could you be a dear go and press the button for me?\nTerence:(entranced)Y...yes, your highness?\nHe runs up the wall again with gusto and presses the button. Andromeda lets her glamour fade.\nAndromeda: Thanks, honey!\nTerence: (turns red) Ew! That's not fair!");

		boolean climbingTheWall=true;
		while (climbingTheWall==true){
			System.out.println("You attempt to climb to wall.\nYou:\nA. Charge toward the wall and hope something happens.\nB.Try to stretch your legs like Rim.\nC. Try to fly\nD.Try to press it using Telekenisis.\nE. Continue.");
			String whatToDo = scan.next();
			if (whatToDo.equals("A")){
				System.out.println("You crash into the wall. You don't have the ability to use super-speed.");
			}
			else if (whatToDo.equals("B")){
				System.out.println("You're legs don't stretch. You're legs aren't super flexible like Rim.");
			}
			else if (whatToDo.equals("C")){
				System.out.println("You fall on your face(ouch!). You don't have to ability to fly.");
			}
			else if (whatToDo.equals("D")){
				System.out.println("The button doesn't press. You don't have the power of telekenisis.");
			}
			else if (whatToDo.equals("E")){
				climbingTheWall=false;
			}
		}
		System.out.println("You were not able to press the button. Neither was Rex or Allen. You are determined to pass the next test. The next test begins. Many metal projectiles start to pummel you and your friends. You must fight back or defend yourself.");
		boolean fightingProjectiles=true;
		while (fightingProjectiles==true){
			System.out.println("You:\nA. Try to fight back by trying to perform a sonic sneeze.\nB. Try to make your skin non puncturable\nC. Try to turn invisible so they can't find you.\nD. Fight back by using super-strength in your arms.\nE.Continue.");
			String doSomething=scan.next();
			if (doSomething.equals("A")){
				System.out.println("You manage to make yourself sneeze, but it is not a sonic sneeze. More projectiles attack you.");
			}
			else if (doSomething.equals("B")){
				System.out.println("You squeeze your eyes tight in concentration. You stand still for a little while, but the pain from the projectiles doesn't lessen. You're not a Skin Natural.");
			}
			else if (doSomething.equals("C")){
				System.out.println("You shut your eyes tight and stand still, but the metal doesn't stop hurting you. You open your eyes. You don't have to power to turn invisible.");
			}
			else if (doSomething.equals("D")){
				System.out.println("You close your eyes, count to ten, breathe in twice, and open them. You hit a projectile as hard as you can, you give it everything you've got. It bounces off your fist painlessly. You smile. You strike the next one, then the next, then the next. None of the projectiles injure your arms or hands as you strike out at them. Everyone is staring at you. You are a Chest Natural! You have super-strength in your arms.");
				fightingProjectiles=false;
			}
			else if (doSomething.equals("E")){
				fightingProjectiles=false;
			}
		}
		
	}
	else{
	}
}

//Heart Natural
public static void DHeartNatural (String natural){
	Scanner scan=new Scanner(System.in);
	if (natural.equals("D")){
		System.out.println("There is a small crevice where there is a button at the top of the wall. Each person must press the button. Terence scales the wall using his super-speed and presses it. Rim stretches her legs to make her tall and presses the button. Leg Naturals. Then you notice Andromeda change form. She becomes a VERY beautiful girl. Everything about her is perfect and pretty.\nAndromeda: Terence. Could you be a dear go and press the button for me?\nTerence:(entranced)Y...yes, your highness?\nHe runs up the wall again with gusto and presses the button. Andromeda lets her glamour fade.\nAndromeda: Thanks, honey!\nTerence: (turns red) Ew! That's not fair!");

		boolean climbingTheWall=true;
		while (climbingTheWall==true){
			System.out.println("You attempt to climb to wall.\nYou:\nA. Charge toward the wall and hope something happens.\nB.Try to stretch your legs like Rim.\nC. Try to fly\nD.Try to press it using Telekenisis.\nE. Continue.");
			String whatToDo = scan.next();
			if (whatToDo.equals("A")){
				System.out.println("You crash into the wall. You don't have the ability to use super-speed.");
			}
			else if (whatToDo.equals("B")){
				System.out.println("You're legs don't stretch. You're legs aren't super flexible like Rim.");
			}
			else if (whatToDo.equals("C")){
				System.out.println("You fall on your face(ouch!). You don't have to ability to fly.");
			}
			else if (whatToDo.equals("D")){
				System.out.println("The button doesn't press. You don't have the power of telekenisis.");
			}
			else if (whatToDo.equals("E")){
				climbingTheWall=false;
			}
		}
		System.out.println("You were not able to press the button. Neither was Rex or Allen. You are determined to pass the next test. The next test begins. Many metal projectiles start to pummel you and your friends. You must fight back or defend yourself.");
		boolean fightingProjectiles=true;
		while (fightingProjectiles==true){
			System.out.println("You:\nA. Try to fight back by trying to perform a sonic sneeze.\nB. Try to make your skin non puncturable\nC. Try to turn invisible so they can't find you.\nD. Fight back by using super-strength in your arms.\nE.Continue.");
			String doSomething=scan.next();
			if (doSomething.equals("A")){
				System.out.println("You manage to make yourself sneeze, but it is not a sonic sneeze. More projectiles attack you.");
			}
			else if (doSomething.equals("B")){
				System.out.println("You squeeze your eyes tight in concentration. You stand still for a little while, but the pain from the projectiles doesn't lessen. You're not a Skin Natural.");
			}
			else if (doSomething.equals("C")){
				System.out.println("You shut your eyes tight and stand still, but the metal doesn't stop hurting you. You open your eyes. You don't have to power to turn invisible.");
			}
			else if (doSomething.equals("D")){
				System.out.println("You punch a metal projectile, and almost break a knuckle. Your hand becomes numb. You are not a Chest/ Arm Natural.");
			}
			else if (doSomething.equals("E")){
				fightingProjectiles=false;
			}
		}
		System.out.println("You are not feeling very good. You haven't been able to use your powers for anything yet. You sigh and prepare for the next test. An electromagnetic field deploys against one of the walls. There is a small crevice on the other side of the electromagnetic field. There are nine tokens on the other side. Each person must retrieve their token.");
		System.out.println("You:\nA. Try to make yourself become a very beautiful girl to charm Rex to get it for you.\nB. Make your skin resistant to electromagnetic rays.\nC. Levatate your token towards you by using telekenisis.\nD.");
	}
	else{
	}
}
}