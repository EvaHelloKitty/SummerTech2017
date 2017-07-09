package Java;

public class ObjectTrial2016Object {

	String name;
	int age;

	//Name template
	public ObjectTrial2016Object(String name) {
		this.name = name; 
	}
	//Age template
	public void characterAge(int characterAge){
		age = characterAge;
	}

	public void printCharacter(){
		System.out.println("Name: " + name);
		System.out.println("Age: " + age);
	}
	

}
