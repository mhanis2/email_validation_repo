/**
 * Version 1.4.
 */
package sk.maha.emailvalidation;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ValidationEmailAddress {

	/**
	 * Get email address from user.
	 * 
	 * @param str
	 * @return result of validation: true or false
	 */
	static boolean validationEmailAddress(String str) {
		Pattern pattern;
		Matcher matcher;

		pattern = Pattern.compile("[a-zA-Z][a-zA-Z0-9._]*@[a-zA-Z][a-zA-Z0-9.]*\\.[a-zA-Z0-9]+");
		matcher = pattern.matcher(str);

		return matcher.matches();
	}
}
