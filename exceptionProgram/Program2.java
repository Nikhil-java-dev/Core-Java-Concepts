package exceptionProgram;

import java.util.Scanner;

public class Program2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a: ");
		int a = sc.nextInt();
		System.out.println("Enter b: ");
		int b = sc.nextInt();
		System.out.println("Enter index: ");
		int index = sc.nextInt();
		System.out.println(a + " + " + b + " = " + (a + b));
		System.out.println(a + " - " + b + " = " + (a - b));
		try {
			System.out.println(a + " / " + b + " = " + (a / b));
			System.out.println("abc".charAt(index));
			System.out.println("Inside Try Block");
		}catch(ArithmeticException e) {
			System.out.println("Infinity");
			System.out.println(e.getMessage());
		}
		System.out.println(a + " * " + b + " = " + (a * b));
		sc.close();
		System.out.println("End of the Program");
	}
}
