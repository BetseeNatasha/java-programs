package javaBasics;

import java.util.Scanner;

public class arithmeticOperations {

	public static void main(String[] args) {
		int op1, op2;
		Scanner sc = new Scanner(System.in);
		op1 = sc.nextInt();
		op2 = sc.nextInt();

		// Addition
		System.out.println("Addition of " + op1 + " and " + op2 + " is " + (op1 + op2));

		// Subtraction
		System.out.println("Subtraction of " + op1 + " and " + op2 + " is " + (op1 - op2));

		// Multiplication
		System.out.println("Multiplication of " + op1 + " and " + op2 + " is " + (op1 * op2));

		// Division
		System.out.println("Division of " + op1 + " and " + op2 + " is " + (op1 / op2));

		// Remainder
		System.out.println("Remainder of " + op1 + " and " + op2 + " is " + (op1 % op2));

	}

}
