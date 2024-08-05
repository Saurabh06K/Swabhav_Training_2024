package com.Aurionpro.Test;

public class ExceptionTest {
	public static void main(String[] args) {
		try {
			int number1 = Integer.parseInt(args[0]);
			int number2 = Integer.parseInt(args[1]);

			double result = (number1 / number2);
			System.out.println("The result is: " + result);
		} catch (ArithmeticException exception) {
			System.out.println("Wrong input for number 2.\nIt can't be zero");
		} catch (ArrayIndexOutOfBoundsException exception) {
			System.out.println("Please provide two inputs it can't be empty");
		} catch (NumberFormatException exception) {
			System.out.println("Only integer values can be passed as input");
		} catch (Exception exception) {
			System.out.println("Something went wrong! " + exception);
		}
		finally {
			System.out.println("Inside Finally, Closing all Activities!`");
		}

		System.out.println("Exiting Main");

	}
}
