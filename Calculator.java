import st.Prompt;


public class Calculator
{

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub

		boolean calc = true;
		while (calc){

			System.out.println("Welcome to Calculator!\n");	

			double firnum= Prompt.getDouble ("First, Insert one number!");
			double secnum= Prompt.getDouble ("Next, Enter a Second Number!");

			String opera= Prompt.getString ("What Would you like to do?");
			if (opera.equals("Add")){
				System.out.println(firnum + secnum);
			}

			if (opera.equals("Subtract")){
				System.out.println(firnum - secnum);
			}
			if (opera.equals("Multiply")){
				System.out.println(firnum * secnum);
			}

			if (opera.equals("Divide")){
				System.out.println(firnum / secnum);
			}


			String quiz= Prompt.getString ("Would you like to quit?");
			if (quiz.equals("Yes")||quiz.equals("yes")){
				calc = false;
			}

		}

	}

}
