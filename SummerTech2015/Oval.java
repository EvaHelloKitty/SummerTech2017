
public class Oval {

	private int radiusX;
	private int radiusY;
	public Oval(int radiusX, int radiusY){
		this.radiusX=radiusX;
		this.radiusY=radiusY;
	}

	public void setRadiusX(int radiusX){
		this.radiusX=radiusX;
	}
	public void setRadiusY(int radiusY){
		this.radiusY=radiusY;
	}
	public int getRadiusX(){
		return radiusX;
	}
	public int getRadiusY(){
		return radiusY;
	}
	public String toString(){
		return "Oval: RadiusX "+radiusX+", RadiusY "+radiusY;
	}
	public boolean equals(Oval O){
		if (radiusX==O.getRadiusX()&&radiusY==O.getRadiusY()){
			return true;
		}
		return false;
	}
	public int getDiameterX(){
		return radiusX+radiusX;
	}
	public int getDiameterY(){
		return radiusY+radiusY;
	}
}
