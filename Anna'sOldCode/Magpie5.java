package activity5;

import java.util.Random;

/**
 * A program to carry on conversations with a human user.
 * This version:
 *<ul><li>
 * 		Uses advanced search for keywords 
 *</li><li>
 * 		Will transform statements as well as react to keywords
 *</li></ul>
 * This version uses an array to hold the default responses.
 * @author Laurie White
 * @version April 2012
 */
public class Magpie5
{
	/**
	 * Get a default greeting 	
	 * @return a greeting
	 */	
	public String getGreeting()
	{
		return "Hello, let's talk.";
	}

	/**
	 * Gives a response to a user statement
	 * 
	 * @param statement
	 *            the user statement
	 * @return a response based on the rules given
	 */
	public String getResponse(String statement)
	{
		String response = "";
		if (statement.length() == 0)
		{
			response = "Say something, please.";
		}

		else if (findKeyword(statement, "no") >= 0)
		{
			response = "Why so negative?";
		}
		else if (findKeyword(statement, "mother") >= 0
				|| findKeyword(statement, "father") >= 0
				|| findKeyword(statement, "sister") >= 0
				|| findKeyword(statement, "brother") >= 0)
		{
			response = "Tell me more about your family.";
		}
		else if (statement.indexOf("dog")>=0 || statement.indexOf("cat")>=0){
			response = "Tell me more about your pets.";
		}
		else if (statement.indexOf("Jared")>=0){
			response = "He sounds like a good teacher.";
		}
		else if (statement.trim().length()==0){
			response = "Say something, please.";
		}
		else if (statement.indexOf("Eva")>=0){
			response = "I love Eva! <3";
		}
		else if (statement.indexOf("food")>=0){
			response = "Food? FOOD!! Sorry, I'm hungry...";
		}
		else if (statement.indexOf("ducklings")>=0){
			response = "Ducklings are so cute! Baby magpies are cuter though...";
		}
		else if (statement.indexOf("Thanks")>=0||statement.indexOf("Thanks!")>=0||statement.indexOf("Thank you")>=0){
			response = "You're very welcome.";
		}
		else if (findKeyword(statement,"I like",0) >=0){
			response= Ilike(statement);
		}
		// Responses which require transformations
		else if (findKeyword(statement, "I want to", 0) >= 0)
		{
			response = transformIWantToStatement(statement);
		}
		//  Part of student solution
		else if (findKeyword(statement, "I want", 0) >= 0)
		{
			response = transformIWantStatement(statement);
		}
		else if (findKeyword(statement,"Yes",0)>=0){
			response= "Good.";
		}
		else if (findKeyword(statement,"I don't",0)>=0){
			response = transformIDontStatement(statement);
		}
		else if (findKeyword(statement,"Because",0)>=0){
			response=because(statement);
		}
		else if (findKeyword(statement,"Why?",0)>=0){
			response="Because.";
		}
		else if (findKeyword(statement,"Today is my birthday",0)>=0){
			response="Happy Birthday!!!";
		}
		else if (findKeyword(statement,"What is your name",0)>=0||findKeyword(statement,"What's your name",0)>=0){
			response="My name is Maggie.";
		}
		else if (findKeyword(statement,"How are you?",0)>=0){
			response="I am good, thank you.";
		}
		else if (findKeyword(statement,"Hi",0)>=0||findKeyword(statement,"Hi!",0)>=0||findKeyword(statement,"Hello",0)>=0){
			response="Hello!";
		}
		else
		{

			// Look for a two word (you <something> me)
			// pattern
			int psn = findKeyword(statement, "you", 0);

			if (psn >= 0
					&& findKeyword(statement, "me", psn) >= 0)
			{
				response = transformYouMeStatement(statement);
			}
			else
			{
				//  Part of student solution
				// Look for a two word (I <something> you)
				// pattern
				psn = findKeyword(statement, "i", 0);

				if (psn >= 0
						&& findKeyword(statement, "you", psn) >= 0)
				{
					response = transformIYouStatement(statement);
				}
				else
				{
					response = getRandomResponse();
				}
			}
		}
		return response;
	}
	private String Ilike (String statement){
		statement=statement.trim();
		String lastChar = statement.substring(statement.length()-1);
		if (lastChar.equals(".")||lastChar.equals("?")||lastChar.equals("!")){
			statement = statement.substring(0, statement.length() - 1);
		}
		int psn= findKeyword(statement,"I like",0);
		if (psn>=0){
			if (findKeyword(statement.substring(psn+7),"you",0)>=0){
				return transformIYouStatement(statement);
			}
			return "Tell me more about "+statement.substring(psn+7);
		}
		return getRandomResponse();
	}

	private String because(String statement){
		int psn = findKeyword(statement,"Because",0);
		if (psn+7==statement.length()){
			return "Because why?";
		}
		else{
			return getRandomResponse();
		}
	}
	private String transformIDontStatement(String statement) {
		statement= statement.trim();
		String lastChar = statement.substring(statement.length()-1);
		if (lastChar.equals(".")||lastChar.equals("?")||lastChar.equals("!")){
			statement = statement.substring(0, statement.length() - 1);
		}
		int psn = findKeyword(statement,"I don't",0);
		if (statement.substring(psn+7,psn+16).equals(" like you")){
			String why= "Why don't you like me?";
			return why;
		}
		String response = "Why don't you "+statement.substring(psn+7).trim()+"?";
		return response;
	}

