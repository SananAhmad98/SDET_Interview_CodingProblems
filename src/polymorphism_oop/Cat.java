package polymorphism_oop;

public class Cat extends Animal {

	public void shout() {
		
		System.out.println("Cat does not shout, but it meows");
	}
	
	public void shout(int shoutVolume) {
		
		System.out.println("Cat meows with volume: "+shoutVolume+" Hz");
		
	}
	
}
