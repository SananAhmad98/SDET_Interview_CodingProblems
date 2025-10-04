package abstraction_interface_oop;

public class CircleShape extends Shapes implements rectangleShape {

	CircleShape(int xdim, int ydim) {
		super(xdim, ydim);
		// TODO Auto-generated constructor stub
	}

	//If any of the methods either from abstract or interface is not implemented, then this will be marked as abstract class
	public void createShape() {
		
		System.out.println("Creating circle shape.....");
	}
	
	public void moveShape() {
		
		System.out.println("Moving circle shape.....");
		
	}
	
	
	public void createRectangleShape() {
		
		System.out.println("Creating circle shape.....");
		
	}
	
	public void moveRectangleShape() {
		
		System.out.println("Moving circle shape.....");
		
	}
	
}
