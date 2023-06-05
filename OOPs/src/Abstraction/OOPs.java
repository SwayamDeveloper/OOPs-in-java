//Abstraction: it means hiding unnecessary or unusefull things from user and showing only relevant things. Ex: ATM.
//With two types we can achieve Abstraction 
//1.Abstract keyword
//2.Interface

package Abstraction;

public class OOPs {
public static void main(String[] args) {
	
	Horse h=new Horse();
	h.walk();
	h.eat();
	
	Chicken ch= new Chicken();
	ch.walk();
	ch.eat();
	
}
}

abstract class Animal{
	void eat() {
		System.out.println("animal eats");
	}

	
	abstract void walk();
}

class Horse extends Animal{
	void walk() {
		System.out.println("walk on 4legs");
	}
}

class Chicken extends Animal{
	void walk() {
		System.out.println("walk on 2legs");
	}
}