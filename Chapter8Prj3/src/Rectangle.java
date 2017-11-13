
public class Rectangle extends Shape {
	static double value;
	private double height, width;

	public Rectangle(double lwidth, double lheight) {
		height = lheight;
		width = lwidth;
		
	}
	public double getHeight() {
		return height;
	}
	public void setHeight(double lheight) {
		height = lheight;
		return;
	}
	
	public double getWidth() {
		return width;
	}
	
	public void setWidth(double lwidth) {
		width = lwidth;
		return;
	}
	
	@Override
	public double getArea() {
		value = height*width;
		return value;
	}
}
