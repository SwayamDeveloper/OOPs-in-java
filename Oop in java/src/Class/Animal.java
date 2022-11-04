package Class;

public class Animal {
   
	public void eat() {
		System.out.println("Dog is eating");
	}
	
	public void run() {
		System.out.println("Dog is running");
	}
	
	public void sleep() {
		System.out.println("Dog is sleeping");
	}
	
	
	public static void main(String[]args) {
	    Animal buzo= new Animal();
	    buzo.eat();
	    buzo.run();
	    buzo.sleep();
	    
	    Bird kingfisher = new Bird();
	    kingfisher.fly();
	}
	
	
	
}
class Bird{
	public void fly() {
		System.out.println("bird is flying");
	}
}