package exceptionProgram.customException;

public class Register {
	public void checkEligibility(int age) throws InvalidAgeException {
		if(age < 18) {
			throw new InvalidAgeException("Age is not valid for registration");
		} else {
			System.out.println("You are eligible to register.");
		}
	}
}
