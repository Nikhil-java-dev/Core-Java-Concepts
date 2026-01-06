package exceptionProgram.customException;

public class FirstEven {
	public static void main(String[] args) {
		int[] a = {1, 3, 5, 7, 1, 9};
		try {
			int eve = getFirstEven(a);
			System.out.println("First even number is: " + eve * eve);
		} catch (NoEvenNumberFoundException e) {
			System.out.println(e.getMessage());
			e.printStackTrace();
		}
	}
	
	public static int getFirstEven(int[] a ) throws NoEvenNumberFoundException {
		for(int i : a) {
			if(i % 2 == 0) {
				return i;
			}
		}
		throw new NoEvenNumberFoundException("No even number found in the array");
	}
}
