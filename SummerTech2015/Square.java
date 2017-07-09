
public class Square extends Rectangle{
	
	public Square(int width){
		super (width, width);
	}
	public void setWidth(int newWidth){
		super.setWidth(newWidth);
		super.setHeight(newWidth);
	}
	public void setHeight(int newWidth){
		super.setWidth(newWidth);
		super.setHeight(newWidth);
	}
}
