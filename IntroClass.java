import st.Prompt;


public class IntroClass
{

	public static void main(String[] args)
	{

		boolean quiz = true;
		while(quiz){


			System.out.print("Welcome to The Quiz.\n");

			String start= Prompt.getString("Print Start to begin!\n");

			if (start.equals("Start"))
				System.out.print("Great!\n");

			else {
				continue;
			}

			System.out.print("The following question refer to american hostory and tradition.....\n");

			//US Trivia
			System.out.print("First Question.....\n");
			String first= Prompt.getString("What is the capital of New York?");

			if (first.equals("Albany")){
				System.out.print("Correct!\n");
			}

			else {
				System.out.print("WRONG! The correct answer is 'Albany'\n");
			}

			System.out.print("Question Two.....\n");
			String two= Prompt.getString("What is the biggest state in the US?\n");

			if (two.equals("Alaska")){
				System.out.print("Correct!\n");
			}
			else {
				System.out.print("WRONG! The correct answer is 'Alaska'. \n");
			}	


			System.out.print("Question Three.....\n");
			String three= Prompt.getString("Who was the first president?\n");

			if (three.equals("George Washington")){
				System.out.print("Correct!\n");
			}

			else {
				System.out.print("WRONG! The correct answer is 'George Washington'\n");
			}

			System.out.print("Question Four......\n");
			String four= Prompt.getString("Who invented the lightbulb?\n");

			if (four.equals("Thomas Edison")){
				System.out.print("Correct!\n");
			}

			else {
				System.out.print("WRONG! The correct answer is 'Thomas Edison'\n");
			}


			System.out.print("Question Five......\n");
			String five= Prompt.getString("Who directed the 20th Main regiment in the battle of Gettysburg?\n");

			if (five.equals("General Chamberlain")){
				System.out.print("Correct!\n");
			}

			else {
				System.out.print("WRONG! The correct answer is 'General Chamberlain' \n");
			}

			System.out.print("Question Six......\n");
			String six= Prompt.getString("When is Christmas?\n");

			if (six.equals("December 25th")){
				System.out.print("Correct!\n");
			}

			else {
				System.out.print("WRONG! Chrismas is celebrated on 'December 25th'\n");
			}

			String quit= Prompt.getString("Would You A Like to Quit, or B try a new type of trivia?\n");
			if (quit.equals("A")){
				quiz = false; continue;
			}

			if (quit.equals("B")){
				System.out.print("Okay! Moving onto more questions!\n");
			}

			//Math Questions
			System.out.print("The following questions will be related to math...\n");

			String uno= Prompt.getString("What is the locus of points of points three units away from a line?\n");
			if (uno.equals("Parallel Lines")){
				System.out.print("Correct!\n");
			}

			else {
				System.out.print("WRONG! The locus of points are 'Parallel Lines'\n");
			}

			String dos= Prompt.getString("A triangle with three sides of different lengths is a...\n");
			if (dos.equals("Scalene Triangle")){
				System.out.print("Correct!\n");   
			}

			else {
				System.out.print("WRONG! The correct answer is 'Scalene Triangle'\n");
			}
			String tres= Prompt.getString("A Regular Pentagon has how many degrees?\n");
			if (tres.equals("540")){
				System.out.print("Correct!\n");   
			}

			else {
				System.out.print("WRONG! The correct answer is '540'");
			}	

			String cuatro= Prompt.getString("The calcualtion for shape degrees is...\n");
			if (cuatro.equals("(n-2)180")){
				System.out.print("Correct!\n");   
			}

			else {
				System.out.print("WRONG! The correct answer is '(n-2)180'\n");
			}	    

			String cinco= Prompt.getString("An equalateral triangle has how many equal sides?\n");
			if (cinco.equals("Three")){
				System.out.print("Correct!\n");   
			}

			else if (cinco.equals("3")){
				System.out.print("Correct!\n");    
			}

			else {
				System.out.print("WRONG! The correct answer is 'Three' or '3'\n");
			}	    
			String seis= Prompt.getString("The total exterior degrees of a regular polygon totals...\n");
			if (seis.equals("360")){
				System.out.print("Correct!\n");   
			}

			else if (seis.equals("360 Degrees")){
				System.out.print("Correct!");
			}

			else {
				System.out.print("WRONG! The correct answer is '360' or '360 Degrees' \n");
			}	

			String quitagain= Prompt.getString("Would You A Like to Quit, or B try a new type of trivia?\n");
			if (quitagain.equals("A")){
				quiz = false; continue;
			}

			if (quitagain.equals("B")){
				System.out.print("Okay! Moving onto more questions!\n");


				//ELA Questions
				System.out.print("The following questions will relate to Literature...\n");

				String eno= Prompt.getString("What type of word describes a noun? An ______\n");
				if (eno.equals("adjective")){
					System.out.print("Correct!");
				}

				else {
					System.out.print("WRONG! The correct answer is 'adjective'\n");
				}	

				String owt= Prompt.getString("Who wrote the famous short story The Tell Tale Heart?");
				if (owt.equals("Edgar Allen Poe")){
					System.out.print("Correct!\n");
				}

				else {
					System.out.print("WRONG! The correct author is 'Edgar Allen Poe'\n");
				}	

				String eert= Prompt.getString("Who wrote Charlie and the Chocolate Factory?\n");
				if (eert.equals("Roald Dahl")){
					System.out.print("Correct!\n");
				}

				else {
					System.out.print("WRONG! Roald Dahl wrote this book!\n");
				}	

				String ruof= Prompt.getString("What is the indirect object in this sentence: The coach gave the team a trophy?\n");
				if (ruof.equals("Team")){
					System.out.print("Correct!\n");
				}

				else {
					System.out.print("WRONG! the Indirect Object is 'Team'\n");
				}	

				String evif= Prompt.getString("How many total syllables make up a haiku?\n");
				if (evif.equals("17")){
					System.out.print("Correct!\n");
				}

				else if (evif.equals("Seventeen")){
					System.out.print("Correct!\n");
				}

				else {
					System.out.print("WRONG! A Haiku is made up of 17 syllables, 5 in the first line, 7 in the second and 5 in the third.");
				}	

				String xis= Prompt.getString("A gerund usually ends in....(type in all caps)?\n");
				if (xis.equals("ING")){
					System.out.print("Correct!");
				}

				else if (xis.equals("I-N-G")){
					System.out.print("Correct!");
				}



				else {
					System.out.print("WRONG! A gerund usually ends in 'ING' (I-N-G) \n");
				} 

				String quityetagain= Prompt.getString("Would you like to quit? If so type YES\n");
				if (quityetagain.equals("YES")){
					quiz = false; continue;
				}

				else{
					System.out.println("Okay! The quiz must go on!\n");
				}

				//Science Questions
				System.out.println("The following questions will refer to Science");

				String sci1= Prompt.getString("Which type of rock will most liekly contain shell/shell fragments??\n");
				if (sci1.equals("Sedimentary")){
					System.out.print("Correct!");
				}

				else {
					System.out.print("WRONG! Sedimentary rocks can maintain shells. In others, the shells would be melted or destroyed completyly.");
				}

				String sci2= Prompt.getString("What type of RNA takes DNA strands and uses them to make proteins?\n");
				if (sci2.equals("t-RNA")){
					System.out.print("Correct!\n");
				}

				else {
					System.out.print("WRONG! The correct answer is t-RNA.");
				}

				String sci3= Prompt.getString("Who studied heredity and gave us information we use int hat field today?\n");
				if (sci3.equals("Gregor Mendel\n")){
					System.out.print("Correct!");
				}

				else {
					System.out.print("WRONG! The correct answer is 'Gregor Mendel'.\n");
				}

				String sci4= Prompt.getString("Mecury's core is liquid TRUE OR FALSE?\n");
				if (sci4.equals("FALSE")){
					System.out.print("Correct!\n");
				}

				else if (sci4.equals("TRUE")){
					System.out.print("WRONG! The correct answer is 'FALSE'.\n"); 
				}


				String sci6 = Prompt.getString("H2O or CO2: Which is the organic molecule?\n");

				if (sci6.equals("CO2")){
					System.out.print("Correct!\n");
				}

				else {
					System.out.println("WRONG! Water is not an organic molecule!\n");
				}


				String quitquit= Prompt.getString("Would you like to quit? If so type YES\n");
				if (quitquit.equals("YES")){
					quiz = false; continue;
				} 	

				else {
					System.out.println("Okay! The quiz must go on!\n");

				}

				//Pony Questions
				System.out.println("The following questions will refer to ponies");

				String pony1= Prompt.getString("What are the names of the two rulers of the land of Equestria?");
				if (pony1.equals("Princess Celestia and Princess Luna")){
					System.out.print("Correct!\n");
				}

				else if (pony1.equals("Princess Luna and Princess Celestia")){
					System.out.print("Correct!\n");
				}

				else {
					System.out.println("WRONG! The ponies of Equestria and ruled by Princess Celestia and Princess Luna.");
				}

				String pony2= Prompt.getString("There are four types of ponies: Pegasus, Earth Pony, Unicon and _______\n");
				if (pony2.equals("Alicorn")){
					System.out.print("Correct!\n");
				}

				else {
					System.out.print("WRONG! The correct answer is 'Alicorn'. These ponies have both wings and horns.\n"); 
				}

				String pony3= Prompt.getString("Where do the KNOWN Apple Family Earth Ponies live besides Ponyville (Sweet Apple Acres), and Manehatten?\n");
				if (pony3.equals("Applaloosa")){
					System.out.print("Correct!\n");
				}

				else {
					System.out.print("WRONG! The correct answer is 'Appleloosa'.\n"); 
				}

				String pony4= Prompt.getString("TRUE OR FALSE Ponies eat Rainbows?\n");
				if (pony4.equals("FALSE")){
					System.out.print("Correct!\n");
				}

				else {
					System.out.print("WRONG! Pegasus ponies MAKE rainbows in Cloudsdale, but ponies do not eat rainbows.\n"); 
				} 

				String pony5= Prompt.getString("Only one pony has become an alicorn within her lifetime. What is her name?\n");
				if (pony5.equals("Twilight Sparkle")){
					System.out.print("Correct!\n");
				}

				else {
					System.out.print("WRONG! The answer is Twilight Sparkle.\n"); 
				} 

				String pony6= Prompt.getString("One (pony) get one of these on thier flank when they discover their special talent? A _______ ____\n");
				if (pony6.equals("Cutie Mark")){
					System.out.print("Correct!\n");
				}

				else {
					System.out.print("WRONG! The answer is Cutie Mark.\n"); 
				} 

				String quitquitquit= Prompt.getString("Would you like to quit? If so type YES\n");
				if (quitquitquit.equals("YES")){
					quiz = false; continue;
				}

				else{
					System.out.println("Okay! The quiz must go on!\n");
				}

				System.out.println("The following questions will relate to spanish.");
				String spa1= Prompt.getString("Quiero un vaso de leche, por favor: What does the person want?\n");
				if (spa1.equals("A Glass of Milk")){
					System.out.print("Correct!\n");
				}

				else if (spa1.equals("Milk")){
					System.out.println("Correct!\n");
				}
				else {
					System.out.print("WRONG! The answer is milk or a glass of milk.\n"); 
				} 

				//Total Questions -> 31 Questions

			}	    
		}
	}
}



