package variables;

public class TypesOfVariables {
	
	String name1 = "Instance"; // instance variable can print using obj with in the class or outside of the class
	
	static String name2 = "Static/Global"; //static can access anywhere in the method/class or outside of the class by specifying class name

	public static void main(String[] args) {
//		
//		String name3 = "Local"; // local can print only inside the method
//		
//		TypesOfVariables obj = new TypesOfVariables();
//		System.out.println(obj.name1);
//			
//		//System.out.println(name1); 
//		System.out.println(name2);
//		System.out.println(name3); 
//		
//		System.out.println(TypesOfVariables.name2); //another method to print static variable	
		
		new TypesOfVariables().main();

	}
	
	public void main() {
		System.out.println(TypesOfVariables.name2);  
		TypesOfVariables obj = new TypesOfVariables();
		System.out.println(obj.name1);
		
		
		
	}
		

}
