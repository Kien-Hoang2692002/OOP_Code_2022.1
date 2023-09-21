package java_40;

public class Dog extends Animal {

	public Dog() {
		super("Dog");
	}
	
	public void bark() {
		System.out.println("Go go");
	}

	@Override
	public void eat() {
		System.out.println("I'm eating xuong");
	}

	@Override
	public void makeSound() {
		System.out.println("Gau gau");
	}
	
	
}
