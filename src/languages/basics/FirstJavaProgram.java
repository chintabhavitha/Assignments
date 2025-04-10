package languages.basics;

import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.time.LocalDateTime;
import java.util.logging.Logger;

public class FirstJavaProgram {

	/********
	 * Advantages of Print Statements
	 * 
	 * @throws FileNotFoundException
	 ***********/

	// Debugging and error detection
	// Monitoring Program Execution
	// Testing and validation
	// Education and Learning
	// Logging system

	/**
	 * Documentation comments

	 * @param args
	 * @throws FileNotFoundException
	 */

	// this is main method it is starting point toe execute the code
	public static void main(String[] args) throws FileNotFoundException {

		// print the content and then goes to next line
		System.out.println("Hello, World!");

		// print the content and then stay on same line
		System.out.print("Hello,");
		System.out.print(" World!");
		System.out.println();

		// print the formatted content and then stay on same line
		System.out.printf("%s is completed, empid is %d and visa status is %b", "Bhavitha", 123, true);
		System.out.println();

		// Format the digits and then print the formatted content and then stay in same
		// line
		System.out.format("Total bill is %.2f ", 100.9871234);
		System.out.println();

		// Join Multiple Print statements together
		System.out.append("Full stack Automation").append("Full stack java");
		System.out.println();

		// Print the char based on ASCII value
		System.out.write(97);
		System.out.println();

		// Print Logs of Program
		Logger log = Logger.getLogger("Mylogger");
		log.info("currently line 46 is executing");
		log.warning("Warning in 47");

		
		
		//
		PrintWriter writer = new PrintWriter("C:\\AutomationTraining\\AutomationProject\\src\\languages\\basics\\log.txt");
		writer.println("Line 52 is executing");
		writer.println(LocalDateTime.now()+"Execution is compiled");
                writer.close();
		
		//error
		System.err.println("error");
		


		//
		PrintWriter writer1 = new PrintWriter(
				"C:\\AutomationTraining\\AutomationProject\\src\\languages\\basics\\log.txt");
		writer1.println("Line 52 is executing");
		writer1.println(LocalDateTime.now() + "Execution is compiled");
		writer1.close();

		// error
		System.err.println("error");

		// this is end point of executing the program
	}

}
