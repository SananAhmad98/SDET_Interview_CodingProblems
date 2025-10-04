package inheritance_oop;

public class Car extends Vehicle {

	private String carModel;
	private String carMileage;
	
	public Car(String numPlate,String color,String carModel,String carMileage) {
		
		super(numPlate,color);
		this.carModel = carModel;
		this.carMileage = carMileage;
	}

	public String getCarModel() {
		return carModel;
	}

	public void setCarModel(String carModel) {
		this.carModel = carModel;
	}

	public String getCarMileage() {
		return carMileage;
	}

	public void setCarMileage(String carMileage) {
		this.carMileage = carMileage;
	}

	@Override
	public String toString() {
		return "Car [CarModel= " + this.getCarModel() + ", CarMileage= " + this.getCarMileage() + " CarNumPlate= " +this.getNumPlate()+ " CarColor= " + this.getColor()+"]";
	}
	
	
}
