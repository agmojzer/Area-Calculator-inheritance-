import java.util.Scanner;

public class AreaCalculatorApp {

	public static void main(String[] args) {
		System.out.println("Welcome to the Area Calculator");
		Scanner sc = new Scanner (System.in);
		Console c = new Console();
		
		//instantiate variables
		double width = 0.0;
		double radius = 0.0;
		double height = 0.0;
		double area;
		
		//new instances of the shapes
		Square cSquare = new Square(width);
		Circle cCircle = new Circle(radius);
		Rectangle cRectangle = new Rectangle(width, height);
		
		//start the while loop, get user input, refer to classes, and make computations
		String userChoice;
		String choice = "y";
		while (choice.equalsIgnoreCase("Y")){
			userChoice = c.getString("Calculate the area of a circle, square, or rectangle.\n"+
								"Enter c for circle, s for square, or r for rectangle: "	);
			
			if(userChoice.equals("c")) {
				radius=c.getDouble("Enter radius: ");
				cCircle.setRadius(radius);
				area = cCircle.getArea();
				System.out.println("Area: "+area);
			
			}else if(userChoice.equals("s")) {
				 width=c.getDouble("Enter width: ");
				 cSquare.setWidth(width);
				 area = cSquare.getArea();
				 System.out.println("Area: "+area);
			
			}else if (userChoice.equals("r")) {
				width=c.getDouble("Enter width: ");
				cRectangle.setWidth(width);
				height = c.getDouble("Enter height: ");
				cRectangle.setHeight(height);
				area = cRectangle.getArea();
				System.out.println("Area: "+area);
			
			}else {System.out.println("Error, invalid entry");
			}
		
				
			choice= c.getString("Continue? y/n: ");
				
		}
		sc.close();
	}

}

