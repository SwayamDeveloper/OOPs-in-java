package Inheritance;

public class Animal {

	void eat() {
		System.out.println("Dog is eating");
	}
	
}

class Dog extends Animal{
	public static void main(String[] args) {
		Dog d = new Dog();
		d.eat();
	}
}
