import st.Prompt;


public class PotatoShoppingList {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String [] a = new String [20];
		
		int c=0; 
		
		String b = "";
		
		while (!b.equals("end")){
			b=Prompt.getString("Add a potato to your list!");
			if (!b.equals("end")){
				a[c]=b;
				c++;
			}
				
		}
		for (int x=0;x<=c-1;x++){
			System.out.println(a[x]);
		}
	}
}
