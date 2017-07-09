
public class Cat extends Pet{

	String breed;
	public Cat (String name,String breed){
		super(name, "Meow!");
		this.breed=breed;
	}
	
	public void rubFurniture (){
		System.out.println("Your cat is rubbing itself against your furniture.");
	}
	public void drinkMilk (){
		System.out.println("Your cat is drinking milk.");
	}
	public String toString (){
		return "Cat| Name:"+getName()+", Breed:"+breed;
	}
}
