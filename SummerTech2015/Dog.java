
public class Dog extends Pet{
	
	private String breed;
	
	public Dog (String name, String breed){
		super(name, "Woof!");
		this.breed=breed;
	}
	
	public String getBreed (){
		return breed;
	}
	public void bark(){
		makeNoise();
	}
	public void run(){
		System.out.println("Your dog is running.");
	}
	public String toString (){
		return "Dog| Name:"+getName()+", Breed:"+breed;
	}

}
