package java_40;

public class Bird extends Animal{
	
	public Bird() {
		super("Bird");
	}
	
	public void fly() {
		System.out.println("flying");
	}

	@Override
	public void eat() {
		System.out.println("I 'm eating sau");
	}

	@Override
	public void makeSound() {
		System.out.println("Liu lo");
	}
	
	
}
