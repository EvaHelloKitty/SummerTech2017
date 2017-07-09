
public class Pet {
	
	private String name;
	private String noise;
	private String typeOfPet;
	
	public Pet (String name, String noise){
		this.name=name;
		this.noise=noise;
	}
	
	public void setName(String name){
		this.name=name;
	}
	public String getName (){
		return name;
	}
	public String getNoise (){
		return noise;
	}
	public void makeNoise (){
		System.out.println(noise);
	}
	

}
