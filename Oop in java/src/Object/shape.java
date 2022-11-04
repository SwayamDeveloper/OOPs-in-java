//Initialize object through Constructor

package Object;

public class shape {

	public shape()     //Constructor doesn't have any return type even void.	
	{      
          System.out.println("this is a triangle");
	 
	}
	public static void main(String []args) {
		
		//two ways of creating constructor
		
		shape sh = new shape();      //1st way
	    new shape();                //2nd way
		
	}
}
