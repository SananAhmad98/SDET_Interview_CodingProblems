package polymorphism_oop;

public class Method_Override_Overload_Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Animal cat = new Cat();
		cat.shout(); //This will call the over-ridden method of the Animal class.
		
		Cat cat2 = new Cat(); //In this case, both methods of shout for cat class will be accessible. Method Overloading is done in cat class
		
		cat2.shout(5);
		
		Animal dog = new Dog();
		dog.shout();
		
		Dog dog2 = new Dog(); //In this case, both methods of shout for dog class will be accessible. Method Overloading is done in dog class
		dog2.shout(10);

	}

}
