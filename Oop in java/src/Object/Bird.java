//Initialize object through Method
package Object;

public class Bird {

	int age;
	String color;
	
	void fly(int a,String b) {
	
		age=a;
		color=b;
		
	}
	void display() {
		System.out.println(age+" "+color);
	}
	
}
