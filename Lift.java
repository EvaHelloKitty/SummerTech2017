import st.Prompt;


public class Lift
{

	public static void printShaft(String [] a){
		for (int i=0; i < 10; i++){
			System.out.println(a[i]+(10 - i));
		}
		System.out.println();
	}

	public static void doStuffInMyRoom(int rand){

		String todo3=Prompt.getString ("What Would you like to do?\nA Go to My Room\nB Ride the Elevator");
		if (todo3.equals("A")){
			Prompt.getString ("You Are Standing in Front of Your Room Now (" + rand + "). Type to Insert Your Room Key");
			boolean room = true;
			while (room){
				String inroom3 = Prompt.getString ("You are inside your room.\nYou have a bed, a TV, a clock radio, a bottle of water and welcome cookie, and hotel stationary.\nOutside you have an amazing view.\nType 'Exit' to leave your room.");
				if (inroom3.equals("Eat Cookie")||inroom3.equals("Eat My Cookie")){
					Prompt.getString ("You Eat Your Cookie. It tastes amazing! What an awesome welcome!");	
				}
				else if (inroom3.equals("Watch TV")){
					Prompt.getString ("You turn on the TV.There are only twenty channels but they all look pretty intresting.\nYou waste some time watching good shows.");
				}
				else if (inroom3.equals("Sleep")){
					Prompt.getString ("You crawl into the covers. The bed is incredibly comfortable and the sheets and blankets are soft and warm. You fall asleep and take a nap.");
				}
				else if (inroom3.equals("Deploy Elephant")){
					Prompt.getString ("Suddenly an Elephant appears and sprays water in your face. Then it disappears in a shower of magical fairy dust......"); 
				}
				else if (inroom3.equals("Exit")){
					System.out.println("You are now leaving the room.....");
					room = false; 
				}
			}
		}

	}

	public static void doStuffOnDanceFloor(){
		Prompt.getString("You enter the dance room. The music is loud and the floor glows different colors. Other hotel residents are dancing around you.");
		boolean dance = true;
		while (dance){
			String dance1 =Prompt.getString("Use the keys W,A,S and D in different combinations to make up different dance moves! (Type 'Exit' to leave)");
			if (dance1.equals("WASD")){
				Prompt.getString("You just did the Sprinkler Move, followed by a cool side step!");
			}
			else if (dance1.equals("DSAW")){
				Prompt.getString("You just did the Robot Move! Now you're jumping up and down to the beat!");
			}
			else if (dance1.equals("SAWD")){
				Prompt.getString("You're doing the Wave! You're doing great!");
			}


			else if (dance1.equals("AWSD")){
				Prompt.getString("You just did the Hamster Dance! You follow up with a very stlish backslip!");
			}
			else if (dance1.equals("WSAD")){
				Prompt.getString("You just did a spin, followed by a twist!");
			}
			else if (dance1.equals("WSDA")){
				Prompt.getString("You just did the Eva Dance!");
			}
			else if (dance1.equals("SWDA")){
				Prompt.getString("You're break dancing! Nice Moves!");
			}
			else if (dance1.equals("Exit")){
				Prompt.getString("Thanks for dancing!Come Back Soon!");
				dance = false; 
			}

			else{
				System.out.println("Sorry,That is not a valid move.");
				continue;
			}
		}


	}


