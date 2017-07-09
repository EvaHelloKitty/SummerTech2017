import st.Prompt;


public class MLPSongQuiz
{

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub

		boolean game = true;
		while(game){

			System.out.println("\nWelcome to the My Little Pony Song Lyrics Quiz!");
			String pony= Prompt.getString("Type Start to begin!");
			if (pony.equals("Start")){
				System.out.println("Ponyrific!");

				//Game begins
				String mane= Prompt.getString("What song would you like to quiz yourself on?:\na)My Little Pony: Main Theme\nb)You'll Play Your Part\nc)Generosity");

				System.out.println("Great choice!\nRemeber to type all the missing lyrics in low caps with no punctuation(except space),\nand fill in the missing lyrics!");

				//Mane Theme
				if (mane.equals("a")){
					String applejack= Prompt.getString("My Little Pony, My Little Pony\nAhhh...\n______________ wonder what...");
					if (applejack.equals("my little pony i used to")){
					}
					else {
						System.out.println("Whoops! Wrong lyrics!");
					}
					String braeburn =Prompt.getString("...friendship could be.\nMy Little Pony\n___________with me...");
					if (braeburn.equals("until you all shared its magic")){					
					}
					else {
						System.out.println("Whoops! Wrong lyrics!");
					}
					String canterlot = Prompt.getString("...Big Adventure\n____________\nA beautiful heart");
					if (canterlot.equals("tons of fun")){
					}
					else {
						System.out.println("Whoops! Wrong lyrics!");
					}
					String dinkydoo = Prompt.getString("...Faithful and strong\n____________\nand magic makes it...");
					if (dinkydoo.equals("sharing kindness its an easy feat")){
					}
					else {
						System.out.println("Whoops! Wrong lyrics!");
					}
					String equestria = Prompt.getString("...all complete\n____________\nPony");
					if (equestria.equals("you have my little")){
					}
					else {
						System.out.println("Whoops! Wrong lyrics!");
					}
					String fluttershy = Prompt.getString("...Dont't you know you're all my very best\n_______________\n<3");
					if (fluttershy.equals("friends")){
					}
					else {
						System.out.println("Whoops! Wrong lyrics!");
					}
					System.out.println("My Little Pony, My Little Pony\nAh...\nMy Little Pony\nI used to wonder what friendship could be\nMy Little Pony\nUntil you all shared its magic with me\nBig advernture\nTons of fun!\nA beautiful heart\nFaithful and strong\nSharing kindness\nIt's and easy feat, and magic makes it\nAll complete!\nYou have, My Little Pony\nDon't you know you're all my very best friends\n<3");
					
				}
			}



		}

	}
}
