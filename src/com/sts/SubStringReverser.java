package com.sts;

public class SubStringReverser {

	public static final int MIN_LENGTH = 1;
	public static final int MAX_LENGTH = 2000;

	public String reverse(String input) {
		char[] stringInChars = input.toCharArray();
		/* start validation */

		/* validating the input's length */
		if (stringInChars.length < MIN_LENGTH || stringInChars.length > MAX_LENGTH) {
			throw new RuntimeException(
					"string input's length should ranged between '" + MIN_LENGTH + "' and '" + MAX_LENGTH + "'");
		}

		/* validate containing only lower case English characters and parentheses */
		for (Character ch : stringInChars) {
			if (ch != '(' && ch != ')' && (ch < 'a' || ch > 'z')) {
				throw new RuntimeException(
						"string input should contain only lower case English characters and parentheses");
			}
		}

		/* validating that the parentheses are valid */
		int cntOpen = 0, cntClose = 0;
		for (Character c : stringInChars) {
			if (c == '(') {
				cntOpen++;
			} else if (c == ')') {
				cntClose++;
			}
			if ((cntClose > cntOpen) || (cntOpen > cntClose + 1)) {
				throw new RuntimeException("UnBlanced Parenthesis");
			}
		}
		if (cntOpen != cntClose) {
			throw new RuntimeException("UnBlanced Parenthesis");
		}

		/* end validation */

		/* start process */
		StringBuilder resultBuilder = new StringBuilder();
		for (int i = 0; i < stringInChars.length; i++) {
			resultBuilder.append(stringInChars[i]);
			if (stringInChars[i] == '(') {
				StringBuilder toBeReversed = new StringBuilder();
				i++;
				while (stringInChars[i] != ')') {
					toBeReversed.append(stringInChars[i++]);
				}

				/* reversing the substring between the parentheses */
				toBeReversed.reverse();

				/* appending the reversed substring and the closing parentheses ')' */
				resultBuilder.append(toBeReversed).append(stringInChars[i]);
			}
		}
		/* end process */
		return resultBuilder.toString();
	}

}
