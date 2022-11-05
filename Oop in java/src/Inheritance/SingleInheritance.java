package Inheritance;

//public class SingleInheritance {
//
//}

class A{
	void showA() {
		System.out.println("A class method");
	}
}

class B extends A
{
	void showB()
	{
		System.out.println("B class method");
	}
	
	public static void main(String[] args) {
		A obj =new A();
		obj.showA();
//		obj1.showB();
	
		B obj1 =new B();
		obj1.showB();
		obj.showA();           //We can inherit ObjA in B but We cannot inherit ObjB in A.
	}
}