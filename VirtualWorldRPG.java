import java.util.Scanner;

public class VirtualWorldRPG {

	public static void startTheRPG (){
		Scanner scan=new Scanner(System.in);
		boolean explore=true;
		while (explore){
			System.out.println("You are a computer programmer in a top-secret facility.\nEverything in your work place is buried in secrets and lies.\nYou always intend to one day, be courageous enough to discover what you're really getting paid for. ");
			System.out.println("One day, your passing a door to one of the restricted areas, and this fierce of udging overtakes you.\n \nDo you \nA-  Reach for the Knob to Open the Door As soon as the Coast is Clear.\n \nor\n \nB- Wait untill Nightfall.\n \nSuggested commands = [A][B]");
			String preGamechoice1= scan.next();

			//Reach for Door - Locked
			if (preGamechoice1.equals("A")){
				System.out.println("A-  Reach for the Knob to Open the Door As soon as the Coast is Clear.\n \nAs soon as the hallway is clear, you touch the doorknob.\nYou find it locked.\n \nA- Look for a key\n \n \nB- Try to shut down the security.\n \nSuggested Commands = [A][B]");
				String preGamechoice2= scan.next();

				//Locked - Look for Key
				if( preGamechoice2.equals("A")){
					System.out.println("Where do you want to look for the key?\n \nA- Your pocket.\n \nor\n \nB- The Security Corridor\n \nSuggested Commands = [A][B]");
					String whereAretheKeys= scan.next();
					if (whereAretheKeys.equals("A")){
						System.out.println("Your pockets are empty, except for a swiss army knife. It is too big to pick the lock with.");
						continue;
					}
					if (whereAretheKeys.equals("B")){
						System.out.println("Going and tampering with the security is too risky in the daylight. You return to work, planning to wait until dark.");
						continue;
					}

				}

				//Locked - Try to Shut Off Security
				else if (preGamechoice2.equals("B")){
					System.out.println("You You sneak to the security office.\nThrough the small window in the door, you can see a security officer sitting in a chair inside.\nHe is on alert.\nHe must have seen you lurking by the door.\nHe now types furiously on the keyboard in front of him, trying to find you on one of the Security Cameras.");
					System.out.println("Tampering with the security is too risky in the daylight. You return to work, planning to wait until dark.");
					continue;
				}
			}

			//Wait Until Nightfall - Sneak Out
			else if (preGamechoice1.equals("B")){
				System.out.println("B- Wait until Nightfall\n \nYou wait until nightfall.\n You live in the facility, so you wait until midnight to sneak out of the dormitories.\nYou tip-toe down the hall.\nWhere are you going?\n \nA- The door\n \nor\n \nB- The security office\n \nSuggested Commands = [A][B]");
				String preGamechoice4= scan.next();
				//Sneak Out - Door - Locked
				if (preGamechoice4.equals("A")){
					System.out.println("You sneak to the door. It is locked.");
				}

				//Sneak Out - Security Office
				boolean security=true;
				while (security){


					if (preGamechoice4.equals("B")){
						System.out.println("You sneak to the security office.\nThrough the small window in the door, you can see a security officer sitting in a chair inside.\nHe lazily watches the screens while snacking on a muffin.\n");
						System.out.println("You plan to:\n \nA- Try to cause a disturabance to distract him.\n \nB- Find a way in\n \nC- Wait until a better night.\n \nD. Bust down the door." );
						String aNewplan1= scan.next();
						if (aNewplan1.equals("A")){
							System.out.println("What kind of disturbance did you have in mind?");
							String disturbance =scan.next();
							System.out.println("You set off this disturbance- a " + disturbance + ". It picks up the security officer's attention.\nHe foolishly flees the security room, before running out to look at the problem\nYou try the door. It's open. You go in and manipulate the security easily.");
						}
						else if (aNewplan1.equals("B")){
							System.out.println("You try to find a way in.\nYou uncover a ventalation shaft that might lead to the security office.\n \nDo you:\n \nA- Crawl through it\n \nor\n \nB.Find another way\n");
							String ventilation=scan.next();
							if (ventilation.equals("A")){
								System.out.println("You take the cover off of the shaft, using the swiss army knife as a screwdriver.\nYou crawl inside.\nOnce inside, you crawl to an overhead opening.\nYou open the opening and fall into the room\nThe guard is accidentally knowcked out, for you have fallen on him.\nYou proceed to shut off the security footage and passcodes.\n");
							}

						}
						else if (aNewplan1.equals("C")){
							System.out.println("There is no other way. Only the door and the shaft.");
							continue;

						}
						else if (aNewplan1.equals("D")){
							System.out.println("You bust down the door using a nearby steel- potted indoor tree as a battering ram.\nYou get caught and restricted.");
							System.out.println("FAIL.");
							continue;
						}
						System.out.println("The security is down. You go to the door. Suggested Command [OPEN]");
						String openDoor1 = scan.next();
						if (openDoor1.equals("OPEN")){
							System.out.println("You are now within the restricted area.");
							System.out.println("Level Complete.");

						}

					}
				}
			}



		}
	}

