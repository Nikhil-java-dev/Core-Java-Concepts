package finalKeyword.finalVariable;

public class LocalVariable {
	public static void main(String[] args) {
		final int x = 50;
		System.out.println("Value of x: " + x);
		//x = 100; // This will cause a compilation error because x is final
		final int A;// Declaration of final variable A it known as blank final variable
		A = 200;
		System.out.println("Value of A: " + A);// This is valid as A is assigned only once
	}
}
