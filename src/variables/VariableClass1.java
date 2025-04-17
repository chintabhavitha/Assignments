package variables;

public class VariableClass1 {

	public static void main(String[] args) {
		
		TypesOfVariables obj = new TypesOfVariables();
		System.out.println("using Object  " + obj.name1);
		
		TypesOfVariables.main(args);  //whatever code is there in TypesOfVariables class that can be there can be there in this
		
		System.out.println(TypesOfVariables.name2); //static, it access outside of the class

	}

}
