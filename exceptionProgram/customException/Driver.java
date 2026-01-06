package exceptionProgram.customException;

public class Driver {
	public static void main(String[] args) {
		Register register = new Register();
		try {
			register.checkEligibility(16);
		} catch (InvalidAgeException e) {
			e.printStackTrace();
		}
	}
}
