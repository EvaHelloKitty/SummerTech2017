package Lasttry;


public class Person {

	private String name;
	private String eyecolor;
	private int height;
	private String haircolor;
	public Person (String name, String eyecolor, int height, String haircolor){
		this.name=name;
		this.eyecolor=eyecolor;
		this.height=height;
		this.haircolor=haircolor;
	}
	public String getName(){
		return name;
	}
	public void setHeight(int height){
		this.height=height;
	}
	public String getEyecolor() {
		return eyecolor;
	}
	public void setEyecolor(String eyecolor) {
		this.eyecolor = eyecolor;
	}
	public String getHaircolor() {
		return haircolor;
	}
	public void setHaircolor(String haircolor) {
		this.haircolor = haircolor;
	}
	public int getHeight() {
		return height;
	}
	public void speak (String words){
		System.out.println(name +" says "+ words);
	}
	
	
}
