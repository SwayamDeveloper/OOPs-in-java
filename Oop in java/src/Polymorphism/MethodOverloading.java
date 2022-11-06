package Polymorphism;

//We can achieve polymorphism by 3 different arguments
//1.Number of arguments

class Test{
	void show(int a) {
		System.out.println("1");
	}
	
	void show() {
		System.out.println("2");
	}
	public static void main(String[] args) {
		Test t=new Test();
		t.show(10);
	}
}

//2.Sequence of argument

class Test1{
	void show(int a,String b) {
		System.out.println("show1");
	}
	
	void show(String b,int a) {
       System.out.println("show2");
	}
	
	public static void main(String[] args) {
		Test1 t = new Test1();
		t.show(10,"Swayam");
		
	}
}

//3.Type of argument

class Test2{
	void show(int a) {
		System.out.println("show program");
	}
	
	void show(String b) {
       System.out.println("show program1");
	}
	
	public static void main(String[] args) {
		Test2 t = new Test2();
		t.show(10);
		t.show('a'); //this is done because of automatic promotion
	}
}


