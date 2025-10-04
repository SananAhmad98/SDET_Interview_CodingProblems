package abstraction_interface_oop;

public interface rectangleShape {

	
	public default void createHexagonalShape() {
		
		System.out.println("Creating hexagonal shape....");
		
	}
	
	public static void createDexagonalShape() {
		
		System.out.println("Creating Dexagonal shape....");
		
	}
	
	public void createRectangleShape();

	public void moveRectangleShape();

}
