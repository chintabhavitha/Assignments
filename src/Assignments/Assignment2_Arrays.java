package assignments;

public class Assignment2_Arrays {

	public static void main(String[] args) {

		/*
		 * Semesters as the first dimension. 
		 * Subjects and Status/Marks as the second dimension. 
		 * Actual values for Subject Names and Marks as the third dimension.
		 * 
		 * Print Semester 2 Subject 4 and Subject 5 names
		 * Print the Status/Marks of Semester 4 Subject 3 and Subject 6.
		 */
		
		
		String Data[][][] = new String[5][6][2]; // 5 semesters, each semester having 6 subjects, each subject having subject name and status
    
		// Sem 1 subjects Names
		Data[0][0][0] = "Mathematics I";
		Data[0][1][0] = "Physics";
		Data[0][2][0] = "Chemistry";
		Data[0][3][0] = "Computer Programming";
		Data[0][4][0] = "Engineering Drawing";
		Data[0][5][0] = "Basic Electrical Eng";

		// Sem 1 subjects status(Marks)
		Data[0][0][1] = "Pass(78)";
		Data[0][1][1] = "Pass(85)";
		Data[0][2][1] = "Fail(21)";
		Data[0][3][1] = "Pass(74)";
		Data[0][4][1] = "Pass(88)";
		Data[0][5][1] = "Pass(79)";

		// Sem 2 subjects Names
		Data[1][0][0] = "Mathematics II";
		Data[1][1][0] = "Mechanics";
		Data[1][2][0] = "Environmenta sci";
		Data[1][3][0] = "Basic Electronics";
		Data[1][4][0] = "Engineering Physics";
		Data[1][5][0] = "Engineering Graphics";

		// Sem 2 subjects status(Marks)
		Data[1][0][1] = "Pass(82)";
		Data[1][1][1] = "Pass(77)";
		Data[1][2][1] = "Pass(93)";
		Data[1][3][1] = "Fail(19)";
		Data[1][4][1] = "Fail(24)";
		Data[1][5][1] = "Pass(90)";

		// Sem 3 subjects Names
		Data[2][0][0] = "Data Structures";
		Data[2][1][0] = "Discrete Mathematics";
		Data[2][2][0] = "Digital Electronics";
		Data[2][3][0] = "Operating Systems";
		Data[2][4][0] = "Signals and Systems";
		Data[2][5][0] = "Object oriented Prog";

		// Sem 3 subjects status(Marks)
		Data[2][0][1] = "Pass(88)";
		Data[2][1][1] = "Pass(81)";
		Data[2][2][1] = "Pass(76)";
		Data[2][3][1] = "Fail(32)";
		Data[2][4][1] = "Pass(85)";
		Data[2][5][1] = "Pass(78)";
		
		// Sem 4 subjects Names
		Data[3][0][0] = "Algorithms";
		Data[3][1][0] = "Computer Networks";
		Data[3][2][0] = "Database Systems";
		Data[3][3][0] = "Micro Processors";
		Data[3][4][0] = "Communication Engineering";
		Data[3][5][0] = "Software Engineering";

		// Sem 4 subjects status(Marks)
		Data[3][0][1] = "Pass(91)";
		Data[3][1][1] = "Pass(73)";
		Data[3][2][1] = "Fail(19)";
		Data[3][3][1] = "Pass(80)";
		Data[3][4][1] = "Pass(76)";
		Data[3][5][1] = "Pass(87)";
		
		// Sem 5 subjects Names
		Data[4][0][0] = "Probability and stats";
		Data[4][1][0] = "Machine learning";
		Data[4][2][0] = "Compiler Design";
		Data[4][3][0] = "Theory of computation";
		Data[4][4][0] = "Embedded Systems";
		Data[4][5][0] = "Computer Graphics";

		// Sem 5 subjects status(Marks)
		Data[4][0][1] = "Pass(86)";
		Data[4][1][1] = "Pass(88)";
		Data[4][2][1] = "Pass(84)";
		Data[4][3][1] = "Pass(95)";
		Data[4][4][1] = "Pass(73)";
		Data[4][5][1] = "Pass(90)";
		
		System.out.println("Semester 2 Subject 4 and Subject 5 names: " + Data[1][3][0]+ " , " + Data[1][3][1] + " and " + Data[1][4][0] + " , "+ Data[1][4][1] );
		System.out.println("The Status/Marks of Semester 4 Subject 3 and Subject 6 names: " + Data[3][2][0] + " , "+ Data[3][2][1] + " and " + Data[3][5][0] + " , " + Data[3][5][1]);
       
		
		
		
		

	}
}
