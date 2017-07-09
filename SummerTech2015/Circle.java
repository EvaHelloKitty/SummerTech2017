
public class Circle extends Oval{

	public Circle(int radius){
		super(radius, radius);
	}
	public void setRadius(int radius){
		super.setRadiusX(radius);
		super.setRadiusY(radius);
	}
	public void setRadiusX(int radius){
		setRadius(radius);
	}
	public void setRadiusY(int radius){
		setRadius (radius);
	}
	public int getRadius (){
		return super.getRadiusX();
	}
	public int getCircumference (){
		return (int) (getRadius()*getRadius()*Math.PI);
	}
}
