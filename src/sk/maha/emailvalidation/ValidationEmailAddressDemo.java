/**
 * Version 1.4.
 */
package sk.maha.emailvalidation;

import java.io.IOException;
import java.util.Scanner;

public class ValidationEmailAddressDemo {

	private static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) throws IOException {

		String obtainedEmailAddress;
		boolean resultOfValidationEmail;

		for (;;) {
			System.out.print("Enter email address: ");
			obtainedEmailAddress = sc.nextLine();

			resultOfValidationEmail = ValidationEmailAddress.validationEmailAddress(obtainedEmailAddress);

			System.out.println("Email address " + (resultOfValidationEmail ? "IS" : "IS NOT") + " valid.");

			if (!continueWithProgram(sc)) {
				System.out.println();
				System.out.println("Program terminated !!!");
				sc.close();
				break;
			}

			System.out.println();
		}
	}

	/**
	 * Terminating program or continue with entering email.
	 * 
	 * @param s
	 * @return answer yes or no
	 */
	private static boolean continueWithProgram(Scanner s) {

		char answer;
		do {
			System.out.println();
			System.out.println("Do you want to continue?");
			System.out.print("Yes or No? y/n : ");
			answer = s.next().charAt(0);
			s.nextLine();
		} while (answer != 'y' & answer != 'n');

		return (answer == 'y') ? true : false;
	}
}
