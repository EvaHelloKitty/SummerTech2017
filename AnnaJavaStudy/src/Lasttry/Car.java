package Lasttry;


import java.awt.Color;

public class Car {

	Color color;
	String brand;
	String owner;
	
	public Car (Color color, String brand, String owner){
		this.color=color;
		this.brand=brand;
		this.owner=owner;
	}
	public Color getColor(){
		return color;
	}
	public void setColor(Color color){
		this.color=color;
	}
	public String getBrand(){
		return brand;
	}
	public String getOwner(){
		return owner;
	}
	public void setOwner(String owner){
		this.owner=owner;
	}
	public void drive(String place){
		System.out.println("Your car is driving to "+place);
	}
	
}
