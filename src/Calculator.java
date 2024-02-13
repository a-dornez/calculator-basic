/*
 * Program that calculates basic operations.
 * Runs in console, asks for inputs, reads them and displays results.
 * 
 * I started with a question "How to make a calculator?". That lead to the following list, that fits any calculator:
 * 		1. Receives number inputs;
 *		2. Receives an input that defines an operation;
 *		3. Does the operation;
 *		4. Displays operation's result.
 * 
 * Then proceded to design one using diagrams and pseudocode.
 *
 * After realizing I've mostly solved programming logic problems and followed tutorials, I missed having a program that
 * did not answer a given question or follow a given solution. So I thought for a while "What am I capable of doing now?",
 * "What can I do to test myself?", "Which program would have room for improvements?", and then the present idea was born: 
 * "A calculator!".
 * 
 * I wanted th project that can start quite simply, like a shop calculator and it can gradually increase in functionaly and 
 * complexity as I learn more. Even though it's simple for now, I'm quite happy of being able to make a program!
 *  @author a-dornez
 */

import java.util.Locale;
import java.util.Scanner;

public class Calculator {
	
	public static void main (String[] args) {
		
		Scanner scanner = new Scanner(System.in).useLocale(Locale.US);
		
		String performAnotherCalculation;
		do {
			System.out.print("Insert the first number: ");
			 double numberX = scanner.nextDouble();
			System.out.print("Choose a valid operation ( + , - , * , / ) : ");
			 char operation = scanner.next().charAt(0);
			System.out.print("Insert the second number: ");
			 double numberY = scanner.nextDouble();
		
			//selects operation to perform 
			double result = 0; 
			if ( operation == '+') {
					result = numberX + numberY;
			}
			else if ( operation == '-' ) {
					result = numberX - numberY;
			}
			else if ( operation == '*' ) {
					result = numberX * numberY;
			}
			else if ( operation == '/') {
					result = numberX / numberY;
			}
			else {
					System.out.println("\nYou must insert a valid operation ( + , - , * , / )");
			}
			
			System.out.println("\n" + numberX + " " + operation + " " + numberY + " = " + result + "\n");
			
			System.out.print("Perform another cacluclation? (Y/N): ");
			 scanner.nextLine();
			 performAnotherCalculation = scanner.nextLine();
		} while ( performAnotherCalculation.equalsIgnoreCase("y") );
		
		scanner.close();
	}
}
