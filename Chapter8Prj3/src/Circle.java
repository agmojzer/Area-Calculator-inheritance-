
public class Circle extends Shape {
	private double radius;
	private double PI = 3.14;
	static double value;
	
	public Circle(double lradius) {
		radius = lradius;
		
	}
	
	public double getRadius() {
		return value;
	}
	public void setRadius(double lradius) {
		radius =lradius;
	}
	
	@Override
	public double getArea() {
		value = PI*radius*radius;
		return value;
	}


}
