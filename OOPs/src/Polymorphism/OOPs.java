//Polymorphism: It means a person who have different forms, like When we try to achieve the same thing in different forms.

//Compile time polymorphism
//*Method Overloading: A function or method having same name but different in parameters

//Runtime polymorphishm
//*Method Overriding: When parent class and child class contain same method or function is called Method Overriding.

package Polymorphism;
public class OOPs {
public static void main(String[]args) {
	Calculator calc=new Calculator();
	System.out.println(calc.sum(2, 2));
	System.out.println(calc.sum(3, 2, 4));
	
	Animal an= new Animal();
	an.walk();
}
}

//Method Overloading
class Calculator{
//method
	int sum(int a, int b) {
		return a+b;
	}
	
	//Another method
	int sum(int a, int b, int c) {
		return a+b+c;
	}
}


class Animal{
	void walk() {
		System.out.println("walk on 4 legs");
	}
}

class dog extends Animal{
	void walk() {
		System.out.println("walk on 2 legs");
	}
}