	public static void doStuffInGym(int rand) {

		boolean inGym=true;

		while(inGym) {
			String workout = Prompt.getString("You are in the fitness room.\nDo you want to A) run on treadmill or B) pump some iron? (Type Exit to go to elevator)");

			//////Running
			if(workout.toUpperCase().equals("A")) {
				boolean onTreadmill = true;
				while(onTreadmill) {
					int speed = Prompt.getInt("You are on the treadmill...set your speed...(0 to get off)");
					if(speed == 0) {
						onTreadmill = false;
						Prompt.getString("You climb safely off the treadmill...");
					} 					
					else {
						Prompt.getString("Great! Now you're running! Doesn't it feel good? It's nice to get some excersise!");

					}
					if(speed > 0 && speed <= 5) Prompt.getString("You are just warming up!  Come on, you can do more!");
					if(speed > 5 && speed <= 8) Prompt.getString("You are cruising at a nice pace...keep it up!");
					if(speed > 8) Prompt.getString("Whoa!  Slow down tiger");
					if(speed > 100) Prompt.getString("Okay Flash, that's enough..."); 

				}
			}

			///Weights
			if(workout.toUpperCase().equals("B")) {
				boolean lifting = true;
				while(lifting) {
					double somePounds = Math.random() * 100;
					String doMore = Prompt.getString("You just lifted " + Math.round(somePounds) +" lbs. Do another set?  Yes or No?");
					if(doMore.toUpperCase().equals("NO")) lifting = false;
				}
			}


			//Exit
			if (workout.equals("Exit")) {
				Prompt.getString("OK..see you next time!");
				inGym=false;			
			}
		}
	}


	public static void sayHelloToLinda(){


		boolean linda = true;
		while (linda) {

			String hellolinda1=Prompt.getString("Receptioist (Linda): Yes? Can I help you? (<Quit> to leave) ");
			if (hellolinda1.equals("SECRET COMMANDS")){
				System.out.println("\nSECRET COMMANDS:\n-I Need Tokens For The Arcade\n-Let's Dance Linda!\n-Your Hair Looks Beautiful!\n-Where Can I get Something to Eat?\n-No\n-You Don't Suppose Have Six Fingers On Your Left Hand Do You?\n-Can I have Another Welcome Cookie?\n-Can I Have A Hundred Welcome Cookies?");
			}
			if (hellolinda1.equals("I Need Tokens For The Arcade")){
				Prompt.getString("Receptionist/Linda: Sure Thing! I'll add it to your hotel bill to pay when you leave.");
			}
			if (hellolinda1.equals("Let's Dance Linda!")){
				Prompt.getString("Receptionist/Linda: (Sways a Little) Okay, I don't see what good it will do me. Oh, I'm at work!\n Maybe I'll meet you on the dance floor later and we can dance there.");
			}
			if (hellolinda1.equals("Your Hair Looks Beautiful!")){
				Prompt.getString ("(Blushes) Oh! Thank you!");	
			}
			if (hellolinda1.equals("Where Can I get Something to Eat?")){
				Prompt.getString("I know the cafe has a lot of great things, along with an amazing view. I'd check there.\nIn town there's a great chinese place called 'The Great Wall'. That's one of my favorites!");
			}
			if (hellolinda1.equals("No.")){
				Prompt.getString("Oh. If you need anything you know where I am!");
				linda = false;
			}
			if (hellolinda1.equals("You Don't Suppose Have Six Fingers On Your Left Hand Do You?")){
				Prompt.getString("Do You Always Start Conversations This Way?");
			}
			if (hellolinda1.equals("Can I have Another Welcome Cookie?")){
				Prompt.getString("Linda: Why, sure! (Hands Cookie) They're complementary! I helped bake today's batch, by the way. I'm glad you liked it!");
			}
			if (hellolinda1.equals("Can I Have A Hundred Welcome Cookies?")){
				Prompt.getString("I'm sorry, I don't have that many!");
			}
			if (hellolinda1.equals("Quit")){
				Prompt.getString("Oh. If you need anything you know where I am!");
				linda = false;
			}
		}


	}

