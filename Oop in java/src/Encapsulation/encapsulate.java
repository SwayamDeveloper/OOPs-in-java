package Encapsulation;

 class person {
	private String name; // private = restricted access

	// Getter
	public String getName() {
		return name;
	}

	// Setter
	public void setName(String newName) {
		this.name = newName;
	}

	class encapsulate {
		public static void main(String[] args) {
			person myObj = new person ();
			myObj.setName("John"); // Set the value of the name variable to "John"
			System.out.println(myObj.getName());
		}
	}
}