	public static void nextStage (){
		boolean stayOrgo=true;
		while (stayOrgo){


			Scanner scan=new Scanner(System.in);
			System.out.println("You now find yourself underground, in a basement of some sort.\nIt's very dark, and there doesn't seem to be anything too suspicious.\nYou try to turn back, but you can't find the door in the dark\n");
			System.out.println("You reach out with both hands on either side of your body.\nYou feel two walls.\nThe cooridor you're in seems to be very narrow. Do you go forward [A], or back? [B]");
			String directions1 = scan.next(); 
			if (directions1.equals("A")){
				System.out.println("You go forward.");
				System.out.println("You keep your hands on the walls, but suddenly one of the walls falls away, on your left side.\nDo you go forward still [A], or do you make a left[B]?");
				String directions2 = scan.next();
				if (directions2.equals("A")){
					System.out.println("You continue forward. Your face suddenly slams into something metal.\nYou step back, and reach out\nIt feels like a door.\nDo you try to open it? Yes[A] or No[B]?");
				}
				else if (directions2.equals("B")){
					System.out.println("You go left. You find a room without a door and you step in.\nIt is an old supply room.\nYou feel around for something useful.\nYou find a dusty cardboard box in one of the corners.");
					System.out.println("[OPEN]");
					String openBox1= scan.next();
					if (openBox1.equals("OPEN")){
						boolean box=true;
						while (box){
							System.out.println("The contents of this box convienitntly include a keychain flashlight.\nYou turn it on.\nYou find that it has very little light because it is low on battery.\nThe contents include:\n \n-[A] An old oil lantern\n-[B] A musty sheet of fabric\n-[C] An old text messager.\n \nWhich one will you use?\n");
							String whichItem1= scan.next();
							if (whichItem1.equals("A")){
								System.out.println("The lantern has no fuel. It needs oil.");
								continue;
							}
							else if (whichItem1.equals("B")){
								System.out.println("It's a blanket.\nYou wrap it around yourself to keep you warm, but quickly find it holds no purpose in terms of helping you to escape.\n");
								continue;
							}
							else if (whichItem1.equals("C")){
								System.out.println("You turn it on.\nAt first, nothing happens, but then, the device crackles to life.\nDelighted, you type in a message to help you escape...");
								String messageText1=  scan.next();
								System.out.println(messageText1);
								System.out.println("...and you wait. You find yourself falling asleep.");
								System.out.println("Level Complete.");
				

							}

						}
					}
				}
			}




			else if (directions1.equals("B")){


				System.out.println("You go backwards.");
				System.out.println("You pivot on your heels and reach out for the walls again.\nThey're still there, and you follow them back the way you came.");
				System.out.println("You come to a fork in the cooridor. Do you want to go [A] Left or [B] Right?");
				String directions3= scan.next(); 
				if (directions3.equals("A")){
					System.out.println("You go left. After walking for a few minutes you hit a wall.\nLiterally.\nYou turn back, and walk to the intersection.");
				}
				if (directions3.equals("B")){
					System.out.println("You go right. You seem to find the door that you came from, but when you try to open it, you find that it is stuck shut.\nYour throat constricts. You are trapped.");
				}
			}


		}
	}



