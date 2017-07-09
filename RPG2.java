import st.Prompt;


public class RPG2
{

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub



		boolean quiz = true;
		while(quiz){


			String start= Prompt.getString("Welcome to Epic Adventures! Type 'Start' to begin!\n");

			if (start.equals("Start"))
				System.out.print("Great!\n");

			else {
				continue;
			}



			String player= Prompt.getString("In This Game You Will Go On Your Own Epic Adventures! But First You Must Choose Your Player! Insert Your Own Name, Or Put in A Different Name For Your Character!\n");
			String one= Prompt.getString("You wake Up in a cottage with windows and doors. You sit up\n You are hungry\n The only things in the room are a table, an empty fruit bowl,\nAnd in the corner you see a satchel. Your name( " + player+ " ) is embroided on the front\nIn the satchel you find an apple, a notebook, a small pack of playing cards, and a knife to cut the apple.\n What would you like to do?\n A Keep Looking Around \nB Aquire the backpack");
			if (one.equals("A")){
				String onea= Prompt.getString("You begin to look around the cottage.\nYou crawl on your hands and knees and begin searching.\nYou find a door that leads to a small bedroom\n The bedroom has two beds in it. You look under each and in the covers for any clue of who might live here\nYou find nothing. You go back to the main room.");
			}

			if (one.equals("B")){
				String oneb = Prompt.getString("You go to the backpack.You pick it up and put the strap over your chest. The backpack is light.");
			}

			String two= Prompt.getString("Suddenly the door opens and a few men enter the room.\n They are dressed in uniforms of a white top with gold buttons and red pants.\n They wear boots and carry weapns. Your Response:\n 1 'Who Are You? What are you doing here?'\n2 'AAAAAAGH!'\n3'I have a satchel and I'm not afraid to use it!'");

			if (two.equals("1")){
				String two1= Prompt.getString("One of the gaurds comes to stand in front of you. He is tall and he bends down a bit so he can meet your eyes.\nA crest is sewn to his jacket. It bears the image of a tree a unicorn and dragon on a sea of blue\n'Don't worry,' he says slowly. 'My name is Lance Sirlum, I'm a royal guard");

				if (two.equals("2")){
					String two2 = Prompt.getString("The guards jump in surprise.\n One guard grabs your shoulders and explains that they are royal guards, but you are not in trouble.\nYou stop screaming. The guard introduces himself as Lance Sirlum, a chief gaurd.\n A crest is sewn to his jacket. It bears the image of a tree a unicorn and dragon on a sea of blue");
				}

				if (two.equals("3")){
					String two3 = Prompt.getString("The gaurds hold up their hands.\n The gaurd standing to your left tells you that he and his fellow royal gaurds are not here to harm you\nYou lower the satchel from attack position. This guard introduces himself as Lance Sirlum, a chief gaurd.\nA crest is sewn to his jacket. It bears the image of a tree a unicorn and dragon on a sea of blue");
				}










			}
		}
	}
}