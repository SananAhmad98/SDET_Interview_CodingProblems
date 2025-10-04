package inheritance_oop;

public class Bus extends Vehicle {

	private String busModel;
	private String busMileage;
	
	public Bus(String numPlate, String color, String busModel, String busMileage) {
		
		super(numPlate,color);
		this.busModel = busModel;
		this.busMileage = busMileage;
	}

	public String getBusModel() {
		return busModel;
	}

	public void setBusModel(String busModel) {
		this.busModel = busModel;
	}

	public String getBusMileage() {
		return busMileage;
	}

	public void setBusMileage(String busMileage) {
		this.busMileage = busMileage;
	}

	@Override
	public String toString() {
		return "Bus [BusModel= " + this.getBusModel() + ", BusMileage= " + this.getBusMileage() + " BusNumPlate= " +this.getNumPlate()+ " BusColor= " + this.getColor()+ "]";
	}
		
}