	public static void nameCalling (String learnMyname){
		boolean name=true;
		Scanner scan=new Scanner(System.in);
		while (name){
			if (learnMyname.equals("YES")){
				System.out.println("\n \nPlease input your first name using the keyboard. When you are done, press the <ENTER> key.");
				String myFirstname= scan.next();
				System.out.println("You will notice that I have words in brackets below.\nThese words are suggested commands that you can use to interact with the game.\nThe game will go most smoothly if you pick a suggested command and type it in WORD FOR WORD.\nAnd careful! It's case-sensitive ;)\n \n.");
				System.out.println("You have confirmed that your first name is " + myFirstname +". Is that correct? [YES or NO]");
				String myFirstnameRight = scan.next();
				if (myFirstnameRight.equals("YES")){
					System.out.println("Great!");
					System.out.println("Now, type in your last name, and then, press <ENTER>");
					String myLastname= scan.next();
					System.out.println("You have confirmed that your last name is " + myLastname +". Is that correct? [YES or NO]");
					String myLastnameRight =scan.next();
					String myFullname = (myFirstname + " " + myLastname);
					if (myLastnameRight.equals("YES")){
						System.out.println("Setting Renewed! Hello " + myFullname + "!!!");
						break;

					}
				}
			}
		}
	}

	public static void openMessages ( String myMessagesstageOne, String cc[]){
		Scanner scan=new Scanner(System.in);

		boolean notifyMe =true;
		while (notifyMe){


			System.out.println("Checking notifications...");
			System.out.println("-------------------------------------------------------------------");
			System.out.println("NOTIFICATIONS:\n \n");
			System.out.println("(NEW): *NEW MESSAGE*\n \n____________________________________________________________\nOLD NOTIFICATIONS:\n \nNEW EMAIL\nNEW PICTURE MESSAGE\nNEW MESSAGE");
			System.out.println("\n \n You have a new message. To check your message, go to the command consol by typing [CC]");
			String cc1 = scan.next();
			if (cc1.equals("CC")){
				for (int i=0;i<9;i++){
					System.out.println("COMMAND CONSOLE");
					System.out.println("----------------");
					System.out.println(cc[i]);
					System.out.println("----------------");
				}
				System.out.println("Very good.\nThis is your command console, your 'home page' if you will.\nFrom here, you can open different applications on your computer");
				System.out.println("[MESSAGES]");
				String messages1 = scan.next();
				if (messages1.equals("MESSAGES")){
					System.out.println("Checking messages...");
					System.out.println("One New Message. Suggested Command [OPEN]");
					String open1= scan.next();
					if (open1.equals("OPEN")){
						textMessage ();
					}
				}
			}
		}
	}

	//ANYONE THERE? (FIRST CONTACT)
	public static void textMessage (){
		Scanner scan=new Scanner(System.in);
		boolean firstContact=true;
		while(firstContact){


			System.out.println("YOU: Hello? Is anyone there??? Please, message me back if you get this.\n \n");
			String pause1 = scan.next();
			System.out.println("CONTACT: I recieved your message.");
			String pause2 = scan.next();
			System.out.println("Enexen: I don't recognize this person as a normal contact.");
			System.out.println("You ignore him. Fumbling with the device, you text back a messgae.");
			System.out.println("[THANK GOODNESS I NEED HELP][WHO ARE YOU]");
			String contactingContact1= scan.next(); 
			if (contactingContact1.equals("THANK GOODNESS I NEED HELP")){
				System.out.println("CONTACT: What do you need help with?");
		}
			else if (contactingContact1.equals("WHO ARE YOU")){
				System.out.println("CONTACT: My name is Cynthia Connors.");
				
			}
			
			
			String choice1=scan.next();
			System.out.println("YOU: " + choice1 +"\n \n");
			if (choice1.equals("I RECIEVED YOUR MESSAGE")){
				choice1(choice1);
			}
			else if (choice1.equals("WHO ARE YOU")){
				choice2(choice1);

			}
		}
	}

