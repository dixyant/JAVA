// program to demonstrate all three types of constructor in java 
class Constructor {
	Integer id;
	String name;

	Constructor(){
		// default constructor  
		id = 12;
		name = "Dikshyant Adhikari";
		System.out.println("Default Constructor Called.");
	}


	Constructor(Integer id,String name){
		this.id = id;
		this.name = name;
		System.out.println ("Parametarized Constructor Called.");
	}

	Constructor(Constructor c){
		id = c.id;
		name = c.name;
		System.out.println("Copy Constructor Called");
	}
	public static void main (String[] args){
		Constructor c1 = new Constructor ();
		Constructor c2 = new Constructor (12, "Dikshyant Adhikari");
		Constructor c3 = new Constructor (c1);

}

}