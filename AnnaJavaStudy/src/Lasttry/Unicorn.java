package Lasttry;

public class Unicorn {
	private String name;
	private String manecolor;
	private String bodycolor;
	private String sparkles;
	private String wings;
	public Unicorn (String name, String manecolor, String bodycolor, String sparkles){
		this.name=name;
		this.manecolor=manecolor;
		this.bodycolor=bodycolor;
		this.sparkles=sparkles;
	}
	public String getWings() {
		return wings;
	}
	public void setWings(String wings) {
		this.wings = wings;
	}
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	public String getManecolor() {
		return manecolor;
	}
	public void setManecolor(String manecolor) {
		this.manecolor = manecolor;
	}
	public String getBodycolor() {
		return bodycolor;
	}
	public void setBodycolor(String bodycolor) {
		this.bodycolor = bodycolor;
	}
	public String getSparkles() {
		return sparkles;
	}
	public void setSparkles(String sparkles) {
		this.sparkles = sparkles;
	}
	public void go (String place){
		System.out.println("Your Unicorn is going to "+place);
	}
	public void fly (){
		System.out.println(getName()+" is flying!");
	}
}
