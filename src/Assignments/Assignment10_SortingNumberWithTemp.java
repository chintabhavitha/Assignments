package assignments;

public class Assignment10_SortingNumberWithTemp {

	public static void main(String[] args) {
		int[] array = {12,34,11,36,87,98,93};
		
		int temp = 0;
		
		for(int i=0;i<array.length; i++) {
			for(int j =i; j<array.length; j++) {
				
				if(array[i] <array[j]) {
					temp = array[i];
					array[i] = array[j];
					array[j] = temp;
				}
				
			}
			
		}
		
		//System.out.println(array[0]);
		System.out.println("Second Largest Number is " + array[1]);
		System.out.println("Second Largest Number is " + array[2]);
	}

}
