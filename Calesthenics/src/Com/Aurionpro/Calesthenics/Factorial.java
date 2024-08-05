package Com.Aurionpro.Calesthenics;

import java.util.Scanner;

public class Factorial {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.println("Enter number: ");
		int number = scanner.nextInt();

		int factorial = calculateFactorial(number);
		if (factorial == -1)
			System.out.println("Cannot calculate factorial");
		System.out.println("Factorial is: " + factorial);
	}

	private static int calculateFactorial(int number) {
		if (number == 0)
			return 1;
		if (number < 0)
			return -1;
		int factorial = 1;
		for (int i = 1; i <= number; i++) {
			factorial *= i;
		}
		return factorial;
	}
}
