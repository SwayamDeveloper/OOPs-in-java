//Encapsulation means:binding data into a single unit . its also implements data hiding
//getter & setter
//Get:to return the value
//Set: to set the value

//this : this keyword is used to refer to the current object.
package Encapsulation;

public class OOPs {
public static void main(String [] args) {
	
	Pen p1=new Pen();
	p1.setname("Blue");
	System.out.println(p1.getname());
	p1.price(5);
	System.out.println(p1.getprice());
	
}
}

class Pen{
	private String name;
	private int price;
	
	String getname() {
		return this.name;
	}
	
	int getprice() {
		return this.price;
	}
	
	void setname(String newname) {
		this.name=newname;
	}
	
	void price(int newprice) {
		this.price=newprice;
	}
	
	
}
