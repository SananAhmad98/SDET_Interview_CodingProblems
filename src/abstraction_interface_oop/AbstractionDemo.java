package abstraction_interface_oop;

public class AbstractionDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		CircleShape cs = new CircleShape(4,5);
		cs.createShape();
		cs.moveShape();
		cs.createRectangleShape();
		cs.moveRectangleShape();
		
		
		cs.createHexagonalShape(); //That is the default method and it is not needed to be implemented by child classes.
		
		rectangleShape.createDexagonalShape(); //interface name can be utilized to call static methods directly.

	}

}
