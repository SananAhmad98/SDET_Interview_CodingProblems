package inheritance_oop;

public class InheritenceDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Car civic = new Car("LHR 3212","Black","Latest","4321");
		String output = civic.toString();
		System.out.println(output);
		
		Bus expBus = new Bus("KHI 4321","Red","2004","5332");
		String output2 = expBus.toString();
		System.out.println(output2);
		
	}

}
