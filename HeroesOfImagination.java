import st.Prompt;

public class HeroesOfImagination
{

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub

		boolean game = true;
		while (game){

			System.out.println("\nWelcome to HEROES OF IMAGINATION!!!");
			String start= Prompt.getString("Type start to begin!");

			if (start.equals("start"))
				System.out.println("Great!");

			//Game begins
			String alpha = Prompt.getString("Who would you like to play as? \na)Jack Blank \nb)Allegra \nc)Skerren \nd)Zhi \ne)Lorrem Ipsum \nf)Trea \ng)Jazen Knight \nh)The Magus \ni)Jonas Smart");

			//Jack
			if (alpha.equals("a")){

				System.out.println("You wake up in your bedroom. You look at the clock and realise you are late for a School of Thought class in the Winter Section of Season Still Park!");
				String bravo= Prompt.getString("You: \na)Shrug your sholders and skip the class, you'll explain everthing later \nb) Get nervous and get ready for the class, hoping your teachers won't mind that you're late \nc)Gasp loudly, run to the kitchen and grab a granola bar, and dash into Roka's room and wake him up quickly, there's not a minute to lose!!!");

				//Bad-attitude Jack/Carefree Jack(a)
				if (bravo.equals("a")){

					System.out.print("After you eat your breakfast, you recieve a call from Master Chi regarding your absence at class.\n He invites you to his private dojo to make up for the class");
					String cake= Prompt.getString("You: \na)Tell him no and hang up the phone rudely \nb)Accept his invitation and apologise for missing the class");

					if (cake.equals("a")){
						System.out.println("You hang out around the house until you get an urgent call from Stendeval. \nStendeval says that an urgent meeting is being held in the Inner Sphere that requests your prescence.");
						//String delta= Prompt.getString("You: \na)Say you'll be there right away and run to the door!\nb)Say that you'll be there half-heartedly, hang up, and take your time getting ready.");

					}
					if (cake.equals("b")){
						System.out.println("Chi accepts your apology and kindly hangs up the phone.\nYou make your way to the dojo.\nMaster Chi is waiting for you at the door.\nHe greets you kindly and leads you inside.\nBefore you enter, you think you see a rustov and get a strange sensation through your machine powers.");
						String elephant= Prompt.getString("You:\na)Tell Master Kai, you'd risk embarrasing yourself to make sure Imagination is free of enemies.\nb)Shake it off, it was probably just a strange car.");
						if (elephant.equals("a")){

						}

					}

				}
			}
		}


	}
}
