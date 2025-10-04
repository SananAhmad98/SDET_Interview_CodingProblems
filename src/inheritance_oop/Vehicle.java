package inheritance_oop;

public abstract class Vehicle {
	
	private String numPlate;
	private String color;
	
	public Vehicle(String numPlate, String color) {
		super();
		this.numPlate = numPlate;
		this.color = color;
	}

	public String getNumPlate() {
		return numPlate;
	}

	public void setNumPlate(String numPlate) {
		this.numPlate = numPlate;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	@Override
	public String toString() {
		return "Vehicle [getNumPlate= " + this.getNumPlate() + ", Color= " + this.getColor() + "]";
	}
}
