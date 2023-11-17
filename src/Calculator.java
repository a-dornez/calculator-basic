/*
 * Program that calculates basic operations
 */

import java.util.Locale;
import java.util.Scanner;

public class Calculator {
	
	public static void main (String[] args) {
		
		Scanner scanner = new Scanner(System.in).useLocale(Locale.US);
		
		System.out.print("Insert the first number: ");
		 double numberX = scanner.nextDouble();
		System.out.print("Choose a valid operation ( + , - , * , / ) : ");
		 char operation = scanner.next().charAt(0);
		System.out.print("Insert the second number: ");
		 double numberY = scanner.nextDouble();
		
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
		
		scanner.close();
	}
}
