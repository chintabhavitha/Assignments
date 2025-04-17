package assignments;

public class Assignment6_Operators {

	public static void main(String[] args) {
		String names[] = {"Suresh","Mahesh","Naresh"};
		int marks[] = {75, 80, 82};
		
		int updatedMarks[] = new int[3];
		
//		System.out.println("Updated Marks: ");
//		System.out.println("Suresh :" + (marks[0] + 10));
//		System.out.println("Mahesh : " + (marks[1]+10));
//		System.out.println("Naresh : " + (marks[2]+10));
		
		
		updatedMarks[0] = marks[0]+ 10;
		updatedMarks[1] = marks[1]+ 10;
		updatedMarks[2] = marks[2]+ 10;
		
		System.out.println("Updated Marks :" + "\n" + "Suresh : " + updatedMarks[0] + "\n" + "Mahesh : "+ updatedMarks[1] + "\n" + "Naresh : " + updatedMarks[2]);
		
		float averageMarks = (updatedMarks[0] + updatedMarks[1] + updatedMarks[2])/3 ;
		
		System.out.println("Average Marks :" + averageMarks);
		
		
	}
}
