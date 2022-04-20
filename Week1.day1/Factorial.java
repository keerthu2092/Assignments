package week1.day1;

public class Factorial {

	public static void main(String[] args) {

		int i, fact = 1; // Declare an integer variable fact as 1

		int number = 5;// Declare input as 5

		for (i = 1; i <= number; i++) { //// Iterate from 1 to your input

			fact = fact * i; // Within the loop: Multiply fact with the iterator variable
		} // End of loop

		System.out.println("Factorial of " + number + " is: " + fact);
	}

}
