//Class is a collection of function and properties. 
package Class;

public class OOPs {
public static void main(String[] args) {
	 Pen p= new Pen();
     p.setcolor("blue");
     p.setprice(5);
  System.out.println(p.color);  
  System.out.println(p.price);

  student st= new student();
  st.setname("swayam");
  st.setid(1);
  
  System.out.println(st.id);
  System.out.println(st.sname);
  
  Animal n=new Animal();
  n.setage(5);
  n.setname("cow");
  
  System.out.println(n.age);
  System.out.println(n.name);
}
}
class Pen{
	//Properties
	String color;
	int price;
	
	//function
    void setcolor(String newcolor) {
		color= newcolor;
	}
    
    void setprice(int newprice) {
		price= newprice;
	}
}

class student{
	String sname;
	int id;
	
	void setname(String newname) {
		sname=newname;
	}
	
	void setid(int newid) {
		id=newid;
	}
}

class Animal{
	String name;
	int age;
	
	
	void setname(String newname) {
		name=newname;
	}
	
	void setage(int newage) {
		age=newage;
	}
}

