package java_40;

public class Cat extends Animal{
	
	public Cat() {
		super("Cat");
	}
	
	public void meow() {
		System.out.println("Meo Meo");
	}

	@Override
	public void eat() {
		System.out.println("I 'm eating fish");
	}

	@Override
	public void makeSound() {
		System.out.println("Meo meo");
	}
	
	
	
	
}
