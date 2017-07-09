import st.Prompt;


public class VirtualShopping {

	public VirtualShopping() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("http://myeveningdress.co.uk/3054-thickbox/pretty-purple-party-dress.jpg\n");
		System.out.println("http://mackburry.com/wp-content/uploads/2012/07/Romantic-Pink-Wedding-Dresses2.jpg");

		
		
		int bank=34000;	
		String [] list = new String [10];
		String [] inventory = new String [10];
		int [] prices = new int [10];
		for (int i=0; i < 10; i++){
			inventory[i]="";	
		}


		list[0]="Train";	prices[0]=1500;
		list[1]="Metro";    prices[1]=2500;
		list[2]="Trolley";	prices[2]=3500;
		list[3]="Tram";		prices[3]=1000;
		list[4]="Monorail"; prices[4]=4500;
		list[5]="Express (Store Manager's Choice)";  prices[5]=25000;
		list[6]="Shinkansen"; prices[6]=7500;
		list[7]="Maglev";   prices[7]=6500;
		list[8]="Diesel Train"; prices[8]=4500;
		list[9]="Steam Train"; prices[9]=2500;

		boolean dressShopping= true;

		while (dressShopping){
			
			String welcome= Prompt.getString("Welcome to the Pet Train Adoption Center! We currently sell these trains:");

			for (int i= 0; i < 10; i++){
				System.out.print(list[i]+" at price: " + prices[i]+ "\n");
			}



			String which= Prompt.getString("Which Pet Train Would You Like to Purchase?\n");

			int index = 0; 
			for (int i= 0; i < 10; i++){
				if (which.equals(list[i])){
					index = i;
				}
			}

			if (bank>=prices[index]){
				bank -= prices[index];
				for (int i = 0; i < 10; i++){
					if (inventory[i].equals("")){
						inventory[i]=list[index];
						list[index]=""; 
						prices[index]=0; 
						break;
					}
				}
			}


			else{
				System.out.println("You Don't Have Enough Money To Buy This Train!");
				dressShopping = false;
				continue;
			}

			System.out.println("\nYou have purchased the following pet trains:");
			for (int i = 0; i < 10; i++){
				System.out.println(inventory[i]);
			}
			
			System.out.println("You have "+ bank + " dollars");


			String quit= Prompt.getString ("Would you like to quit?");
			if (quit.equals("Yes")||quit.equals("yes")){
				dressShopping = false;

			}
		}

		
		
		
	}

}
