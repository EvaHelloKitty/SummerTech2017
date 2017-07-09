
public class LearningObjects {

	public static void main(String[] args) {
		
		Oval ov= new Oval (5, 7);
		
		System.out.println(ov.getRadiusX());
		System.out.println(ov.getRadiusY());
		
		ov.setRadiusX(13);
		ov.setRadiusY(13);
		System.out.println(ov.getRadiusX());
		System.out.println(ov.getRadiusY());
		System.out.println(ov.toString());
		System.out.println(ov.getDiameterX());
		System.out.println(ov.getDiameterY());
		
		Circle cir=new Circle(9);
		System.out.println(cir.getRadius());
		cir.setRadius(13);
		System.out.println(cir.getRadius());
		System.out.println(cir.toString());
		System.out.println(cir.getDiameterX());
		System.out.println(cir.getCircumference());
		
		System.out.println(ov.equals(cir));
	}
}

