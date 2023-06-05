package Inheritance;

public class OOPs {
public static void main(String[] args) {
	      men m=new men();
	      m.legs();

	      Animal an=new Animal();
	      an.legs();
}
}
 
class Animal{
	public void legs(){
		System.out.println("dog has 4 legs");
	}
}

class men extends Animal{
	public void legs() {
		System.out.println("dog has 3 legs");
	}
}

