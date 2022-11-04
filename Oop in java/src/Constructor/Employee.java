package Constructor;

public class Employee {

	String name;
	int age;
	
	Employee(String name,int age){
		this.name=name;
		this.age=age;
	}
	public static void main(String[]args) {
		Employee e1=new Employee("Swayam",21);
		Employee e2=new Employee("Satyam",21);
		
		System.out.println("Employee 1: " +e1.name+e1.age);
		System.out.println("Employee 2: " +e2.name+e2.age);
	}
}