	/**
	 * Take a statement with "I want to <something>." and transform it into 
	 * "What would it mean to <something>?"
	 * @param statement the user statement, assumed to contain "I want to"
	 * @return the transformed statement
	 */
	private String transformIWantToStatement(String statement)
	{
		//  Remove the final period, if there is one
		statement = statement.trim();
		String lastChar = statement.substring(statement
				.length() - 1);
		if (lastChar.equals(".")||lastChar.equals("?")||lastChar.equals("!")){
			statement = statement.substring(0, statement
					.length() - 1);
		}
		int psn = findKeyword (statement, "I want to", 0);
		String restOfStatement = statement.substring(psn + 9).trim();
		return "What would it mean to " + restOfStatement + "?";
	}


	/**
	 * Take a statement with "I want <something>." and transform it into 
	 * "Would you really be happy if you had <something>?"
	 * @param statement the user statement, assumed to contain "I want"
	 * @return the transformed statement
	 */
	private String transformIWantStatement(String statement)
	{
		//  Remove the final period, if there is one
		statement = statement.trim();
		String lastChar = statement.substring(statement
				.length() - 1);
		if (lastChar.equals("."))
		{
			statement = statement.substring(0, statement
					.length() - 1);
		}
		int psn = findKeyword (statement, "I want", 0);
		String restOfStatement = statement.substring(psn + 6).trim();
		return "Would you really be happy if you had " + restOfStatement + "?";
	}

	/**
	 * Take a statement with "you <something> me" and transform it into 
	 * "What makes you think that I <something> you?"
	 * @param statement the user statement, assumed to contain "you" followed by "me"
	 * @return the transformed statement
	 */
	private String transformYouMeStatement(String statement)
	{
		//  Remove the final period, if there is one
		statement = statement.trim();
		String lastChar = statement.substring(statement
				.length() - 1);
		if (lastChar.equals("."))
		{
			statement = statement.substring(0, statement
					.length() - 1);
		}

		int psnOfYou = findKeyword (statement, "you", 0);
		int psnOfMe = findKeyword (statement, "me", psnOfYou + 3);

		String restOfStatement = statement.substring(psnOfYou + 3, psnOfMe).trim();
		return "What makes you think that I " + restOfStatement + " you?";
	}

	/**
	 * Take a statement with "I <something> you" and transform it into 
	 * "Why do you <something> me?"
	 * @param statement the user statement, assumed to contain "I" followed by "you"
	 * @return the transformed statement
	 */
	private String transformIYouStatement(String statement)
	{
		//  Remove the final period, if there is one
		statement = statement.trim();
		String lastChar = statement.substring(statement
				.length() - 1);
		if (lastChar.equals("."))
		{
			statement = statement.substring(0, statement
					.length() - 1);
		}

		int psnOfI = findKeyword (statement, "I", 0);
		int psnOfYou = findKeyword (statement, "you", psnOfI);

		String restOfStatement = statement.substring(psnOfI + 1, psnOfYou).trim();
		return "Why do you " + restOfStatement + " me?";
	}




	/**
	 * Search for one word in phrase. The search is not case
	 * sensitive. This method will check that the given goal
	 * is not a substring of a longer string (so, for
	 * example, "I know" does not contain "no").
	 *
	 * @param statement
	 *            the string to search
	 * @param goal
	 *            the string to search for
	 * @param startPos
	 *            the character of the string to begin the
	 *            search at
	 * @return the index of the first occurrence of goal in
	 *         statement or -1 if it's not found
	 */
	private int findKeyword(String statement, String goal,
			int startPos)
	{
		String phrase = statement.trim().toLowerCase();
		goal = goal.toLowerCase();

		// The only change to incorporate the startPos is in
		// the line below
		int psn = phrase.indexOf(goal, startPos);

		// Refinement--make sure the goal isn't part of a
		// word
		while (psn >= 0)
		{
			// Find the string of length 1 before and after
			// the word
			String before = " ", after = " ";
			if (psn > 0)
			{
				before = phrase.substring(psn - 1, psn);
			}
			if (psn + goal.length() < phrase.length())
			{
				after = phrase.substring(
						psn + goal.length(),
						psn + goal.length() + 1);
			}

			// If before and after aren't letters, we've
			// found the word
			if (((before.compareTo("a") < 0) || (before
					.compareTo("z") > 0)) // before is not a
					// letter
					&& ((after.compareTo("a") < 0) || (after
							.compareTo("z") > 0)))
			{
				return psn;
			}

			// The last position didn't work, so let's find
			// the next, if there is one.
			psn = phrase.indexOf(goal, psn + 1);

		}

		return -1;
	}

	/**
	 * Search for one word in phrase.  The search is not case sensitive.
	 * This method will check that the given goal is not a substring of a longer string
	 * (so, for example, "I know" does not contain "no").  The search begins at the beginning of the string.  
	 * @param statement the string to search
	 * @param goal the string to search for
	 * @return the index of the first occurrence of goal in statement or -1 if it's not found
	 */
	private int findKeyword(String statement, String goal)
	{
		return findKeyword (statement, goal, 0);
	}

	/**
	 * Pick a default response to use if nothing else fits.
	 * @return a non-committal string
	 */
	private String getRandomResponse ()
	{
		Random r = new Random ();
		return randomResponses [r.nextInt(randomResponses.length)];
	}

	private String [] randomResponses = {"Interesting, tell me more","Hmmm.","Do you really think so?",
			"You don't say.", "Nice.", "Cool.", "I like bubbles.","Sounds fascinating."};

}
