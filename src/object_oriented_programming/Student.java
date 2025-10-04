package object_oriented_programming;

public class Student {

	private String name;
	private int age;
	private String address;

	
	public Student(String name, int age, String address) {
		this.name = name;
		this.age = age;
		this.address = address;
	}

	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}
	
	

	@Override
	public String toString() {
		return "Student [name=" + this.getName() + ", age=" + this.getAge() + ", address=" + this.getAddress() + "]";
	}


	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Student john = new Student("John",34,"Township");
		String output = john.toString();
		System.out.println(output);
	}

}
