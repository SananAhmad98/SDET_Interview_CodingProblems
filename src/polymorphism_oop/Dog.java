package polymorphism_oop;

public class Dog extends Animal {

public void shout() {
		
		System.out.println("Dog does not shout, but it barks");
	}

public void shout(int shoutVolume) {
	
	System.out.println("Dog barks with volume: "+shoutVolume+" Hz");
	
}

	}