	//I RECIEVED YOUR MESSAGE (FIRST CONTACT -> HERE)
	public static void choice1 (String communicationStage2A){
		boolean response=true;
		while (response){


			Scanner scan=new Scanner(System.in);
			System.out.println("Yes, this thing really DOES work! I'm so glad I got a contact!");
			System.out.println("[WHO ARE YOU] [WHAT THING]");
			String choice2= scan.next(); 
			System.out.println("YOU: " + choice2 +"\n \n");
			if (choice2.equals("WHO ARE YOU")){
				System.out.println("I'm a caretaker at the bunker");
				System.out.println("[WHAT'S A CARETAKER] [WHAT BUNKER]");
				String choice4= scan.next();
				if (choice4.equals("WHAT'S A CARETAKER")){

				}
				else{

				}


			}
			else if (choice2.equals("WHAT THING")){
				System.out.println("This old fashioned messager. I found it in the basement.");
			}
		}
	}

	//WHO ARE YOU (FIRST CONTACT -> HERE)
	public static void choice2 (String communicationStage2B){
		boolean contact1=true;
		while (contact1){
			Scanner scan=new Scanner(System.in);
			System.out.println("My name is Cynthia Connors. I'm a caretaker at the bunker.");
			System.out.println("[WHY ARE YOU CONTACTING ME] [WHAT ARE YOU TALKING ABOUT]");
			String choice3= scan.next(); 
			System.out.println("YOU: " + choice3 +"\n \n");
			if (choice3.equals("WHY ARE YOU CONTACTING ME")){
				System.out.println("CYNTHIA: I'm trying to find someone who can help me out of this bunker.");

			}
			else if (choice3.equals("WHAT ARE YOU TALKING ABOUT")){
				System.out.println("CYNTHIA: I work in the main bunker in Sector 1. Haven't you heard of it?");
				System.out.println("");

			}
		}
	}


	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);



		//Command Console Array
		String cc[] =new String[9];

		cc[0] = "MESSAGES";
		cc[1] = "E-MAILS";
		cc[2] = "CAMERA";
		cc[3] = "CALENDAR";
		cc[4] = "CLOCK";
		cc[5] = "VOICE RECORD";
		cc[6] = "WEATHER";
		cc[7] = "SETTINGS";
		cc[8] = "VIDEO CHAT";

		//Main While Loop
		boolean main=true;
		while (main){

			//Stage 1: Going Places You're Not Supposed To 

			startTheRPG();
			
			//Stage 2: Trapped, Lost, and in the Dark
			nextStage (); 

			//Introduction
			System.out.println("Hello! Welcome to your |N|X|N| Computing Device Version 2.4.\nMy name is Enexen\nI am a programmed helper designed to navigate you through the operations of your |N|X|N| computing device.\nYou have recently reset your |N|X|N| computing device settings.\nI will navigate you throught the new settings so you can eventually use the device without my constant instruction.\nTo start, let's update your settings.\nSay [YES] and press <ENTER> to continue.");
			String learnMyname = scan.next();

			//Device Turns On Fully
			nameCalling(learnMyname); 

			//Checking Messages 
			System.out.println("That's enough setting changes for now, because it looks like you have a new notification. [READ-NOTIFICATION]");
			String newNotification= scan.next();

			if (newNotification.equals("READ-NOTIFICATION")){
				openMessages (newNotification, cc); 

			}
		}
	}
}
