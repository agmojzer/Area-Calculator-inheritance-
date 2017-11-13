
public class Square extends Shape{
	static double value;
	private double width;
	public Square(double lwidth) {
		
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
		value = width*width;
		return value;
	}
}