	public static void playGuessingGame(int rand){
		int random = (int)(Math.random()*100+1);

		System.out.println("Welcome to Guessing Game!\n");
		System.out.print("I'm thinking of a number from one to one hundred! I bet you can't guess it!\n");

		double number1= Prompt.getDouble ("What is Your Guess?");

		int counter = 0;
		while (number1 != rand){

			counter ++;
			if (number1 > rand){
				System.out.println("Too High!\n");
			}

			else {
				System.out.println("Too Low!\n");
			}

			number1= Prompt.getDouble ("Guess Again!");

			if (counter == 10){
				System.out.println("You ran out of guesses! You lose :(");
				return;
			}
		}
		System.out.println("Congrats! You guessed the number! You win! :D");
	}

	public static void main(String[] args) throws InterruptedException
	{
		// TODO Auto-generated method stub

		String [] lift = new String [10];
		for (int i=0; i < 10; i++){
			lift [i]="[ ]";
		}

		int currentlocation= 9;
		lift [currentlocation]="[*]";

		printShaft (lift); 

		int random = (int)(Math.random()*100+1);
		String name =Prompt.getString("Receptionist: Welcome to the SummerTech Hotel! I'm Linda, your hotel receptionist!\nWhat name did you place your reservaton under?");
		Prompt.getString(name + "........Ah ha! Yes, your room is number " + random + ".\n The Elevator is to your left. If you have problems you can visit the main desk. Enjoy your stay!");

		boolean elevator = true;
		while (elevator){

			int floor= Prompt.getInt("What floor would you like to go to?\n1 Lobby\n2 Rooms (1-25)\n3 Rooms (26-50)\n4 Rooms (51-75)\n5 Rooms (76-100)\n6 Indoor Pool and Fitness\n7 Gaming, arcade and Dance\n8 Meeting and Buisness\n9 Spa and Sauna\n10 Sky lounge, Cafe, and Botanical Gardens");
			//10 - i -> Floor Number based on the index of the Array
			int index = 10 - floor; 
			if (index > currentlocation){

				for (;currentlocation<index;currentlocation++){
					lift[currentlocation]= "[*]";
					printShaft(lift);
					lift[currentlocation]="[ ]";
					Thread.sleep(1000);
				}

				lift[currentlocation]= "[*]";
				printShaft(lift);
				


			}
			else {

				for (;currentlocation>index;currentlocation--){
					lift[currentlocation]= "[*]";
					printShaft(lift);
					lift[currentlocation]="[ ]";
					Thread.sleep(1000);
				}

				lift[currentlocation]= "[*]";
				printShaft(lift); 


			}


			if (floor==1&&currentlocation==9){
				System.out.println("This is the First Floor- Lobby");
				String lobby1=Prompt.getString("What would you like to Do?\nA Use the Elevator\nB Visit Front Desk\nC Exit Hotel (Leave Game)");
				if (lobby1.equals("B")){
					sayHelloToLinda();
				}
				if (lobby1.equals("C")){
					String leaving1 = Prompt.getString("Would you like to leave the hotel (and the game)?");
					if (leaving1.equals("Yes")){
						System.out.println("Thank you for lodging with us!");
						break; 
					}
					if (leaving1.equals("No")){
						continue;
					}

				}
			}
			if (floor==2&&currentlocation==8){
				System.out.println("This is the Second Floor- Hotel Rooms Floor A (1-25)");
				if (random > 25){
					System.out.println("But this is not your floor. Your room numer is " + random);
				}
				else{

					System.out.println("Your room is on this floor! (" + random + ")");
					doStuffInMyRoom(random);

				}
			}

			if (floor==3&&currentlocation==7){
				System.out.println("This is the Third Floor- Hotel Rooms Floor B (26-50)");

				if (random < 26|| random > 50){
					System.out.println("But this is not your floor. Your room numer is " + random);
				}
				else{
					System.out.println("Your room is on this floor! (" + random + ")");
					doStuffInMyRoom(random);

				}
			}
			if (floor==4&&currentlocation==6){
				System.out.println("This is the Fourth Floor- Hotel Rooms Floor C (51-75)");

				if (random < 51|| random >75){
					System.out.println("But this is not your floor. Your room numer is " + random);
				}
				else{
					System.out.println("Your room is on this floor! (" + random + ")");
					doStuffInMyRoom(random);

				}


			}
			if (floor==5&&currentlocation==5){
				System.out.println("This is the Fifth floor- Hotel Rooms Floor D (76-100)");

				if (random < 76|| random >100){
					System.out.println("But this is not your floor. Your room numer is " + random);
				}
				else{
					System.out.println("Your room is on this floor! (" + random + ")");
					doStuffInMyRoom(random);

				}
			}

			if (floor==6&&currentlocation==4){
				System.out.println("This is the Sixth Floor- Indoor Pool and Fitness Floor");
				String todo6=Prompt.getString ("What Would You Like to do?\nASwim in the Pool\nB Go to Work Out in the Fitness Room\nC Ride the Elevator");
				if (todo6.equals("A")){
					String pool1=Prompt.getString ("You enter the pool area\n You buy a swimsuit at the swim store and put it on\nYou go into the pool and swim\n The water is not cold. It's perfect. You have the whole thing to yourself. Type 'Exit' to leave when you're done swimming.");
					if (pool1.equals("Exit")){
						continue;
					}
				}
				if (todo6.equals("B")) {
					doStuffInGym(1);
				}
				if (todo6.equals("C")){
					continue; 
				}
			}


			if (floor==7&&currentlocation==3){
				System.out.println("This is the Seventh Floor- Arcadey and Dance Floor");
				String todo7=Prompt.getString ("What Would You Like to do?\nA Play Some Games!\nB Dance!\nC Ride the Elevator.");
				if (todo7.equals("A")){

					String game1=Prompt.getString("You Walk Into the Arcade. There's soft electronic playing in the backround.\nThere are Arcade Games and Computer Games,\nbut since you don't have tokens from the front desk, you can only play the guessing game. Would You Like to Play?");
					if (game1.equals("Yes")){
						playGuessingGame(random); 

						String game2=Prompt.getString("Type 'Exit' to leave the arcade");
						if (game2.equals("Exit")){
							continue;
						}
					}
				}
				if (todo7.equals("B")){
					doStuffOnDanceFloor();
				}
				if (todo7.equals("C")){
					continue;
				}
			}

			if (floor==8&&currentlocation==2){
				System.out.println("This is the Eighth Floor- Meeting and Business Floor");

				String meet1=Prompt.getString("A meeting is going on at this time for the Board of Fun Things. Would You Like to sit in on this meeting?");
				if (meet1.equals("Yes")){

				}


			}

			if (floor==9&&currentlocation==1){
				System.out.println("This is the Nineth Floor- Spa and Sauna Floor");
				if (floor==9&&currentlocation==1){
					String dostuff6 = Prompt.getString("What Would You Like To Do?\nA Visit Spa\n B Go In Sauna\n Ride Elevator");
					if (dostuff6.equals("A")){
						Prompt.getString("Spa Lady: Hello. Welcome to Lotus Spa. I'm Tanni. Do you Have your Room Key? (Type to Hand Room Key)");
						String spa1 =Prompt.getString("Tanni: A Yes! " + name + ", room" + random + ".\nWould You be intrested in a free complete complementary treatment today?");
						if (spa1.equals("Yes")){
							spa1.toUpperCase().equals("YES");
							Prompt.getString("You Start with a foot bath, followed by a massage and facial. It feels so relaxing. Ah......");
						}

						else{
							Prompt.getString("Okay, Come Back when You're Ready for a Relaxing Time!");
						}

						String quitfromspa1=Prompt.getString("Type 'Exit' to leave the Spa");
						if (quitfromspa1.equals("Exit")){
							continue;
						}
					}
					if (dostuff6.equals("B")){
						String sauna = Prompt.getString ("You enter the sauna. The hot steam hits you strongly at first, but then you grow acoustomed to the comfort and warmth of the steam. It feels refreshing.\n Soft relaxing music plays. Type 'Exit' to leave.");
						if (sauna.equals("Exit")){
							continue; 
						}
					}
				}

			}


			if (floor==10&&currentlocation==0){
				int payment = (int)(Math.random()*40+1);
				System.out.println("This is the Tenth Floor- Sky Lounge, Cafe and Botanical Gardens Floor");
				String do10=Prompt.getString("What Would You Like to Do?\nA Eat in the Cafe\nB Hang Out in the Sky Lounge\nC Ride Elevator");
				if (do10.equals("A")){
					Prompt.getString("You walk into the cafe. It is nestled within the beautiful botanical gardens. The high greenhouse windows let in pleanty of nice sunlight\nHostess(Anna): Hello! Table For how many?");
					Prompt.getString("Hostess: Yes! We have a table right this way! Follow Me!");
					Prompt.getString("Hostess: Here we are! (You Sit Down) (You Take the Menu she's handing you) I'll have a waiter come serve you. (Hostess Leaves)");
					String stuff= Prompt.getString("Waiter: Hello, My name is Eric, and I will be your server today. Have you been enjoying your stay here so far?");
					if (stuff.equals("Yes")){
						Prompt.getString("Waiter: Excellent!");
					}
					if (stuff.equals("No.")){
						Prompt.getString ("Waiter: Oh, I'm sorry to hear that! If something's wrong with anything you should talk to Linda in the lobby.");
					}
					String stuff2= Prompt.getString("Waiter: Can I start you off with something to drink?");
					Prompt.getString("Waiter: Alright, I'll be right out with your drink(s). (Waiter Leaves)"); 
					Prompt.getString("Waitress: (Comes to table and drops off chips and dips) Enjoy! (Walks off)");
					Prompt.getString("You take a moment to look at the beutiful gardens. There are hundreds of flowers in pretty arrangements\nThere's a fountain with spraying water and a few butterflies roaming around. You sit still to see if one will land on you.\n Outside is an amazing view that stretches for miles.");
					String bwdFood= Prompt.getString("Waiter: I'm back with your " + stuff2 + "! Now, what would you like to eat?"); 
					Prompt.getString("Waiter: Excellent Choice! That's one of my personal favorites! I'll be right back with your food (Takes Menu)Until then enjoy some nachos.(Leaves)");
					Prompt.getString("You eat a chip. It's salty but very tasty. Your drink is also very nice!");
					String refill= Prompt.getString("Waiter: I'm back! (puts " + bwdFood + " down on the table) Enjoy your food. Would you like a refill for your drink?\nA Yes Please\nB No, Thank you"); 
					if (refill.equals("A")){
						Prompt.getString("Waiter: Sure thing! (Takes a pitcher off a nearby cart and fills your glass)");
					}
					else if (refill.equals("B")){
						Prompt.getString("Okay! Just let me know if you need anything.");
					}
					Prompt.getString("Waiter: Enjoy! (Leaves)");

					boolean eating= true;
					while (eating){
						String exiteating= Prompt.getString("Type 'E' to Eat your " + bwdFood + ". Type 'D' to Drink your " + stuff2 + ". (Type 'Stop' to Stop Eating)");
						if (exiteating.equals("Stop")){
							eating = false;
						}
					}

					Prompt.getString("Call your waiter to pay the bill!");
					Prompt.getString("Waiter: All done? I'll get these plates out of your way. Here is the bill (props up on table)(leaves)");
					Prompt.getString("Your meal cost " + payment + " dollars. But its worth it. You enclose your payment in cash."); 
					Prompt.getString("Now, select a tip for your waiter!");
					String timetogo= Prompt.getString ("You're done! Type 'Exit' to go back to the elevator.");
					System.out.println("Hello");
					if (timetogo.equals("Exit")){
						continue;
						
						
					}


				}





			}


		}
	}
}



