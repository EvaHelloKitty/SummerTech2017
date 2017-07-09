
public class Unicorn extends Pet{
	
	private String color;
	
	public Unicorn (String name, String color){
		super(name, "(magically) Neigh!");
		this.color=color;
	}
	
	public String getColor (){
		return color;
	}
	
	public void flying(){
		System.out.println("Weeee! We're flying!");
	}
	public void run(){
		System.out.println("Your unicorn is running through the clouds.");
	}
	public String toString (){
		return "Unicorn| Name:"+getName()+", Color:"+color;
	}
}
