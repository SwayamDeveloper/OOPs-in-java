package Inheritance;

class A2{
	 void showA() {
		 System.out.println("A1 class method");
	 }
}

class B2 extends A2{
	 void showB() {
		 System.out.println("B1 class method");
	 }
}

class C1 extends A2{
	 void showC() {
		 System.out.println("C class method");
	 }
	 
	 public static void main(String[] args) {
		 A1 Obj=new A1();
		 Obj.showA();
		 
		 B1 Obj1=new B1();
		 Obj1.showA();
		 Obj1.showB();
		 
		 C Obj2=new C();
		 Obj2.showA();       
		 Obj2.showB();
		 Obj2.showC();
	 }
}
