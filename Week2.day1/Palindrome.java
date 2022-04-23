package Week2.day1;

public class Palindrome {

	public static void main(String[] args) {
		String str = "madam", revStr = "";

		int strLength = str.length();

		for (int i = (strLength - 1); i >= 0; --i) { // Iterate over the String in reverse order
			revStr = revStr + str.charAt(i); // Add the char into rev
		}

		if (str.equals(revStr)) { // Compare the original String with the reversed String, if it is same then
									// print palinDrome
			System.out.println(str + " is a Palindrome String.");
		} else {
			System.out.println(str + " is not a Palindrome String.");
		}
	}
}