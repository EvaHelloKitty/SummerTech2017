package Java;

public class EvaObject {

	String name;
	int age;
	

	//Name template
	public EvaObject(String name) {
		this.name = name; 
	}
	//Age template
	public void charAge(int charAge){
		age = charAge;
	}

	public void printCharacter(){
		System.out.println("Name: " + name);
		System.out.println("Age: " + age);
	}
	

	

}
