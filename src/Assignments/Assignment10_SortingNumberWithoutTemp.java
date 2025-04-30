package assignments;

public class Assignment10_SortingNumberWithoutTemp {

//	Given values are 12 ,34,11,36,87,98,93.
//	Store the values in Array and Print second and third largest number from the above values without
//	using collections and default sort methods
	
	public static void main(String[] args) {
		int [] array = {12,34,11,36,87,98,93};
		
		for(int i =0; i<array.length; i++) {
			for (int j =i; j<array.length; j++) {
				array[i] = array[i] + array[j];
				array[j] = array[i] - array[j];
				array[i] = array[i] - array[j];
				
			}
		}
		
		//System.out.println(array[0]);
		System.out.println("Second Largest Number is " + array[1]);
		System.out.println("Second Largest Number is " + array[2]);
		
		
		

	}

}
