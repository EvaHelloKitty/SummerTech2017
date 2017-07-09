import st.Prompt;


public class mazerunner {

	public static void main(String[] args){
		// TODO Auto-generated constructor stub



			boolean game = true;
			while (game){

				String start= Prompt.getString("Everything is Going to Change. Your choices might destroy you.\nWelcome to the world of CodeWorldsCollide\nIn the game, you'll get to meet some of your favorite characters,\n relieve your favorite scenes and of course, have fun!\n Up for it? Print 'Start'\n");

				if (start.equals("Start")){
				String zone = Prompt.getString ("Hello Player!\nCome over to the character lab, where you will construct your character!");
				
				//Character Appearance
				String name = Prompt.getString("What is your name?");
				String cname = Prompt.getString("What is your character name (it can be your actual name if you want) \n");
				String hair = Prompt.getString("What color hair does your character have?\n");
				String skin = Prompt.getString("What color skin does your character have?\n");
				String eyes = Prompt.getString("What color eyes does your character have?\n");
				
				
				//Character Person
				String weakness = Prompt.getString ("My character's weakness is...\n");
				String talent = Prompt.getString ("My characher's talent is......\n");
				String food = ("My chacher's favorite food is...."); 
				
			
				}
			
				
				
				
				
				
			
			   else{
					continue;
				}

			}

		}
	}
