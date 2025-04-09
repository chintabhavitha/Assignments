package Practice;

import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.time.LocalDateTime;
import java.util.logging.Logger;

public class comments {

	public static void main(String[] args) throws FileNotFoundException {

		// prints a text with in new line at end
		System.out.println("Hello World");

		// it prints a text with in same line
		System.out.print("Hello ");
		System.out.print("World ");
		System.out.println("java");
		System.out.println("Hello World java");

		// printf explicitly named for formatting the content
		System.out.printf("%s this is %d yes it is %b and but only %.2f", "Hello World java", 123, "True", 98.999);
		System.out.println(" ");

		/*
		 * printf and format are functionally identical but methods names are different
		 * and here \n indicates escapes the line - break the output in to next line
		 */
		System.out.format("%s this is %d yes it is %b \n and but only %.2f", "Hello World java", 123, "True", 98.999);
		System.out.println(" ");

		// append is used to join multiple print statements
		System.out.append("Hi peeps ").append("welcome to java world");
		System.out.println();

		// write is used to print the ascii values
		System.out.write(78);
		System.out.println(); // it is needed to print the value in next line

		System.out.write(77);
		System.out.flush();
		System.out.println();
		/*
		 * flush() especially in situations like logging or interactive programs,
		 * Normally, Java will wait and group up the output to make it faster (called
		 * buffering). But sometimes you want to see the output right away
		 */

		System.err.println("Error this is a error message");

		// logs of program
		Logger log = Logger.getLogger("log");
		log.info("info");
		log.warning("warning");

		// print logs in a file
		PrintWriter writer = new PrintWriter("C:\\AutomationTraining\\AutomationProject\\src\\Practice\\log.txt");
		writer.println("print the logs");
		writer.println(LocalDateTime.now() + "  print the logs with date and time");
		writer.close();

		// combining print statements with log
		System.out.println("Info: Application started");
		System.err.println("Error: something went wrong");

		/**
		 * Methods like print(), printf(), format(), append(), and write() don’t move to
		 * a new line automatically. They keep the output on the same line. when we use
		 * this methods in print statements, the text will be printed in same line will
		 * not move to next line so we have to use system.out.println() statement
		 */

	}

}
